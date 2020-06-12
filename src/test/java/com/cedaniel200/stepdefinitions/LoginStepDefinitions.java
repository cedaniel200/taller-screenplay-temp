package com.cedaniel200.stepdefinitions;

import com.cedaniel200.models.Usuario;
import com.cedaniel200.task.Autenticar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;

import static com.cedaniel200.models.UsuarioFactory.crearUsuario;
import static com.cedaniel200.userinterfaces.HomePage.DASHBOARD;
import static com.cedaniel200.userinterfaces.LoginPage.MENSAJE_ERROR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class LoginStepDefinitions {

    @Before
    public void prepararEscenarios(){
        System.out.println("HOOK BEFORE");
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) se autentica$")
    public void autenticar(String nombre) {
        Usuario usuario = crearUsuario(nombre);
        theActorCalled(nombre).attemptsTo(
            Autenticar.alUsuario(usuario)
        );
    }

    @Then("^se deberia ver que la autenticacion es (.*)$")
    public void verificarAutenticacion(String resultado) {
        Target elemento = "exitoso".equals(resultado) ? DASHBOARD : MENSAJE_ERROR;
        theActorInTheSpotlight().should(seeThat(the(elemento), isVisible()));
    }
}
