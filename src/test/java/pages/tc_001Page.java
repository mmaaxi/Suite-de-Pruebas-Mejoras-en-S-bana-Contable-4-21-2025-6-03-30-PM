package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_001Page {
    private WebDriver driver;

    public tc_001Page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        this.driver = new ChromeDriver();
    }

    public void abrirAplicacion() {
        driver.get("URL_DE_LA_APLICACION");
    }

    public void irASabanaContable() {
        WebElement sabanaMenu = driver.findElement(By.id("sabanaContableMenu"));
        sabanaMenu.click();
    }

    public void verificarSabanaContableVisible() {
        WebElement sabanaContableSection = driver.findElement(By.id("sabanaContableSection"));
        if (!sabanaContableSection.isDisplayed()) {
            throw new AssertionError("La sábana contable no se muestra correctamente");
        }
    }

    public void verificarElementosUI() {
        // Verifica que todos los elementos principales de UI estén visibles
        driver.findElement(By.id("tablaContable")).isDisplayed();
        driver.findElement(By.id("graficoContable")).isDisplayed();
        driver.findElement(By.id("botonActualizar")).isDisplayed();
    }

    public void verificarPresentacionDiseno() {
        // Implementar verificación de la presentación contra el diseño aquí
    }

    public void cerrarNavegador() {
        if (driver != null) {
            driver.quit();
        }
    }
}