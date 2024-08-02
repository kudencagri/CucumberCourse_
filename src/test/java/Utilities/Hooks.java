package Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;

// işlem yapmadan önce 1 kerelik birşey wep site aç yada kapat için yapılmış her
// Scneario dan önce başlar sonra after la her senaryodan sonra biter.
public class Hooks {
    @Before
    public void before(){

    }





    @After
    public void after(Scenario senaryo){
        //*** *********************************************** normal zamanda bu kapalı kalsın yoksa hata verirr RAPORLAMA plugin olduğu zanaman aç
//        if (senaryo.isFailed()){
//            TakesScreenshot ts=((TakesScreenshot) GWD.getDriver());
//            byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
//            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
//        }

        GWD.quitDriver();
    }
}
