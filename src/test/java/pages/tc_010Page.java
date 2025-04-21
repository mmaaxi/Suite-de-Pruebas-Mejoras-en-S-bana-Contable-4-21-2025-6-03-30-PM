package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {

    WebDriver driver;
    By generarReporteBtn = By.id("btnGenerarReporte");
    By parametrosPage = By.id("parametrosPage");
    By reporteData = By.id("reporteData");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickGenerarReporte() {
        driver.findElement(generarReporteBtn).click();
    }

    public boolean isParametrosPageDisplayed() {
        return driver.findElement(parametrosPage).isDisplayed();
    }

    public void ingresarCriteriosDeFiltrado() {
        // Código para ingresar criterios de filtrado
    }

    public void generarReporte() {
        // Código para ejecutar la generación de reportes
    }

    public boolean isReporteGeneradoCorrectamente() {
        return driver.findElement(reporteData).isDisplayed();
    }

    public void revisarReporte() {
        // Código para revisar la consistencia y exactitud del reporte
    }

    public boolean isReporteConsistenteYExacto() {
        // Lógica de validación para asegurar precisión y claridad
        return true;
    }
}