Feature: Validar seguridad y acceso a la sábana contable

  Scenario: Acceder a la sección contable con credenciales válidas
    Given el usuario está en la página de inicio de sesión
    When el usuario inicia sesión con credenciales válidas
    Then el usuario debe acceder al contenido protegido de la sección contable

  Scenario: Intentar acceder sin autenticación o con credenciales incorrectas
    Given el usuario está en la página de inicio de sesión
    When el usuario inicia sesión con credenciales inválidas
    Then el sistema deniega el acceso y muestra un mensaje de error de autenticación

  Scenario: Verificar permisos de acceso según roles de usuario
    Given el usuario ha iniciado sesión con credenciales válidas
    When el usuario intenta acceder a funciones no permitidas por su rol
    Then el acceso a funciones no permitidas debe ser denegado