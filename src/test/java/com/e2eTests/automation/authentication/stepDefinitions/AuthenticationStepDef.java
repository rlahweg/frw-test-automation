package com.e2eTests.automation.authentication.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.e2eTests.automation.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenticationStepDef {
	
	public WebDriver driver;
	public AuthenticationStepDef() {
		driver = Setup.driver;
	}
	
	@Given("^je me connecte sur l'application OrangeHRM$")
	public void jeMeConnecteSurLApplicationOrangeHRM() throws Throwable {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}

	@When("^je saisie username$")
	public void jeSaisieUsername() throws Throwable {
	
	}

	@When("^je saisie le mot de passe$")
	public void jeSaisieLeMotDePasse() throws Throwable {
	}

	@When("^je clique sur le bouton login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
	}

	@Then("^je me redirige vers la page home$")
	public void jeMeRedirigeVersLaPageHome() throws Throwable {
	}

}
