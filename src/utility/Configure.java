package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configure {
	Properties pro;
	
	public Configure()
	{
		try {
			File src= new File("./configs/DataFile.properties");
			FileInputStream fis=new FileInputStream(src);
		 pro= new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("exception is "+e.getMessage());
		}
	}
	public String getUrl() {
		String url=pro.getProperty("url");
		//System.out.println("URL taken");
		return url;
	}
	
	public String getChromePath() {
		String path=pro.getProperty("chromedriver");
		return path;
	}
	public String getFrom() {
		String from=pro.getProperty("from");
		return from;
	
}
	public String toFly() {
		String to=pro.getProperty("to");
		return to;
}
	
}
