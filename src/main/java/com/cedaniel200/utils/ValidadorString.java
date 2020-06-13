package com.cedaniel200.utils;

public class ValidadorString {
    public static boolean noEsNuloOVacio(String texto){
        return !(texto == null || texto.isEmpty());
    }
}
