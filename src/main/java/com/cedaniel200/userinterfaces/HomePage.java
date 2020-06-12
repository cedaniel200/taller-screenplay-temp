package com.cedaniel200.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target DASHBOARD = Target.the("Dashboard  de la pagina de inicio")
            .located(By.id("dashboard"));
    public static final Target NUEVO_REPOSITORIO = Target.the("Nuevo repositorio")
            .located(By.linkText("New"));
}
