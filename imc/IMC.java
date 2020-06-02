/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import java.util.Scanner;
/**
 *
 * @author Ana Karen
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sex = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        String nombre;
        String sexo;
        int edad;
        float imc, mas,altura, peso;
        
        System.out.println("Calcular Indice de masa corporal");
        System.out.println("Ingrese su nombre: ");
        nombre = name.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = name.nextInt();

        System.out.println("Ingrese su sexo: ");
        sexo = sex.nextLine();
                System.out.println("Ingrese su peso (Kg)");
        peso = name.nextFloat();
        System.out.println("Ingrese su altura(cm): ");
        altura = name.nextFloat();
        
        mas = altura*altura;
        imc= peso/mas;
        float f=imc*10000;
        if(f<=18){
            System.out.println("peso bajo normal");
        }else if(f>=18 && f<= 24.9){
            System.out.println("peso normal");
        } else if(f>=25 && f<=29.9){
            System.out.println("padeces de sobrepeso");
        }else if(f>=30 && f<=39.9){
            System.out.println("Obesidad");
        }
        System.out.println("Tu: " + nombre + " " + edad + "  " + sexo + "  " + f + " ");
    }
    
}
