Feature: Validar cálculos contables automáticos

  Scenario: Calcular y verificar totales y subtotales en la sábana contable
    Given el usuario ingresa datos contables manualmente para un periodo
    When el usuario ejecuta el proceso para calcular totales y subtotales
    Then los resultados de los cálculos concuerdan con los esperados