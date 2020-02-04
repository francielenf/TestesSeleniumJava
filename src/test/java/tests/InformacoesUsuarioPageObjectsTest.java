package tests;

import Suporte.Web;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class InformacoesUsuarioPageObjectsTest {
    private WebDriver navegador;

    @Before
    public void setUp(){

        navegador = Web.createChrome();
    }

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario(){
        new LoginPage(navegador)
                .clickSignIn()
                .typeLogin("julio0001")
                .typePassword("123456");

    }

    @After
    public void tearDown(){
        navegador.quit();
    }
}
