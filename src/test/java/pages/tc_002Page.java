package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {

    WebDriver driver;

    By botonSubirArchivo = By.id("uploadButton");
    By confirmacionCarga = By.id("loadConfirmation");
    By botonMapeoCampos = By.id("mapFieldsButton");
    By confirmacionMapeoCampos = By.id("mappingConfirmation");
    By mensajeError = By.className("error");
    By mensajeExitoso = By.id("successMessage");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaDeImportacion() {
        driver.get("http://url_de_la_pagina_de_importacion");
    }

    public void subirArchivoContable(String rutaArchivo) {
        WebElement uploadElement = driver.findElement(botonSubirArchivo);
        uploadElement.sendKeys(rutaArchivo);
    }

    public boolean datosCargadosCorrectamente() {
        return driver.findElement(confirmacionCarga).isDisplayed();
    }

    public void mapearCampos() {
        driver.findElement(botonMapeoCampos).click();
    }

    public boolean camposMapeadosCorrectamente() {
        return driver.findElement(confirmacionMapeoCampos).isDisplayed();
    }

    public void completarImportacion() {
        // Asumimos algún proceso adicional para completar la importación
    }

    public boolean sinErrores() {
        return driver.findElements(mensajeError).isEmpty();
    }

    public boolean mostrarMensajeConfirmacion() {
        return driver.findElement(mensajeExitoso).isDisplayed();
    }
}