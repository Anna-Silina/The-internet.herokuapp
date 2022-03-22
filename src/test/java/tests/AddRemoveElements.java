package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddRemoveElements {

    public WebDriver driver;

    
     @BeforeClass
    public void TestingsApplication(){
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
     }
     @Test
     public void AddRemoveElementsTest(){

     }

}
