Feature: Visualización de la Sábana Contable

  Scenario: Validar visualización de la sábana contable
    Given el usuario navega a la aplicación
    When el usuario accede a la sección de la sábana contable
    Then la sábana contable se muestra correctamente sin errores
    And todos los elementos de UI (tablas, gráficos y botones) se cargan de forma adecuada
    And la presentación del contenido cumple con el diseño y especificaciones técnicas