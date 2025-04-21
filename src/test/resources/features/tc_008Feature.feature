Feature: Validar mensajes de error y manejo de excepciones

  Scenario: Ingresar datos erróneos en formularios
    Given el usuario está en el formulario de importación
    When el usuario ingresa datos erróneos
    Then el sistema muestra mensajes de error claros y específicos

  Scenario: Verificar manejo de excepciones durante una transacción
    Given el usuario inicia una transacción
    When ocurre una excepción en el sistema
    Then el flujo de la aplicación continúa sin interrupciones

  Scenario: Simular fallos en la conexión con la base de datos
    Given el sistema está activo
    When ocurre un fallo en la conexión con la base de datos
    Then se informa al usuario sin comprometer la estabilidad del sistema