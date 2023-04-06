import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AmazonSignIn{
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "./ext/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        //Actions act= new Actions(driver)
        
        WebElement signInButtonHover = driver.findElement(By.id("signinid"));
        
        Actions action= new Actions(driver);
      
        
	}

	String str = "toronto";
	Map<Character, Integer> map = new HashMap<>();
	
	for(int i = 0; i < str.length(); i++) {
	    char c = str.charAt(i);
	    if(Character.isLetter(c)) {
	        if(map.containsKey(c)) {
	            map.put(c, map.get(c) + 1);
	        } else {
	            map.put(c, 1);
	        }
	    }
	}
	
	System.out.println(map);




}