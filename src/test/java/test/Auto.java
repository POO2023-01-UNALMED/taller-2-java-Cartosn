package test;

import java.lang.reflect.Array;

public class Auto {
    //Atributos
    public String modelo;
    public int precio;
    public Array[] asientos;
    public String marca;
    public Motor motor;
    public static int registro;
    public static int cantidadCreados;

    //Metodos
    //cantidadAsientos()
    public String verificarIntegridad(){
        if(Auto.registro == Asiento.registro && Motor.registro == Asiento.registro){
            return "Auto original";
        }
        return "Las piezas no son originales";
    }
}