package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class tc_004Page {
  private WebDriver driver;

  public tc_004Page(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void clickExportOption() {
    // Lógica para hacer clic en la opción de exportar
  }

  public void verifyExportOptionIsActive() {
    // Lógica para verificar que la opción de exportación está activa
  }

  public void exportData(String format) {
    // Lógica para exportar datos en el formato especificado (Excel o PDF)
  }

  public void verifyExportedFilesContent() {
    // Lógica para verificar el contenido de los archivos exportados
  }

  public void openExportedFilesForVerification() {
    // Lógica para abrir los archivos exportados
  }

  public void verifyDataIntegrityInExportedFiles() {
    // Lógica para verificar la integridad de los datos en los archivos exportados
  }
}