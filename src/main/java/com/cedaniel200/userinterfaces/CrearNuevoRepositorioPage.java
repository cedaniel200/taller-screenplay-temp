package com.cedaniel200.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearNuevoRepositorioPage {
    public static final Target NOMBRE_REPOSITORIO = Target.the("Campo nombre del repositorio")
            .located(By.id("repository_name"));

    public static final Target DESCRIPCION_REPOSIOTRIO = Target.the("Campo descripcion del repositorio")
            .located(By.id("repository_description"));

    public static final Target REPOSITORIO_PUBLICO = Target.the("Repositorio publico")
            .located(By.id("repository_visibility_public"));

    public static final Target REPOSITORIO_PRIVADO = Target.the("Repositorio privado")
            .located(By.id("repository_visibility_private"));

    public static final Target INICIALIZAR_REPOSITORIO_CON_README = Target
            .the("Iniciar repositorio con README")
            .located(By.id("repository_auto_init"));

    public static final Target AGREGAR_GITIGNORE = Target
            .the("Agregar .gitignore")
            .locatedBy(".my-3 > .select-menu > .btn");

    public static final Target FILTRO_GITIGNORE = Target
            .the("Filtro del gitignore").located(By.id("context-ignore-filter-field"));

    public static final String FORMATO_SELECTOR_GITIGNORE = ".filterable-active";

    public static final Target AGREGAR_LICENCIA = Target
            .the("Agregar licencia")
            .locatedBy(".btn > .text-normal");

    public static final Target FILTRO_LICENCIA = Target
            .the("Filtro de licencia")
            .locatedBy(".SelectMenu-filter > .width-full");

    public static final String FORMATO_SELECTOR_LICENCIA = "//div[@class=\"SelectMenu-list\"]//span[contains(text(), '%s')]//ancestor::label";

    public static final Target CREAR_REPOSITORIO = Target
            .the("Crear repositorio")
            .locatedBy("//*[@id=\"new_repository\"]/div[3]/button");

    public static final Target MENSAJE_REPOSITORIO_YA_EXISTE = Target
            .the("Mensaje de Error")
            .locatedBy(".error > strong");
}
