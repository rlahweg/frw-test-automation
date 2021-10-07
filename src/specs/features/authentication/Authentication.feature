Feature: Authentification - OrangeHRM
  ETQ utilisateur je souhaite m'authentifier

  @connexion
  Scenario: Connexion sur OrangeHRM
    Given je me connecte sur l'application OrangeHRM
    When je saisie username "Admin"
    And je saisie le mot de passe "pswd"
    And je clique sur le bouton login
    Then je me redirige vers la page home "Welcome"
