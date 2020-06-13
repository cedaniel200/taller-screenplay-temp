package com.cedaniel200.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RepositorioPage {
    public static final Target NOMBRE_REPOSITORIO = Target.the("nombre del repositorio")
            .locatedBy("//*[@id=\"js-repo-pjax-container\"]/div[1]/div/div/h1/strong/a");
}
