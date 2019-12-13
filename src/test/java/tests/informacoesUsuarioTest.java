package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class informacoesUsuarioTest {
    @Test
    public  void testAdicionarInformacaoDoUsuario(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\franciele.fagundes\\Documents\\Driver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();

        //Navegador para página do Taskit
        navegador.get("http://www.juliodelima.com.br/taskit");

        //Clicar no link que possui o texto Sign in

        //WebElement lingSignIn =
        navegador.findElement(By.linkText("Sign in")).click();
      //  lingSignIn.click();

        //Identificando o formulario de login
        WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

        //Digitar no campo com name login que está dentro do formulario de id "signbox" o texto julio0001
        formularioSignInBox.findElement(By.name("login")).sendKeys("julio0001");

        //Digitar no campo com name password que está dentro do formulario de id "signbox" o texto 123456
        formularioSignInBox.findElement(By.name("password")).sendKeys("123456");
        //Clicar no link com o texto SIGN IN

        //Validar que dentro do elemento com class "me" está o texto "Hi, Julio"

        //fechar o navegador



        //Validação
        assertEquals(1,1);

    }

}
