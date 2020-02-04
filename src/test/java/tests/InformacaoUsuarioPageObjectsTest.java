package tests;

import Suporte.Web;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class InformacaoUsuarioPageObjectsTest {
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }
}
