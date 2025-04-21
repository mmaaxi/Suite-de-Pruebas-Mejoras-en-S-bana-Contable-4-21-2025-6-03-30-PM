package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page financialPage = new tc_009Page();

    @Given("el usuario accede al módulo financiero y selecciona datos de la sábana contable")
    public void accederModuloFinanciero() {
        financialPage.navigateToFinancialModule();
        Assert.assertTrue(financialPage.selectAccountDataSheet());
    }

    @When("realiza actualizaciones en el módulo financiero")
    public void realizarActualizaciones() {
        Assert.assertTrue(financialPage.updateFinancialData());
    }

    @Then("los cambios se reflejan en la sábana contable correctamente")
    public void verificarActualizaciones() {
        Assert.assertTrue(financialPage.verifyUpdatedData());
    }

    @When("verifica la sincronización de datos en tiempo real entre módulos")
    public void verificarSincronizacion() {
        Assert.assertTrue(financialPage.checkRealTimeDataSync());
    }

    @Then("la integración es fluida y no se presentan discrepancias en los datos")
    public void comprobarIntegracion() {
        Assert.assertTrue(financialPage.confirmDataIntegrationFluency());
    }
}