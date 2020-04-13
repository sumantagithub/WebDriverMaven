package testcases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.testng.annotations.Test;

public class WritingFiles {
	@Test
	
	public void Txt() throws IOException
	{
		
		//Stream Connectivity
		File f = new File("F:\\Selenium\\filewriting\\myTextFile.html");
		FileWriter fw= new FileWriter(f,false);
		BufferedWriter writer= new BufferedWriter(fw);
		
		//writing inside the file
		
		/*for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				int num = (int)(Math.random()*100);
				writer.write(num+ ",");
			}
			writer.newLine();
		}*/
		
		/*writer.newLine();
		writer.write("First Line");
		writer.newLine();
		writer.write("India");
		writer.newLine();
		writer.write("Way2Automation");*/
		writer.write("<html> <body> <title> Way2Automation </title> <h1> writing in html </h1> </body> </html>");
	//closing Stream
		writer.close();
		System.out.println("File Created!!!");

}}
