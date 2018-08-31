/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.Scanner; //Libreriaa

public class Ejercicio2 {

    //Metodos
    public static void main(String[] args) {
        // Instanciacion
        Scanner objeto = new Scanner (System.in);
        byte edad;
        
        //Proceso
        System.out.println("Digite su edad: ");
        edad= objeto.nextByte();
        //Salida
        System.out.println("Su edad es:"+edad );
    }
    
}
