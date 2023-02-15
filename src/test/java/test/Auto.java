package test;

import java.lang.reflect.Array;

public class Auto {
    //Atributos
    public String modelo;
    public int precio;
    public Asiento[] asientos;
    public String marca;
    public Motor motor;
    public int registro;
    public static int cantidadCreados;

    //Metodos
    public int cantidadAsientos(){
        int x=0;
        for (Asiento asiento:asientos) {
            if (asiento != null){
                x++;
            }
        }
        return x;
    }
    public String verificarIntegridad(){
        if (registro == motor.registro){
            for (Asiento asiento:asientos) {
                if (asiento != null){
                    if (asiento.registro != registro){
                        return "Las piezas no son originales";
                    }
                }
            }
            return "Auto original";
        }else {
            return "Las piezas no son originales";
        }
    }
}
