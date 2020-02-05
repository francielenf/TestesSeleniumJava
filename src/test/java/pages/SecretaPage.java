package pages;

import com.sun.xml.internal.ws.api.model.MEP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecretaPage extends BasePage{


    public SecretaPage(WebDriver navegador) {
        super(navegador);
    }

    public MePage clicarMe(){
        navegador.findElement(By.className("me")).click();
        return new MePage(navegador);
    }
}
