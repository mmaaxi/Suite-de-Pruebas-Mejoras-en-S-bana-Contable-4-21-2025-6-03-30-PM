Feature: Validar importación de datos contables

  Scenario: Importación de archivo contable
    Given que el usuario está en la página de importación de datos contables
    When sube un archivo válido con datos contables
    Then el sistema debe reconocer y cargar los datos correctamente

  Scenario: Verificación de mapeo de campos
    Given que el archivo contable ha sido cargado correctamente
    When el sistema mapea los campos del archivo
    Then cada campo debe estar asociado correctamente en la sábana contable

  Scenario: Confirmación de importación sin errores
    Given que el archivo contable ha sido cargado y mapeado correctamente
    When completa el proceso de importación
    Then no debe generar mensajes de error
    And debe mostrar un mensaje de confirmación de importación exitosa