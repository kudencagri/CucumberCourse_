package Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
// işlem yapmadan önce 1 kerelik birşey wep site aç yada kapat için yapılmış her
// Scneario dan önce başlar sonra after la her senaryodan sonra biter.
public class Hooks {
    @Before
    public void before(){

    }
    @After
    public void after(){
        GWD.quitDriver();
    }
}
