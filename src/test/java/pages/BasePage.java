package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

//Página básica que outrar classes precisam acessar antes de tudo, criada para ser extendida por outras classes

public class BasePage {
    protected WebDriver navegador;

    public BasePage(WebDriver navegador){
        this.navegador= navegador;
    }

    public String capturarTextoToast(){
      return navegador.findElement(By.id("toast-container")).getText();

    }
}
