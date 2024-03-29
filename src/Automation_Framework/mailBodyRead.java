package Automation_Framework;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Flags.Flag;
import javax.mail.search.FlagTerm;

public class mailBodyRead {
	Properties properties = null;
	private Session session = null;
	private Store store = null;
	private Folder inbox = null;
	private String userName = "otptestmail62@gmail.com";
	private String password = "testmail@otp";

	public void readMails() throws IOException {
		properties = new Properties();
		properties.setProperty("mail.host", "imap.gmail.com");
		properties.setProperty("mail.port", "995");
		properties.setProperty("mail.transport.protocol", "imaps");
		session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, password);
			}
		});
		try {
			store = session.getStore("imaps");
			store.connect();
			inbox = store.getFolder("INBOX");
			inbox.open(Folder.READ_WRITE);
			String otp ="";
			String OTP ="";
			Message messages[] = inbox.search(new FlagTerm(new Flags(Flag.SEEN), false));
			;
			System.out.println("Number of mails = " + messages.length);
			//for (int i = messages.length; i>=0 ; i--) {
				Message message = messages[0];
				Address[] from = message.getFrom();
				//System.out.println("-------------------------------");
				//System.out.println("Date : " + message.getSentDate());
				//System.out.println("From : " + from[0]);
				//System.out.println("Subject: " + message.getSubject());
				//System.out.println("Content :");
		        //	processMessageBody(message);
				
				
				Object content = message.getContent();
				Multipart multiPart = (Multipart) content;
				int multiPartCount = multiPart.getCount();
				for (int i = 1; i < multiPartCount; i++) {
					BodyPart bodyPart = multiPart.getBodyPart(i);
					Object o;
					o = bodyPart.getContent();
					if (o instanceof String) {
						String Otp = o.toString().substring(56,63);
						System.out.println("OTP is - "+ Otp);
					}
								
				System.out.println("--------------------------------");
			//}
			inbox.close(true);
			store.close();
				}
		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public void processMessageBody(Message message) {
		try {
			Object content = message.getContent();
			// check for string
			// then check for multipart
			if (content instanceof String) {
				System.out.println(content);
			} else if (content instanceof Multipart) {
				Multipart multiPart = (Multipart) content;
				procesMultiPart(multiPart);
			} else if (content instanceof InputStream) {
				InputStream inStream = (InputStream) content;
				int ch;
				while ((ch = inStream.read()) != -1) {
					System.out.write(ch);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}  

	public void procesMultiPart(Multipart content) {
		try {
			int multiPartCount = content.getCount();
			for (int i = 1; i < multiPartCount; i++) {
				BodyPart bodyPart = content.getBodyPart(i);
				Object o;
				o = bodyPart.getContent();
				if (o instanceof String) {
					System.out.println(o);
				} else if (o instanceof Multipart) {
					procesMultiPart((Multipart) o);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	} 

	public static void main(String[] args) throws IOException{
		mailBodyRead sample = new mailBodyRead();
		sample.readMails();
	}


}

