package SeleniumDemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
// Broken links are links or URLs that are not reachable. They may be down or not functioning due to some server error
//HTTP status codes -->2xx-URL valid, 4xx and 5xx-an invalid request,4xx-client side error, 5xx- response error.
	
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		//implicit wait for 10sec
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		//Open URL Homepage
		driver.get("http://www.zlti.com");
	
		//wait
		Thread.sleep(5000);
		
		//capture link from webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//number of links
		System.out.println("No.of links:=" +links.size());
	
		for (int i=0; i<links.size(); i++);{
			
		//by using href attribute we can get URL of required link	
			int i = 0;
			WebElement element =links.get(i);
		String url=	element.getAttribute("href");
		URL Brokenlink =new URL (url);
		
		//create a coonection using url object link
		HttpURLConnection httpConn = (HttpURLConnection) Brokenlink.openConnection();
		
		Thread.sleep(2000);
		
		//establish connection 
		httpConn.connect();
		
		//return response if response code is above 400: broken link
		int rescode = httpConn.getResponseCode();
		
		
		
		if (rescode>=400)
				{
				System.out.println(url + " - " + "is broken link");
				}
		
		else
				{
				System.out.println(url + " - " + "is valid link");
				}
		
		driver.close();
		}
		
		
		
		
	}

}
