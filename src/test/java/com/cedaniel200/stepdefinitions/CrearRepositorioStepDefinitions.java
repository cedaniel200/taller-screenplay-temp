package com.cedaniel200.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearRepositorioStepDefinitions {

    @When("^[a-zA-Z]{3,40} crea un repositorio$")
    public void crearRepositorio() {
        theActorInTheSpotlight().attemptsTo(
                // Repositorio
                // ACA VA SU TAREA
        );
    }

    @Then("^[a-zA-Z]{3,40} deberia ver la pagina del repositorio$")
    public void verificarRepositorioCreado() {

    }

    @After
    public void cerrar(){
        System.out.println("HOOK AFTER");
    }

}
