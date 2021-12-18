package com.bridgelabz.Hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfWords {
	HashMap<String, Integer> map = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> arrayList = new ArrayList<>();
	int count;
	
	// Method for splitting the string data.

	public void splitString() {
		System.out.println("Enter your sentence here");
		String sentence = sc.nextLine();
		String tokens[] = sentence.split(" ");

		for (String en : tokens) {
			String findWord = en.toLowerCase();
			if (map.containsKey(findWord)) {
				count = map.get(findWord);
				map.put(findWord, count + 1);
			} else {
				map.put(findWord, 1);
			}
		}

		//Here the answer is present inside the map and we need to extract the answer from 
		//the map for that we need to use entrySet here.

		for (Map.Entry<String, Integer> display : map.entrySet()) {
			String result = display.getKey() + ":" + display.getValue();
			System.out.println(result);
		}
	}

//Driver class

	public static void main(String[] args) {
		FrequencyOfWords words = new FrequencyOfWords();
		words.splitString();

	}

}
