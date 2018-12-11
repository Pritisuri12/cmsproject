package common;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Setupenv {
    public WebDriver driver;
    public String baseUrl;
    public  String username ;
    public  String password ;

     public void loadvariables() throws IOException {
         Properties prop=new Properties();
         String path =  Setupenv.class.getClassLoader().getResource("environment.properties").getPath();
         FileInputStream ip= new FileInputStream(path);
         prop.load(ip);
         baseUrl=prop.getProperty("url");
         username=prop.getProperty("username");
         password=prop.getProperty("password");

     }



    public void before() throws IOException {
        loadvariables();
        System.setProperty("webdriver.chrome.driver", getClass().getClassLoader().getResource("driver/mac/chromedriver").getPath());
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
    }



    public void after() {
        driver.quit();
    }

}