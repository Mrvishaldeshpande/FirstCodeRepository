package Base;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ReadProperties extends Base {
	
	
	
	public  ReadProperties () throws Exception 
	{
		//File path store in f variable object
		File f= new File("E:\\Eclipse Backup\\eclpise_data\\eclipse-workspace\\TestNG\\src\\main\\java\\Base\\Base.properties");
					   
		//Loading file in inputstream fi object
		FileInputStream fi = new FileInputStream(f);
		//creating object
		prop = new Properties();
		// Loading fi object into properties
		prop.load(fi);
		
	
	}

	public static void geturl() 
	{
		try {
			ReadProperties r = new ReadProperties();
			r.toString();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.get(prop.getProperty("URL"));
	
	}
	
	
	

}
