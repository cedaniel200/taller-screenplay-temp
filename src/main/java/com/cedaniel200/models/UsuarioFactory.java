package com.cedaniel200.models;

public class UsuarioFactory {

    private static final String ANDRES = "Andres";
    private static final String MARIA = "Maria";

    public static Usuario porDefecto(){
        return new Usuario(System.getProperty("usuario"), System.getProperty("contrasena"));
    }

    public static Usuario crearUsuario(String nombre){
        if(ANDRES.equals(nombre)){
            return new Usuario("Tu_Usuario", "Tu_contrasena");
        } else if(MARIA.equals(nombre)) {
            return new Usuario("otroUsuario", "123456");
        } else {
            throw new IllegalArgumentException();
        }
    }
}
