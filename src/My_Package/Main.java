package My_Package;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter your input => 1.Google Chrome 2.Microsoft Edge");
		Scanner scan = new Scanner(System.in);
		ScreenShot sh = new ScreenShot();
		
		int val = scan.nextInt();
		Browser bw = new Browser();
		WebDriver driver;
		if(val==1) {
			driver = bw.setGoogleBrowser();  // creating a Chrome driver
		}
		else {
			driver = bw.setEdgeBrowser(); // creating a Edge driver
		}
		scan.close();
		Thread.sleep(1000);
		String originalWindow = driver.getWindowHandle();
		
		driver.manage().window().maximize();     // maximizing the window size
		openAmazon amazon = new openAmazon();         
		System.out.println("Amazon Opens in Browser");
		
		amazon.openAmazonWeb(driver);   // opening Amazon Shopping Site
		
		implicitWait iw = new implicitWait();
		iw.implicitWaitMethod(driver);           // implicit wait to load the entire web-site
		
		Search search = new Search();
		Highlights.highlight(driver, driver.findElement(By.id("twotabsearchtextbox")));    //highlighting the search box
		Highlights.highlight(driver, driver.findElement(By.id("nav-search-submit-button")));   //highlighting the search button
		sh.takeSnapShot(driver, "C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\Amazon_Automation\\Output_Screenshots\\output_1.png");
		search.searchItem_1(driver);  // searching the product
		
		ScrollPage sp = new ScrollPage();   // scrolling down the page
		sp.Scroll_2(driver);
		
		Thread.sleep(1000);
		
		SelectFirstProduct first = new SelectFirstProduct();   // selecting the first product
		sh.takeSnapShot(driver, "C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\Amazon_Automation\\Output_Screenshots\\output_2.png");
		
		first.selectProduct(driver);
		
		Thread.sleep(1000);
		
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));     // switching control to the next tab
		Thread.sleep(2000);
		
		//iw.implicitWaitMethod(driver);  // wait for loading the webpage
		
		sp.Scroll_2(driver);   // scrolling down the page
		
		AddToCart cart = new AddToCart();   // adding the product to the cart
		sh.takeSnapShot(driver, "C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\Amazon_Automation\\Output_Screenshots\\output_3.png");
		Highlights.highlight(driver, driver.findElement(By.id("add-to-cart-button")));  //highlighting the add to cart button
		cart.addToCart(driver);
		
		//driver.close();
		//Thread.sleep(1000);
		
		driver.switchTo().window(originalWindow); // switching back control to the previous tab
		sp.Scroll_2(driver);
		
		SelectSecondProduct second = new SelectSecondProduct();   // selecting the second product
		sh.takeSnapShot(driver, "C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\Amazon_Automation\\Output_Screenshots\\output_4.png");
		
		Thread.sleep(1000);
		second.selectProduct(driver);
		
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));     // switching control to the next tab
		Thread.sleep(2000);
		
		sp.Scroll_2(driver);
		
		AddToCart_2 cart_2 = new AddToCart_2();     // adding the product to the cart
		Highlights.highlight(driver, driver.findElement(By.id("add-to-cart-button")));    //highlighting the add to cart button
		sh.takeSnapShot(driver, "C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\Amazon_Automation\\Output_Screenshots\\output_5.png");
		cart_2.addToCart_2(driver);
		
		Thread.sleep(2000);
		
		// getting the total price
		String total = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[5]/div/div[2]/div[1]/div/form/div[3]/span[2]/span")).getText();
		// getting the first item price
		String a = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[5]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/ul/div/div/div[1]/p/span")).getText();
		// getting the second item price
		String b = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[5]/div/div[2]/div[1]/div/form/div[2]/div[4]/div[4]/div/div[2]/ul/div/div/div[1]/p/span")).getText();
		
		String price_1 ="";
		String price_2 ="";
		String total_price = "";
		for(int i=0;i<a.length();i++) {
			// removing other non numeric characters from first price string
			if((Character.getNumericValue(a.charAt(i))<=9 && Character.getNumericValue(a.charAt(i))>=0) || a.charAt(i)=='.') {
				price_1 = price_1 + a.charAt(i);
			}
		}
		
		for(int i=0;i<b.length();i++) {
			// removing other non numeric characters from second price string
			if((Character.getNumericValue(b.charAt(i))<=9 && Character.getNumericValue(b.charAt(i))>=0) || b.charAt(i)=='.') {
				price_2 = price_2 + b.charAt(i);
			}
		}
		
		for(int i=0;i<total.length();i++) {		
			// removing other non numeric characters from total price string
			if((Character.getNumericValue(total.charAt(i))<=9 && Character.getNumericValue(total.charAt(i))>=0) || total.charAt(i)=='.') {
				total_price = total_price + total.charAt(i);
			}
		}
		float totalPrice = (float)Float.parseFloat(total_price); 
		float firstPrice = (float)Float.parseFloat(price_1);
		float secondPrice = (float)Float.parseFloat(price_2);
		
		Thread.sleep(2000);
		
		System.out.println("The price of the First item = "+firstPrice);
		System.out.println("The price of the Second item = "+secondPrice);
		System.out.println("The total price = "+totalPrice);
		
		PriceValidation pv = new PriceValidation();
		sh.takeSnapShot(driver, "C:\\Users\\2282142\\OneDrive - Cognizant\\Desktop\\javaWS\\Amazon_Automation\\Output_Screenshots\\output_6.png");
		boolean result = pv.validateResult(firstPrice,secondPrice,totalPrice);
		if(result==true) {
			System.out.println("Result Successfully Validated.");
		}
		else {
			System.out.println("False Result");
		}
		Thread.sleep(2000);
		System.out.println("Amazon Closed");
		driver.quit();
	}

}
