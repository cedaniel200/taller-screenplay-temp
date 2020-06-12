@crearRepositorio
Feature: Crear Repositorio
  Yo como usuario con cuenta gratuita de GitHub quiero crear un repositorio para versionar mi codigo fuente

  Scenario: Crear Repositorio Exitosamente
    Given Andres se autentica
    When Andres crea un repositorio
    Then Andres deberia ver la pagina del repositorio