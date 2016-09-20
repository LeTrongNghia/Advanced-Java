package Task2;

import java.io.Serializable;

/**
 * @author Le Trong Nghia
 * @date Sep 19, 2016
 * @version 1.0
 * @description class for cd
 */
public class CD implements Serializable{
	private int id;
	private String name;
	private String singer;
	private int numberOfSongs;
	private double price;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumberOfSongs() {
		return numberOfSongs;
	}

	public void setNumberOfSongs(int numberOfSongs) {
		this.numberOfSongs = numberOfSongs;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/*
	 * cóntructor is not id
	 */
	public CD(String name, String singer, int numberOfSongs, double price) {
		super();
		this.name = name;
		this.singer = singer;
		this.numberOfSongs = numberOfSongs;
		this.price = price;
	}
	
	/*
	 * constructor is full
	 */
	public CD(int id,String name, String singer, int numberOfSongs, double price) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.numberOfSongs = numberOfSongs;
		this.price = price;
	}
	
	/*
	 * constructor is empty
	 */
	public CD(){
		
	}
	
	/*
	 * use to print information cd
	 * output String
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id: " + this.id + "\tName: " + this.name + "\tSinger: " + this.singer 
				+ "\tNumber of songs: " + this.numberOfSongs + "\tPrice: " + this.price;
	}
}
