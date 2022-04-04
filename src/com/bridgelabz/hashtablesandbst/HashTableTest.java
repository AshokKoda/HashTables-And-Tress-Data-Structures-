package com.bridgelabz.hashtablesandbst;

import java.util.Arrays;
import java.util.LinkedHashSet;

import org.junit.Assert;
import org.junit.Test;

public class HashTableTest {

	@Test
	public void frequencyWordTest() {
		String sentence = "To to be or not to be";
		String[] words = sentence.toLowerCase().split(" ");
		String result = "";
		MyHashMap<String, Integer> hashMap = new MyHashMap<>();
		for (String word : words) {
			Integer value = hashMap.get(word);
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			hashMap.add(word, value);
		}

		LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(words));
		for (String word : set) { // Convert to string
			result = result + word + " : " + hashMap.get(word) + "\n";
		}
		System.out.println(result);

		Integer frequency = hashMap.get("be");
		Integer expectedValue = 2;
		Assert.assertEquals(expectedValue, frequency);
	}
}
