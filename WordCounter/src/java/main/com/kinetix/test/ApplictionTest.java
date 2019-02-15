package com.kinetix.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ApplictionTest {
	
	@InjectMocks
	WordCounter wordCounter;

	    @Test
	    public void wordCountSuccessTest()
	    {
		    wordCounter.addWords("flower");
		    wordCounter.addWords("flowergs78789");
			wordCounter.addWords("florcs");
			wordCounter.addWords("blue");
			wordCounter.addWords(" ");
           assertEquals(3, wordCounter.getWordCount());
           System.out.println("WordCount is : "+wordCounter.getWordCount());
	    }
	    
	    @Test
	    public void wordCountFailureTest()
	    {
		    wordCounter.addWords("flower");
		    wordCounter.addWords("flowergs78789");
			wordCounter.addWords("florcs");
			wordCounter.addWords("blue");
			wordCounter.addWords(" ");
           assertEquals(5, wordCounter.getWordCount());
           System.out.println("WordCount is : "+wordCounter.getWordCount());
	    }
}
