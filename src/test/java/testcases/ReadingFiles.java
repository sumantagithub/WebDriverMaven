package testcases;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class ReadingFiles {
	@Test
	public void readFromFiles() throws IOException
	{
		//Connecting Stream
		File f = new File("F:\\Selenium\\filewriting\\myTextFile.txt");
		FileReader fr= new FileReader(f);
		BufferedReader reader=new BufferedReader(fr);
		
		//Reading from Text Files
		String line = null;
		while((line=reader.readLine())!=null) 
		{	
	     System.out.println(line);}
		reader.close();
	}

}
