package learningSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchGmail {

	// learningSelenium.LaunchGmail
	// public static void main(String[] args) throws InterruptedException {
	@Test
	public void testdan() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// WebDriver driver = new WebDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		long timeElapsedMillis=0;
		long timeElapsed;
		long start;
		long finish;

		
		for (int i=0; i<5; i++) {
			System.out.println("Start Loop #" + i);
			start = System.nanoTime();
			
			driver.get("https://www.gmail.com");
			Thread.sleep(500);
			finish = System.nanoTime();
			timeElapsed = finish - start;
			timeElapsedMillis = TimeUnit.NANOSECONDS.toMillis(timeElapsed);
			System.out.println("Time Elapsed: " + timeElapsedMillis + " milliseconds");
			
		
			
			driver.get("https://www.scchess.com/");
			Thread.sleep(500);
			finish = System.nanoTime();
			timeElapsed = finish - start;
			timeElapsedMillis = TimeUnit.NANOSECONDS.toMillis(timeElapsed);
			System.out.println("Time Elapsed: " + timeElapsedMillis + " milliseconds");
			Thread.sleep(1500);


			driver.get("https://app.revopay.com/login");
			Thread.sleep(500);
			finish = System.nanoTime();
			timeElapsed = finish - start;
			timeElapsedMillis = TimeUnit.NANOSECONDS.toMillis(timeElapsed);
			System.out.println("Time Elapsed: " + timeElapsedMillis + " milliseconds");
			Thread.sleep(1500);
			
		}
		
		driver.close();

	}

}
