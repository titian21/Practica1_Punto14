package lab_punto14;

//Clase cuadro en la cual se declaran las variables lado y area, y los metodos setLado y Area.

public class Cuadro {
    
    private double lado = 0, area = 0;
    
    //Metodo para tener acceso a la variable privada lado.
    public void setLado(float lado) {
        this.lado = lado;
    }
    
    //Metodo para calcular el area del cuadrado utilizando la variable lado. Math es una clase que viene cargada en java
    public void Area(){
        area = Math.pow(lado, 2);
        System.out.println("El area del cuadrado de lado " + lado + " es " + area);
        System.out.println("");
    }
    
}
