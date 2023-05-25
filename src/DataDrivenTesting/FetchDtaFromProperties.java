package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchDtaFromProperties {

	public static void main(String[] args) throws IOException {
		//step1: convert physical file into java readable object
		//new FileInputStream() throws FileNotFoundException
		//to get the properties file path go to properties of properties file and copy the path after the project name,
		//starts with .->current directory
		FileInputStream fis=new FileInputStream("./TestResources/data.properties");
		
		//Step2: create instance for properties class
		//Properties -> java.util package
		Properties property=new Properties();
		
		//Step3: load all Key-Value pairs from fis to Properties object
		//load() throws IOException
		property.load(fis);
		//step4: fetch data from Properties object using Key
		String browser=property.getProperty("browser");
		String time=property.getProperty("timeouts");
		String url=property.getProperty("url");
		
		System.out.println(browser+"\n"+time+"\n"+url);
	}
}
