package test;

public class Asiento {
    //Atributos
    public String color;
    public int precio;
    public static int registro;

    //Metodos

    public void cambiarColor(String color) {
        if (color.equals("rojo") || color.equals("amarillo") || color.equals("negro") || color.equals("blanco")){
            this.color = color;
        }
    }
}
