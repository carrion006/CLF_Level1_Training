package com.lab4.assignments;

import java.util.Objects;

abstract class item{

	private int idNum, numCopies;
	private String title;



	public item() {
		super();
		idNum = 0;
		title = "";
		numCopies = 0;
	}


	public item(int idNum, int numCopies, String title) {
		super();
		this.idNum = idNum;
		this.numCopies = numCopies;
		this.title = title;
	}


	public int getIdNum() {
		return idNum;
	}


	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}


	public int getNumCopies() {
		return numCopies;
	}


	public void setNumCopies(int numCopies) {
		this.numCopies = numCopies;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	public void checkIn() {
		numCopies = numCopies +1;
	}

	public void checkOut() {
		numCopies = numCopies -1;
	}

	public void addItem(int idNum, String title, int copies) {
		setIdNum(idNum);
		setTitle(title);
		setNumCopies(copies);
	}
	public void addItem() {
		numCopies++;
	}


	@Override
	public String toString() {
		return "item [idNum=" + idNum + ", numCopies=" + numCopies + ", title=" + title + "]";
	}

	public void print() {
		System.out.println("Title:"+title);
		System.out.println("Id:"+idNum);
		System.out.println("Number of copies:"+numCopies);
	}


	@Override
	public int hashCode() {
		return Objects.hash(idNum, numCopies, title);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		item other = (item) obj;
		return idNum == other.idNum && numCopies == other.numCopies && Objects.equals(title, other.title);
	}

}

public class BookDemo extends WrittenItem{

	public BookDemo() {
		super();
	}

	public BookDemo(int id, String title, int copies) {
		super();
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		BookDemo otherBook = (BookDemo) obj;
		return super.equals(otherBook);
	}

	@Override
	public String toString() {
		return  super.toString();
	}

	public int getIdNum() {
		return super.getidNum();
	}

	public String getTitle() {
		return super.getTitle();
	}

	public int getNumCopies() {
		return super.getNumCopies();
	}

	public String getAuthor() {
		return super.getAuthor();
	}
	public void print() {
		System.out.println("Display info about a book:");
		super.print();
	}

	public void checkIn() {
		super.checkIn();
	}

	public void checkOut() {
		super.checkOut();
	}

	public void addItem() {
		super.addItem();
	}

}

class JournalPaper extends WrittenItem{

	private int pubYear;
	private int yearPub;
	
	public JournalPaper() {
		super();
	}
	
	public JournalPaper(int id, String title, int copies, String author, int year) {
		super();
		this.pubYear = year;
	}
	
	public String toString() {
		return super.toString() +"Year published: "+ this.pubYear;
	}
	
	public int getIdNum() {
		return super.getidNum();
	}

	public String title() {
		return super.getTitle();
	}

	public int numCopies() {
		return super.getNumCopies();
	}

	public String getAuthor() {
		return super.getAuthor();
	}

	public int yearPub() {
		return yearPub;
	}
	
	public void print() {
		super.print();
		System.out.println("Year published: " + pubYear);
	}

	public void checkIn() {

	}

	public void checkOut() {

	}

	public void addItem() {
		super.addItem();
	}
	
}

abstract class MediaItem{
	private int runTime;
	
	class Video extends MediaItem{
		private String director;
		private String genre;
		private int year;
	}
	
	class CD extends MediaItem{
		private String artist;
		private String genre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(runTime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MediaItem other = (MediaItem) obj;
		return runTime == other.runTime;
	}
	
}

abstract class WrittenItem extends item{

	private String author;
	
	

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getidNum() {
		// TODO Auto-generated method stub
		return super.getIdNum();
	}

	public int getNumCopies() {
		// TODO Auto-generated method stub
		return super.getNumCopies();
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return super.getTitle();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(author);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WrittenItem other = (WrittenItem) obj;
		return Objects.equals(author, other.author);
	}
	
	

}
