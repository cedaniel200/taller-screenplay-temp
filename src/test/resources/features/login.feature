@login
Feature: Login

  Scenario Outline: Login
    When <usuario> se autentica
    Then se deberia ver que la autenticacion es <resultado>
    Examples:
      | usuario | resultado |
      | Andres  | exitoso   |
      | Maria   | fallido   |