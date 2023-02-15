package test;

public class Asiento {
    //Atributos
    public String color;
    public int precio;
    public int registro;

    //Metodos
    public void cambiarColor(String color) {
        if (color.equals("rojo") || color.equals("amarillo") || color.equals("negro") || color.equals("blanco") || color.equals("verde")){
            this.color = color;
        }
    }
}
