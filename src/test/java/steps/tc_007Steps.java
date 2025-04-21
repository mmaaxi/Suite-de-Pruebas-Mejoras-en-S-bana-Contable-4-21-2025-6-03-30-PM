package steps;

import org.openqa.selenium.WebDriver;
import pages.tc_007Page;
import io.cucumber.java.en.*;

public class tc_007Steps {

    WebDriver driver;
    tc_007Page tcPage;

    @Given("el usuario está en la página de inicio de sesión")
    public void el_usuario_está_en_la_página_de_inicio_de_sesión() {
        tcPage = new tc_007Page(driver);
        tcPage.navigateToLoginPage();
    }

    @When("el usuario inicia sesión con credenciales válidas")
    public void el_usuario_inicia_sesión_con_credenciales_válidas() {
        tcPage.loginWithValidCredentials();
    }

    @Then("el usuario debe acceder al contenido protegido de la sección contable")
    public void el_usuario_debe_acceder_al_contenido_protegido_de_la_sección_contable() {
        tcPage.verifyAccessToProtectedContent();
    }

    @When("el usuario inicia sesión con credenciales inválidas")
    public void el_usuario_inicia_sesión_con_credenciales_inválidas() {
        tcPage.loginWithInvalidCredentials();
    }

    @Then("el sistema deniega el acceso y muestra un mensaje de error de autenticación")
    public void el_sistema_deniega_el_acceso_y_muestra_un_mensaje_de_error_de_autenticación() {
        tcPage.verifyAuthenticationError();
    }

    @Given("el usuario ha iniciado sesión con credenciales válidas")
    public void el_usuario_ha_iniciado_sesión_con_credenciales_válidas() {
        tcPage.loginWithValidCredentials();
    }

    @When("el usuario intenta acceder a funciones no permitidas por su rol")
    public void el_usuario_intenta_acceder_a_funciones_no_permitidas_por_su_rol() {
        tcPage.tryAccessRestrictedFunctions();
    }

    @Then("el acceso a funciones no permitidas debe ser denegado")
    public void el_acceso_a_funciones_no_permitidas_debe_ser_denegado() {
        tcPage.verifyAccessDeniedForRestrictedFunctions();
    }
}