package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_001Page;

public class tc_001Steps {
    tc_001Page pagina;

    @Given("el usuario navega a la aplicación")
    public void elUsuarioNavegaALaAplicacion() {
        pagina = new tc_001Page();
        pagina.abrirAplicacion();
    }

    @When("el usuario accede a la sección de la sábana contable")
    public void elUsuarioAccedeAlaSeccionDeLaSabanaContable() {
        pagina.irASabanaContable();
    }

    @Then("la sábana contable se muestra correctamente sin errores")
    public void laSabanaContableSeMuestraCorrectamente() {
        pagina.verificarSabanaContableVisible();
    }

    @Then("todos los elementos de UI (tablas, gráficos y botones) se cargan de forma adecuada")
    public void todosLosElementosDeUICarganAdecuadamente() {
        pagina.verificarElementosUI();
    }

    @Then("la presentación del contenido cumple con el diseño y especificaciones técnicas")
    public void laPresentacionDelContenidoCumpleConElDiseno() {
        pagina.verificarPresentacionDiseno();
    }
}