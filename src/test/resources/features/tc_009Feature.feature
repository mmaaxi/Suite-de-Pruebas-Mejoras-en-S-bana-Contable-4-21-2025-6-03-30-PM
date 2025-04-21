Feature: Validar integración con el módulo financiero

  Scenario: Integración correcta del módulo financiero con la sábana contable
    Given el usuario accede al módulo financiero y selecciona datos de la sábana contable
    When realiza actualizaciones en el módulo financiero
    Then los cambios se reflejan en la sábana contable correctamente
    When verifica la sincronización de datos en tiempo real entre módulos
    Then la integración es fluida y no se presentan discrepancias en los datos