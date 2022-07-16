package com.example.pruebasunitarias;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validar {

    public static boolean validateEmpty(String value) {
        if (value.isEmpty()) { return true; }
        return false;
    }
    public static boolean validateEmail(String value) {

        String contraseña = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(contraseña);
        Matcher matcher = pattern.matcher(value);

        if (matcher.matches()) {
            return true;
        }
        return false;
    }
    public static boolean validateUser(String email, String password) {
        String correo = "calpic95@gmail.com";
        String contrasena = "*calpic90";

        if (email.equals(correo) && password.equals(contrasena)) {
            return true;
        }
        return false;


    }
}
