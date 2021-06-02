package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AdicionarEnderecoPage;
import pages.RealizarLoginPage;
import utils.Utils;

public class AdicionarEnderecoTest {

    private WebDriver driver;
    private RealizarLoginPage realizarLoginPage;
    private AdicionarEnderecoPage adicionarEnderecoPage;

    @Before
    public void inicializa() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        realizarLoginPage = new RealizarLoginPage(driver);
        adicionarEnderecoPage = new AdicionarEnderecoPage(driver);
    }

    @Test
    public void adicionarEndereco() {
        realizarLoginPage.RealizarLogin();
        adicionarEnderecoPage.adicionarEndereco();
    }

    @After
    public void afterCenario() {
        driver.quit();
    }

}
