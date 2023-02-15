package test;

public class Motor {
    //Atributos
    public int numeroCilindros;
    public String tipo;
    public int registro;

    //Metodos
        //setters
    public void cambiarRegistro(int registro){
        this.registro = registro;
    }
    public void asignarTipo(String tipo){
        if (tipo.equals("electrico" )|| tipo.equals("gasolina")){
            this.tipo = tipo;
        }
    }
    //getter
    public int getRegistro() {
        return registro;
    }
}
