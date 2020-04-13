package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestCase15 {
	@Test
	
	public void PropertiesExcel() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\testcases\\object.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
		System.out.println(System.getProperty("user.dir"));
		
	}

}
