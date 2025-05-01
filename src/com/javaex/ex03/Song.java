package com.javaex.ex03;

public class Song {
	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;

	// 생성자
	public Song() {
		System.out.println("Song(파라미터 0개)");
	}

	public Song(String title, String artist, String album, String composer, String year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("Song(파라미터 5개)");
	}

	public Song(String title, String artist, String album, String composer, String year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		System.out.println("Song(파라미터 6개)");
	}

}
