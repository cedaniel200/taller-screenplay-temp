package com.cedaniel200.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarYEnmascarar {

    private String texto;

    public IngresarYEnmascarar(String texto) {
        this.texto = texto;
    }

    public static IngresarYEnmascarar elTexto(String texto) {
        return new IngresarYEnmascarar(texto);
    }

    public Performable en(Target elemento) {
        return instrumented(IngresarYEnmascararTarget.class, texto, elemento);
    }
}
