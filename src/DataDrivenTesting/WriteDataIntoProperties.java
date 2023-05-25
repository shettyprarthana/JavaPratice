package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataIntoProperties {
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
		
		//step4: write data into Properties object
		property.put("user2", "trainee");
		property.put("pwd2", "trainee");
		
		//step5:save the data written to Properties object
		FileOutputStream fos= new FileOutputStream("./TestResources/data.properties");
		property.store(fos, "Updated Successfully");
		
			
		
	}
}
