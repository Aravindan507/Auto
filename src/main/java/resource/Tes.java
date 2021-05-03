package resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tes {
	public WebDriver driver;
	
	public WebDriver browserInit() throws IOException
	{
		Properties p = new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\ExcelDriven\\src\\main\\java\\resource\\dat.properties");
		p.load(fis);
		
		if(p.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\eclipse_work\\chromedriver.exe");
			driver = new ChromeDriver();
		
		}
		else
		{
			System.out.println("not chorme is selected");
		}
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		return driver;
		
		
		
		
		
		
		
	}
	
	
	
	

}
