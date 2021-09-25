package com.dsa.sheet.bonus.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShuffleSongs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> songs = new ArrayList<>();
		songs.add("Mere Sohneya");
		songs.add("Bekhayali");
		songs.add("Kaise Hua");
		songs.add("Pehla Pyaar");
		songs.add("Tera Ban Jaunga");
		songs.add("Yeh Aaina");
		songs.add("Tujhe Kitna Chahien Aur Hum");
		
		findNextSong(songs);
	}

	private static void findNextSong(List<String> songs) {
		// TODO Auto-generated method stub
		Random random = new Random();
		    int index = 0;
			int secondIndex = random.nextInt(songs.size());
			swap(index, secondIndex, songs);
		
		System.out.println("Current Song Playing : "+songs.get(0));
	}

	private static void swap(int index, int secondIndex, List<String> songs) {
		// TODO Auto-generated method stub
		String Originalsong = songs.get(index);
		String ShuffledSong = songs.get(secondIndex);
		
		songs.set(index, ShuffledSong);
		songs.set(secondIndex, Originalsong);
	}

}
