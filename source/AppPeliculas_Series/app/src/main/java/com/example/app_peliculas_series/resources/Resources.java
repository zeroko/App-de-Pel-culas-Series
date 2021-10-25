package com.example.app_peliculas_series.resources;

public interface Resources {

//    interface ALERT {
//        String NOT047 = "No es posible realizar esta acción, inténtalo más tarde";
//        String NOT012 = "La cantidad a retirar es superior a tu ahorro.";
//        String NOT049 = "No es posible realizar esta acción, inténtalo más tarde";
//        String NOT054 = "Consulta tu estado de cuenta a partir de %1$s";
//        String NOT064 = "Error de conexión, inténtalo más tarde";
//        String NOT060 = "Ingresa un monto a partir de $100";
//        String NOT061 = "Ingresa un monto menor que $300,000";
//        String NOT061100 = "Ingresa un monto menor que $100,000";
//        String NOT105 = "No se modificó ningún dato";
//        String NOT90 = "El número particular no puede ser igual al de oficina";
//        String NOT198 = "Por el momento no puedes editar más datos, hay una modificación en proceso";
//        String NOT_88 = "Número telefónico a 10 dígitos";
//        String NOT108 = "(*) Campo obligatorio";
//        String NOT89 = "Ingresa un correo electrónico válido";
//        String NOT91 = "El teléfono particular no puede ser igual al teléfono celular";
//        String NOT92 = "El teléfono oficina no puede ser igual al teléfono celular";
//        String NOT97 = "El correo electrónico opcional no puede ser igual al correo electrónico principal";
//        String NOT96 = "El correo electrónico principal no puede ser igual al correo electrónico opcional";
//        String NOT93 = "El número de oficina no puede ser igual al particular";
//        String NOT069 = "Contraseña incorrecta";
//        String NOT170 = "Celular incorrecto, verifícalo ";
//    }


    interface PreferencesKeys {
        interface PreRegister {
            String REQUEST_TOKEN= "request_token";
        }

    }

    interface Services {
        int ESTATUS_OK = 200;
        int ERROR_500 = 500;
        int ERROR_404 = 404;
    }

    interface Genero {
        String MASCULINO = "M";
        String FEMENINO = "F";
        String HOMBRE = "H";
        String MUJER = "M";
    }
}
