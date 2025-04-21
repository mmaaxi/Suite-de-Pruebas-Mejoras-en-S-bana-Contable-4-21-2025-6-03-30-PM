Feature: Validar exportación de datos a formatos compatibles

  Scenario: Exportar datos desde la sábana contable
    Given El usuario está en la página de la sábana contable
    When Selecciona la opción de exportar datos
    Then La opción de exportación se activa sin errores
    When Exporta los datos en formato Excel y PDF
    Then El archivo exportado contiene todos los datos esperados con el formato correcto
    When Abre el archivo exportado para verificar la integridad de la información
    Then Todos los datos están presentes y se visualizan correctamente en el archivo exportado