package com.cedaniel200.stepdefinitions;

import com.cedaniel200.models.Repositorio;
import com.cedaniel200.questions.PaginaDelRepositorio;
import com.cedaniel200.task.Autenticar;
import com.cedaniel200.task.CrearRepositorio;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;

import static com.cedaniel200.models.UsuarioFactory.porDefecto;
import static com.cedaniel200.userinterfaces.HomePage.NUEVO_REPOSITORIO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearRepositorioStepDefinitions {

    @Given("^(.*) se autentica en GitHub$")
    public void autenticar(String nombre) {
        theActorCalled(nombre).attemptsTo(
                Autenticar.alUsuario(porDefecto())
        );
    }

    @When("^[a-zA-Z]{3,40} crea un repositorio$")
    public void crearRepositorio() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(NUEVO_REPOSITORIO),
                CrearRepositorio.conLaSiguienteInformacion(new Repositorio("UnRepositorio"))
        );
    }

    @Then("^[a-zA-Z]{3,40} deberia ver la pagina del repositorio$")
    public void verificarRepositorioCreado() {
        theActorInTheSpotlight().should(seeThat(PaginaDelRepositorio.esVisible()));
    }

    @After
    public void cerrar(){
        System.out.println("HOOK AFTER");
    }

}
