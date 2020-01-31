package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class informacoesUsuarioTest {

    private  WebDriver navegador;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\franciele.fagundes\\Documents\\Driver\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navegador.manage().window().maximize();

        //Navegador para página do Taskit
        navegador.get("http://www.juliodelima.com.br/taskit");
    }

    @Test
    public  void testAdicionarInformacaoDoUsuario(){
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
        navegador.findElement(By.linkText("SIGN IN")).click();
        navegador.findElement(By.linkText("SIGN IN")).click();

        //Vlidar que dentro do elemento com class "me" está o testo "Hi, Julio"
        WebElement me = navegador.findElement(By.className("me"));
        String textoNoElementoMe = me.getText();
        assertEquals("Hi, Julio", textoNoElementoMe);

        //clicar em um link que possui a class "me"
        navegador.findElement(By.className("me")).click();

        //clicar em um link que tenha o texto "MORE DATA ABOUT YOU"
        navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();

        //Clicar no botão através do seu xpath //buttom[@data-target="addmoredata"]
        navegador.findElement(By.xpath("//button[@data-target=\"addmoredata\"]")).click();

        //identififcar a popup onde está o formulario  de id addmoredata
        WebElement popupAddMoreData = navegador.findElement(By.id("addmoredata"));

        //Na combo de name "type" escolhe opção "Phone"
        WebElement campoType= popupAddMoreData.findElement(By.name("type"));
        new Select(campoType).selectByVisibleText("Phone"); // cria interface específica para combobox

        //No campo de name "contact" digitar "+5511115599"
        popupAddMoreData.findElement(By.name("contact")).sendKeys("123456789");

        //clicar no link de text "save" que está na pop up
        popupAddMoreData.findElement(By.linkText("SAVE")).click();

        //Na mensagem de id "toast-container" validar que o texto é "Your contact has been added"
        WebElement mensagemPop = navegador.findElement(By.id("toast-container"));
        String mensagempopup = mensagemPop.getText();
        assertEquals("Your contact has been added!",mensagempopup);
    }
    @After
    public void tearDown(){
        //fechar o navegador
        // navegador.close();

    }

}
