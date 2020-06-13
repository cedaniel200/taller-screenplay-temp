package com.cedaniel200.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static com.cedaniel200.userinterfaces.RepositorioPage.NOMBRE_REPOSITORIO;

@Subject("la pagina del repositorio es visible")
public class PaginaDelRepositorio implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return NOMBRE_REPOSITORIO.resolveFor(actor).isDisplayed();
    }

    public static PaginaDelRepositorio esVisible() {
        return new PaginaDelRepositorio();
    }
}
