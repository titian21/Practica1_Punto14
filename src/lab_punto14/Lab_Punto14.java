package lab_punto14;

import java.util.Scanner;

public class Lab_Punto14 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        
        //Se crea el menu ultilizando el ciclo do while.
        do{
            System.out.println("::MENU::HALLAR AREA::");
            System.out.println("1. Hallar el area de un circulo.");
            System.out.println("2. Hallar el area de un trinagulo.");
            System.out.println("3. Hallar el area de un cuadrado.");
            System.out.println("4. Hallar el area de un rectangulo.");
            System.out.println("5. Salir.");
            System.out.println("");
            
            opcion = leer.nextInt();
            System.out.println("");
            
            //Se crea el cico switch para acceder a la opcion ingresada por el usuario y realizar el respectivo procedimiento.
            switch(opcion){
                
                case 1: Circulo cir = new Circulo(); // Se crea un objeto tipo Circulo
                        System.out.print("Ingrese el radio del circulo para hallar el area: ");
                        //Se emplean los metodos del objeto
                        cir.setRadio(leer.nextFloat());
                        cir.Area();
                        break;
                        
                case 2: Triangulo tri = new Triangulo(); //Se crea un objeto tipo Triangulo
                        System.out.print("Ingrese la base y la altura del triangulo para hallar el area: ");
                        //Se emplean los metodos del objeto
                        tri.setBase(leer.nextFloat());
                        tri.setAltura(leer.nextFloat());
                        tri.Area();
                        break;
                        
                case 3: Cuadro cua = new Cuadro(); //Se crea un objeto tipo Cuadro
                        System.out.print("Ingrese el lado del cuadrado para hallar el area: ");
                        //Se emplean los metodos del objeto
                        cua.setLado(leer.nextFloat());
                        cua.Area();
                        break;
                        
                case 4: Rectangulo rec = new Rectangulo(); //Se crea el un objeto tipo Rectangulo
                        System.out.print("Ingrese la base y la altura del rectangulo para hallar el area: ");
                        //Se emplean los metodos del objeto
                        rec.setBase(leer.nextFloat());
                        rec.setAltura(leer.nextFloat());
                        rec.Area();
                        break;
                        
                case 5: break;        
                        
                default:    System.out.println("La opcion ingresada es incorrecta!");
                            System.out.println("");
                            break;
            }
            
        }while(opcion != 5);
        
      
    }
    
}
