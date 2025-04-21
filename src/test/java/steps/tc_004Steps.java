package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_004Page;

public class tc_004Steps {
  WebDriver driver;
  tc_004Page exportPage;

  @Given("El usuario está en la página de la sábana contable")
  public void el_usuario_esta_en_la_pagina_de_la_sabana_contable() {
    // Lógica para navegar a la página de la sábana contable
    exportPage = PageFactory.initElements(driver, tc_004Page.class);
  }

  @When("Selecciona la opción de exportar datos")
  public void selecciona_opcion_exportar_datos() {
    exportPage.clickExportOption();
  }

  @Then("La opción de exportación se activa sin errores")
  public void opcion_exportacion_activa_sin_errores() {
    exportPage.verifyExportOptionIsActive();
  }

  @When("Exporta los datos en formato Excel y PDF")
  public void exporta_datos_formato_excel_pdf() {
    exportPage.exportData("Excel");
    exportPage.exportData("PDF");
  }

  @Then("El archivo exportado contiene todos los datos esperados con el formato correcto")
  public void archivo_exportado_contiene_datos_esperados() {
    exportPage.verifyExportedFilesContent();
  }

  @When("Abre el archivo exportado para verificar la integridad de la información")
  public void abre_archivo_exportado_verificar_integridad() {
    exportPage.openExportedFilesForVerification();
  }

  @Then("Todos los datos están presentes y se visualizan correctamente en el archivo exportado")
  public void datos_presentes_visualizan_correctamente() {
    exportPage.verifyDataIntegrityInExportedFiles();
  }
}