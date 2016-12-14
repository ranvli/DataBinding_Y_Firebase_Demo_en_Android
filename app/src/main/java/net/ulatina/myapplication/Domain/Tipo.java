package net.ulatina.myapplication.Domain;

/**
 * Created by ranvli on 12/14/2016.
 */

public enum Tipo {

    TC, CDP, CAHORRO, CCREDITO;

    public static Tipo Parse(String tipoProductoString) {

        switch (tipoProductoString) {
            case "TC":
                return Tipo.TC;
            case "CDP":
                return Tipo.CDP;
            case "CAHORRO":
                return Tipo.CAHORRO;
            case "CCREDITO":
                return Tipo.CCREDITO;
        }

        return null;
    }

}
