package com.kinetix.test;

public class WordCounter {
	StringBuffer wordData = new StringBuffer();

	public void addWords(String word) {
		boolean status = true;
		
		for (int i = 0; i < word.length(); i++) {
			if (!Character.isLetter(word.charAt(i))) {
				status = false;
				break;
			}
		}
		
		if (status) {
			if (wordData == null) 
				wordData.append(word);
			
				wordData.append(" ");
				wordData.append(word);
		}
	}
	
	
	public int getWordCount() {
		String[] wordCount = wordData.toString().split(" ");
		return wordCount.length - 1;

	}

}
