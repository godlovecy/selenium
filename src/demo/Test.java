package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	
	
	/**
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chenyin\\eclipse-workspace\\demo\\driver\\chromedriver.exe");
        //实例化chromedriver
        WebDriver driver = new ChromeDriver();
        //跳转到baidu首页
        driver.get("http://www.baidu.com");
        Thread.sleep(5000);
        driver.close();
}
}
