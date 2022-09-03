package firsttestcase;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String service = "C:\\Selenium\\Driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", service);
        
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(title.length());
        
        driver.close();
        
    }
    
}
