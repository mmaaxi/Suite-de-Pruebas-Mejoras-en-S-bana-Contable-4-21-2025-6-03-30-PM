package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("el sistema está preparado para el procesamiento de grandes volúmenes de datos")
    public void preparar_sistema_grandes_volumenes() {
        page.prepararSistema();
    }

    @When("simula la carga de datos con gran volumen de registros")
    public void simular_carga_datos() {
        page.simularCargaDatos();
    }

    @Then("el sistema responde sin tiempos de espera excesivos")
    public void validar_respuesta_sistema() {
        assertTrue(page.validarRespuestaSistema());
    }

    @Given("el sistema está operando bajo condiciones normales")
    public void sistema_operando_normal() {
        page.prepararSistemaNormal();
    }

    @When("ejecuta pruebas de estrés durante el proceso de importación y exportación")
    public void ejecutar_pruebas_estres() {
        page.ejecutarPruebasEstres();
    }

    @Then("el sistema mantiene la estabilidad y rendimiento bajo alta carga")
    public void validar_estabilidad_rendimiento() {
        assertTrue(page.validarEstabilidadRendimiento());
    }

    @Given("el sistema ha completado el proceso bajo alta carga")
    public void completar_proceso() {
        page.completarProcesoAltaCarga();
    }

    @When("se mide el tiempo de respuesta")
    public void medir_tiempo_respuesta() {
        page.medirTiempoRespuesta();
    }

    @Then("el tiempo de respuesta se encuentra dentro de los límites establecidos en los requerimientos de rendimiento")
    public void validar_tiempo_respuesta() {
        assertTrue(page.validarTiempoRespuesta());
    }
}