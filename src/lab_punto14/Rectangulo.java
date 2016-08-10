package lab_punto14;

//Clase cuadro en la cual se declaran las variables base, altura y area, y los metodos setBase, setAltura y Area.

public class Rectangulo {
    
    private double area = 0, base = 0, altura = 0;
    
    //Metodo para tener acceso a la variable privada base.
    public void setBase(float base) {
        this.base = base;
    }

    //Metodo para tener acceso a la variable privada altura.
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    //Metodo para calcular el area del rectangulo utilizando las variables base y altura. 
    public void Area(){
        area = base*altura;
        System.out.println("El area del rectangulos con base " + base + " y altura " + altura + " es " + area);
        System.out.println("");
    }
    
}
