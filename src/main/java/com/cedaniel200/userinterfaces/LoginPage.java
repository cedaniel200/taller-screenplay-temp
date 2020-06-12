package com.cedaniel200.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://github.com/login")
public class LoginPage extends PageObject {

    public static final Target NOMBRE_DE_USUARIO = Target.the("campo nombre de usuario")
            .located(By.id("login_field"));

    public static final Target CONTRASENA = Target.the("campo de contraseña")
            .located(By.id("password"));

    public static final Target INGRESAR = Target.the("Ingresar")
            .located(By.name("commit"));

    public static final Target MENSAJE_ERROR = Target.the("Mensaje de error")
            .locatedBy("#js-flash-container > .flash");
}
