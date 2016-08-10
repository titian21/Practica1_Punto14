package lab_punto14;

//Clase circulo en la cual se declaran las variables radio y area, y los metodos setRadio y Area.

public class Circulo {
    
    private double radio = 0, area = 0;
    
    //Metodo para tener acceso a la variable radio.
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    //Metodo para calcular el area del circulo utilizando la variable radio. Math es una clase que viene cargada en java   
    public void Area(){
        area = Math.pow(radio, 2) * Math.PI;
        System.out.println("El area del circulo con radio " + radio + " es " + area);
        System.out.println("");
    }
    
}
