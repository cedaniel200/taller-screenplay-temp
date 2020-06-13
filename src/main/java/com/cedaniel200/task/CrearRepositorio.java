package com.cedaniel200.task;

import com.cedaniel200.exceptions.RepositorioYaExisteError;
import com.cedaniel200.models.Repositorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static com.cedaniel200.models.Visibilidad.PUBLICO;
import static com.cedaniel200.userinterfaces.CrearNuevoRepositorioPage.*;
import static com.cedaniel200.utils.ValidadorString.noEsNuloOVacio;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class CrearRepositorio implements Task {
    private Repositorio repositorio;

    public CrearRepositorio(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    @Step("{0} crea un repositorio con la siguiente informacion #repositorio")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(repositorio.getNombre()).into(NOMBRE_REPOSITORIO));

        actor.should(seeThat(the(MENSAJE_REPOSITORIO_YA_EXISTE), isNotVisible())
                .orComplainWith(RepositorioYaExisteError.class));

        /*
        Check.whether(noEsNuloOVacio(repositorio.getDescripcion()))
                        .andIfSo(Enter.theValue(repositorio.getDescripcion()).into(DESCRIPCION_REPOSIOTRIO)),
                Check.whether(PUBLICO.equals(repositorio.getVisibilidad()))
                        .andIfSo(Click.on(REPOSITORIO_PUBLICO))
                        .otherwise(Click.on(REPOSITORIO_PRIVADO)),
        */
        actor.attemptsTo(

                Click.on(CREAR_REPOSITORIO)
        );
    }

    public static Performable conLaSiguienteInformacion(Repositorio repositorio) {
        return instrumented(CrearRepositorio.class, repositorio);
    }
}
