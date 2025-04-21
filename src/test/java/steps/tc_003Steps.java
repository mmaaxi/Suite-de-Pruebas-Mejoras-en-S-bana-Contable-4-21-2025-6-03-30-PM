import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_003Page;
import static org.junit.Assert.assertTrue;

public class tc_003Steps {
    WebDriver driver;
    tc_003Page page;

    public tc_003Steps() {
        this.driver = Hooks.driver;
        page = new tc_003Page(driver);
    }

    @Given("el usuario ingresa datos contables manualmente para un periodo")
    public void ingresarDatosContables() {
        page.openPage();
        page.enterAccountingData();
    }

    @When("el usuario ejecuta el proceso para calcular totales y subtotales")
    public void ejecutarProcesoCalculo() {
        page.calculateTotalsAndSubtotals();
    }

    @Then("los resultados de los cálculos concuerdan con los esperados")
    public void verificarResultadosCalculo() {
        assertTrue(page.verifyCalculationResults());
    }
}