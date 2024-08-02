package Utilities;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Locale;

public class GWD {
    private static WebDriver driver;

    public static WebDriver getDriver() {
           // ingilizce raporlamada lazım.
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        if(driver==null) { // ilk kez 1 defa çalışsın
            driver = new ChromeDriver();
            driver.manage().window().setPosition(new Point(-2000, 0));
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }
        return driver;
    }
    public static void quitDriver(){
        // test sonucu ekranı bir miktar beklesin
        try{
            Thread.sleep(4000);
        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
        // driver kapat
        if (driver!=null){ // driver var ise
            driver.quit();
            driver=null;
        }

    }


}
