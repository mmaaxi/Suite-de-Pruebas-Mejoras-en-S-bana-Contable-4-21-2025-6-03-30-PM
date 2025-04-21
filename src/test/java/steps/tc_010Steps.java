package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_010Page;

import static org.junit.Assert.assertTrue;

public class tc_010Steps {

    WebDriver driver;
    tc_010Page page;

    public tc_010Steps() {
        this.driver = Hooks.getDriver();
        page = new tc_010Page(driver);
    }

    @Given("El usuario está en la interfaz de la sábana contable")
    public void elUsuarioEstaEnLaInterfazDeLaSabanaContable() {
        driver.get("http://example.com/sabana-contable");
    }

    @When("Selecciono la opción para generar reportes")
    public void seleccionoLaOpcionParaGenerarReportes() {
        page.clickGenerarReporte();
    }
    
    @Then("El sistema presenta la interfaz de selección de parámetros")
    public void elSistemaPresentaLaInterfazDeSeleccionDeParametros() {
        assertTrue(page.isParametrosPageDisplayed());
    }

    @When("Ingreso criterios de filtrado y ejecuto la generación de reportes")
    public void ingresoCriteriosDeFiltradoYEjecutoLaGeneracionDeReportes() {
        page.ingresarCriteriosDeFiltrado();
        page.generarReporte();
    }

    @Then("El reporte se genera con datos precisos alineados a los criterios seleccionados")
    public void elReporteSeGeneraConDatosPrecisos() {
        assertTrue(page.isReporteGeneradoCorrectamente());
    }

    @When("Revisar la consistencia y exactitud de la información en el reporte")
    public void revisarLaConsistenciaYExactitudDelReporte() {
        page.revisarReporte();
    }

    @Then("El reporte muestra toda la información contable de forma clara y organizada")
    public void elReporteMuestraInformacionContableClaraYOrganizada() {
        assertTrue(page.isReporteConsistenteYExacto());
    }
}