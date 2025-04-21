package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_002Page;
import static org.junit.Assert.assertTrue;

public class tc_002Steps {

    WebDriver driver;
    tc_002Page tc002Page;

    @Given("que el usuario está en la página de importación de datos contables")
    public void que_el_usuario_está_en_la_página_de_importación_de_datos_contables() {
        tc002Page = new tc_002Page(driver);
        tc002Page.navegarAPaginaDeImportacion();
    }
    
    @When("sube un archivo válido con datos contables")
    public void sube_un_archivo_válido_con_datos_contables() {
        tc002Page.subirArchivoContable("datos_contables.csv");
    }
    
    @Then("el sistema debe reconocer y cargar los datos correctamente")
    public void el_sistema_debe_reconocer_y_cargar_los_datos_correctamente() {
        assertTrue(tc002Page.datosCargadosCorrectamente());
    }
    
    @Given("que el archivo contable ha sido cargado correctamente")
    public void que_el_archivo_contable_ha_sido_cargado_correctamente() {
        assertTrue(tc002Page.datosCargadosCorrectamente());
    }
    
    @When("el sistema mapea los campos del archivo")
    public void el_sistema_mapea_los_campos_del_archivo() {
        tc002Page.mapearCampos();
    }
    
    @Then("cada campo debe estar asociado correctamente en la sábana contable")
    public void cada_campo_debe_estar_asociado_correctamente_en_la_sábana_contable() {
        assertTrue(tc002Page.camposMapeadosCorrectamente());
    }
    
    @When("completa el proceso de importación")
    public void completa_el_proceso_de_importación() {
        tc002Page.completarImportacion();
    }
    
    @Then("no debe generar mensajes de error")
    public void no_debe_generar_mensajes_de_error() {
        assertTrue(tc002Page.sinErrores());
    }
    
    @Then("debe mostrar un mensaje de confirmación de importación exitosa")
    public void debe_mostrar_un_mensaje_de_confirmación_de_importación_exitosa() {
        assertTrue(tc002Page.mostrarMensajeConfirmacion());
    }
}