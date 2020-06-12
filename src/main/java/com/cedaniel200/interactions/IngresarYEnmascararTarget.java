package com.cedaniel200.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class IngresarYEnmascararTarget extends EnterValue {

    private String texto;
    private Target elemento;

    public IngresarYEnmascararTarget(String texto, Target elemento) {
        super(texto);
        this.texto = texto;
        this.elemento = elemento;
    }

    @Override
    @Step("{0} ingresa ****** en #elemento")
    public <T extends Actor> void performAs(T actor) {
        elemento.resolveFor(actor).type(texto);
        if(getFollowedByKeys().length > 0)
            elemento.resolveFor(actor).sendKeys(getFollowedByKeys());
    }
}
