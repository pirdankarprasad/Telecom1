package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
		WebDriver driver;
	public void takeScreenShot(String s) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String path = d.toString().replace(":", "_");
		File f=new File("E:\\Testing\\ScreenShots\\image_"+path+s+".jpg");
		FileHandler.copy(source, f);
		
		
	}
	}

