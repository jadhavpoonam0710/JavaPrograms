package PageLoaded;

public class CheckPageIsLoaded {
	
	 public static void main(String[] args) {
	      System.setProperty("webdriver.chrome.driver",
	      "C:\\Users\\jadhav.poonam\\Desktop\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      String url = "https://www.tutorialspoint.com/index.htm";
	      driver.get(url);
	      // Javascript executor to return value
	      JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("return document.readyState")
	      .toString().equals("complete");
	      // get the current URL
	      String s = driver.getCurrentUrl();
	      // checking condition if the URL is loaded
	      if (s.equals(url)) {
	         System.out.println("Page Loaded");
	         System.out.println("Current Url: " + s);
	      }
	      else {
	         System.out.println("Page did not load");
	      }
	      driver.quit();

}
