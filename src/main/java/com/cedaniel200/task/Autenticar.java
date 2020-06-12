package com.cedaniel200.task;

import com.cedaniel200.interactions.IngresarYEnmascarar;
import com.cedaniel200.models.Usuario;
import com.cedaniel200.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static com.cedaniel200.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autenticar implements Task {

    private LoginPage loginPage;
    private Usuario usuario;

    public Autenticar(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    @Step("{0} intenta autenticarse con los datos #usuario")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(loginPage),
                Enter.theValue(usuario.getNombreUsuario()).into(NOMBRE_DE_USUARIO),
                IngresarYEnmascarar.elTexto(usuario.getContrasena()).en(CONTRASENA),
                Click.on(INGRESAR)
        );
    }

    public static Autenticar alUsuario(Usuario usuario) {
        return instrumented(Autenticar.class, usuario);
    }

}
