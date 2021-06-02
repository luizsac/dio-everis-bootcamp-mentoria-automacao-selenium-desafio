package pages;

import org.openqa.selenium.WebDriver;
import utils.Utils;

public class AdicionarEnderecoPage {

    private WebDriver driver;
    private Utils util;

    public AdicionarEnderecoPage(WebDriver driver) {
        this.driver = driver;
        util = new Utils(driver);
    }

    public void adicionarEndereco() {
        //driver.get("http://automationpractice.com/index.php");

        util.clickPorCss("a[title='Addresses']");
        util.clickPorCss("a[title='Add an address']");
        util.preencheCampoPorId("address1", "541  Pooh Bear Lane");
        util.preencheCampoPorId("city", "Tacoma");
        util.preencheCampoPorId("id_state", "Washington");
        util.preencheCampoPorId("postcode", "98419");
        util.preencheCampoPorId("id_country", "United States");
        util.preencheCampoPorId("phone", "864-672-4089");
        util.preencheCampoPorId("phone_mobile", "425-891-5863");
        util.preencheCampoPorId("alias", "Commercial address");

        util.clickPorId("submitAddress");
    }

}
