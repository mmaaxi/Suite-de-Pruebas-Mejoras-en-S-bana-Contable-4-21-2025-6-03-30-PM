Feature: Validar rendimiento en escenarios de alto volumen de datos

  Scenario: Cargar y procesar gran volumen de datos en la sábana contable
    Given el sistema está preparado para el procesamiento de grandes volúmenes de datos
    When simula la carga de datos con gran volumen de registros
    Then el sistema responde sin tiempos de espera excesivos

  Scenario: Ejecutar pruebas de estrés durante importación/exportación
    Given el sistema está operando bajo condiciones normales
    When ejecuta pruebas de estrés durante el proceso de importación y exportación
    Then el sistema mantiene la estabilidad y rendimiento bajo alta carga

  Scenario: Documentar tiempo de respuesta
    Given el sistema ha completado el proceso bajo alta carga
    When se mide el tiempo de respuesta
    Then el tiempo de respuesta se encuentra dentro de los límites establecidos en los requerimientos de rendimiento