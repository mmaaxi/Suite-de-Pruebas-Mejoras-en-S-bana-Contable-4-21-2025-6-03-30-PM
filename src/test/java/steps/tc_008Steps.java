package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc_008Page;
import static org.junit.Assert.assertTrue;

public class tc_008Steps {
    private WebDriver driver;
    private tc_008Page page;

    @Given("el usuario está en el formulario de importación")
    public void elUsuarioEstaEnElFormularioDeImportacion() {
        page = new tc_008Page(driver);
        page.navigateToImportForm();
    }

    @When("el usuario ingresa datos erróneos")
    public void elUsuarioIngresaDatosErroneos() {
        page.enterInvalidData();
    }

    @Then("el sistema muestra mensajes de error claros y específicos")
    public void elSistemaMuestraMensajesDeErrorClarosYEspecificos() {
        assertTrue(page.isErrorMessageDisplayed());
    }
    
    @Given("el usuario inicia una transacción")
    public void elUsuarioIniciaUnaTransaccion() {
        page.startTransaction();
    }

    @When("ocurre una excepción en el sistema")
    public void ocurreUnaExcepcionEnElSistema() {
        page.simulateException();
    }

    @Then("el flujo de la aplicación continúa sin interrupciones")
    public void elFlujoDeLaAplicacionContinuaSinInterrupciones() {
        assertTrue(page.isApplicationStable());
    }
    
    @Given("el sistema está activo")
    public void elSistemaEstaActivo() {
        page.ensureSystemIsActive();
    }

    @When("ocurre un fallo en la conexión con la base de datos")
    public void ocurreUnFalloEnLaConexionConLaBaseDeDatos() {
        page.simulateDatabaseFailure();
    }

    @Then("se informa al usuario sin comprometer la estabilidad del sistema")
    public void seInformaAlUsuarioSinComprometerLaEstabilidadDelSistema() {
        assertTrue(page.isUserInformedOfDbFailure());
    }
}