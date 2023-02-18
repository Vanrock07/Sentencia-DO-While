/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencia.pkgdo.pkgwhile;
import java.util.Scanner;

/**Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
 *
 * @author Ivan Ramirez
 */
public class SentenciaDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leernum = new Scanner(System.in);
        System.out.println("Empezaremos leyendo 20 numeros");
        int cont = 0, num = 0, sum = 0;
        
        do {
            cont = cont + 1;
            System.out.println("Ingrese el numero " + cont);
            num = leernum.nextInt();
            if (num<0){
                System.out.println("El número es negativo, no será sumado");
                sum = sum;
                    }
            else {
            sum = sum + num;
            }
                if (cont==20) {
                System.out.println("La suma de los 20 numeros es " + sum);
            }  
                if (num==0)  {
             System.out.println("Se capturó el numero cero, has salido del bucle");    
            } 
        } while (num !=0 && cont<20);
          
        }    
        }     
        
    
    

