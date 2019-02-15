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
			
           int wordCount = wordCounter.getWordCount();
         
           assertEquals(3, wordCount);
           System.out.println("WordCount is : "+wordCount);
	    }
	    
	    @Test
	    public void wordCountFailurTest()
	    {
		    wordCounter.addWords("flower");
		    wordCounter.addWords("flowergs78789");
			wordCounter.addWords("florcs");
			wordCounter.addWords("blue");
			
           int wordCount = wordCounter.getWordCount();
         
           assertEquals(4, wordCount);
           System.out.println("WordCount is : "+wordCount);
	    }
}
