package Automation_Framework;

import java.io.*;
import java.util.*;

// A class 'Movie' that implements Comparable 
class movie implements Comparable<movie> {
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	public int compareTo(movie m) {
		return this.year - m.year;
	}

	// Constructor
	public movie(String nm, double rt, int yr) {
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}
}

// Driver class
class ComparableEx {
	public static void main(String[] args) {
		ArrayList<movie> list = new ArrayList<movie>();
		list.add(new movie("Force Awakens", 8.3, 2015));
		list.add(new movie("Star Wars", 8.7, 1977));
		list.add(new movie("Empire Strikes Back", 8.8, 1980));
		list.add(new movie("Return of the Jedi", 8.4, 1983));

		Collections.sort(list);

		System.out.println("Movies after sorting : ");
		for (movie movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}
	}
}