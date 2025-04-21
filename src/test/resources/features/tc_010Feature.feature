Feature: Validar generación de reportes contables

  Scenario: Generación y revisión de reportes contables
    Given El usuario está en la interfaz de la sábana contable
    When Selecciono la opción para generar reportes
    Then El sistema presenta la interfaz de selección de parámetros

    When Ingreso criterios de filtrado y ejecuto la generación de reportes
    Then El reporte se genera con datos precisos alineados a los criterios seleccionados

    When Revisar la consistencia y exactitud de la información en el reporte
    Then El reporte muestra toda la información contable de forma clara y organizada