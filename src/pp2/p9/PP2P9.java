/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p9;
import java.util.*;
/**
 *
 * @author Osvaldo
 */
public class PP2P9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ocupe muchas variables en este codigo
        int c ,p1, p2, p3, p4;
        c = pedirCifra();
        p1 = calcularCifra1(c);
        p2 = calcularCifra2(c);
        p3 = calcularCifra3(c);
        p4 = calcularCifra4(c);
        mostrar(c,p1,p2,p3,p4);
    }
    public static int pedirCifra(){
        int c;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba una cantidad de 4 digitos ");
        c = entrada.nextInt();
        return c;
    }
    public static int calcularCifra1 (int c){
        int p,f=0;
        //solo aceptara cantidades de 4 digitos
        if(c>999 && c<9999){
        p = c/1000;
        f = p *1000;
        }else{
            System.out.println("La cifra no es 4 digitos, reinice el prgrama.");
        }
        return f;
    }
    public static int calcularCifra2(int c){
        int p1,p2,f2,f3=0;
        //como solo se queda con numeros enteros, dividirlo entre 100 y multiplicarlo por 100 elimina los demas numeros
        if(c>999 && c<9999){
        p1 = c/100;
        p2 = (c/1000)*10;
        f2 = p1-p2;
        f3 = f2*100;
        }
        return f3;
    }
    public static int calcularCifra3(int c){
        int p1,p2, p3=0;
        if(c>999 && c<9999){
        p1 = (c / 1000)*1000;
        //el problema fue que ahora tengo que restarle los demás numeros para obtener el entero que quiero
        p2 = ((c / 100)*100)-((c / 1000)*1000);
        p3 = ((c / 10)*10)-(p1+p2);
        }
        return p3;
    }
    public static int calcularCifra4 (int c){
        int p1,p2,p3,f1 = 0;
        if(c>999 && c<9999){
        p1 = (c / 1000)*1000;
        p2 = ((c / 100)*100)-((c / 1000)*1000);
        p3 = ((c / 10)*10) -((c / 100)*100);
        //resultando en una ecuación muy grande
        f1 = c-(p1+p2+p3);
        }
        return f1;
    }
    public static void mostrar(int c, int p1, int p2, int p3, int p4){
        //pero que finalmente cumple con el objetivo del programa
        System.out.println("La cantidad " +c +" es igual a la suma de " +p1 +" + " +p2 +" + " +p3 +" + " +p4);
    }
}
