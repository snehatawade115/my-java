package utility;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotss {
	public static void main(String[] args) throws IOException {
		
		TakesScreenshot driver = null;
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("path.jpg");
		FileHandler.copy(source, destination);
	}

}
