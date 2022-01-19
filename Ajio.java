package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Ajio {
	@SuppressWarnings("deprecation")

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	 
		driver.get("https://www.ajio.com/");
		//In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		
		Thread.sleep(2000);
		// To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		//accept cookie
	//	driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		
		//print the no of items found
		String lengths = driver.findElement(By.className("length")).getText();
		System.out.println("The Total number of items is "+ lengths);
		
		
		List<WebElement> BrandList = driver.findElements(By.className("brand"));
		int BrandCount = BrandList.size();
		System.out.println("Brand Count is "+ BrandCount);
		System.out.println("The brands are");
		for( WebElement foreach: BrandList)
		{
			String name = foreach.getText();
			System.out.println(name);
		}
		
		List <WebElement> BagNameList= driver.findElements(By.className("nameCls"));
		System.out.println("BrandName Count is "+ BagNameList.size());
		System.out.println("The BagNames are");
		for( WebElement web : BagNameList)
		{
			String bagname = web.getText();
			System.out.println(bagname);
		}
		
		
		
	/*	// Print the count of the items Found.
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + totalItems);
        //Get the list of brand of the products displayed in the page and print the list.
		System.out.println(" List of Brands");
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());

		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		// Get the list of names of the bags and print it
		List<WebElement> bagNameList = driver.findElements(By.className("name"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println(" Names of the Bags");
		for (WebElement webElement : bagNameList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		*/


	}

}

