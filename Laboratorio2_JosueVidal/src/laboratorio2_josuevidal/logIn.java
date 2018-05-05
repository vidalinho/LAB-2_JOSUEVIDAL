/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2_josuevidal;

import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class logIn {

    static void logiin() {

        variables l = new variables();
        Scanner lea = new Scanner(System.in);
        System.out.println("1) Ver dato");
        System.out.println("2) Modificar datos");
        System.out.println("3) Realizar examenes");
        System.out.println("4) Ver notas");
        System.out.println("Ingrese su opcion: ");
        int opc = lea.nextInt();
        switch (opc) {
            case 1:
                System.out.println(l.account);
                break;
            case 2:
                System.out.println("1)cuenta");
                System.out.println("2)nacimiento");
                System.out.println("3)edad");
                System.out.println("4)ciudad");
                System.out.println("5)nacionalidad");
                System.out.println("6)ID");
                System.out.println("7)usuario");
                System.out.println("8)contrasena");
                System.out.println("9)notas");
                System.out.println("Ingrese la opcion de lo que desea modificar: ");
                int opc2=lea.nextInt();
                switch(opc2){
                    case 1:
                        System.out.println("dato a cambiar:");
                        System.out.println(l.account.get(0)); 
                        System.out.println("ingrese nuevo dato:");
                        int cambio=lea.nextInt();
                        l.account.set(0,cambio);
                        break;
                    case 2:
                        System.out.println("dato a cambiar:");
                        System.out.println(l.account.get(0)); 
                        System.out.println("ingrese nuevo dato:");
                        cambio=lea.nextInt();
                        l.account.set(1,cambio);
                        break;
                    case 3:
                         System.out.println("dato a cambiar:");
                        System.out.println(l.account.get(0)); 
                        System.out.println("ingrese nuevo dato:");
                        cambio=lea.nextInt();
                        l.account.set(2,cambio);
                        break;
                    case 4:
                         System.out.println("dato a cambiar:");
                        System.out.println(l.account.get(0)); 
                        System.out.println("ingrese nuevo dato:");
                        cambio=lea.nextInt();
                        l.account.set(3,cambio);
                        break;
                    case 5:
                         System.out.println("dato a cambiar:");
                        System.out.println(l.account.get(0)); 
                        System.out.println("ingrese nuevo dato:");
                        cambio=lea.nextInt();
                        l.account.set(4,cambio);
                        break;
                    case 6:
                         System.out.println("dato a cambiar:");
                        System.out.println(l.account.get(0)); 
                        System.out.println("ingrese nuevo dato:");
                        cambio=lea.nextInt();
                        l.account.set(5,cambio);
                        break;
                    case 7:
                         System.out.println("dato a cambiar:");
                        System.out.println(l.account.get(0)); 
                        System.out.println("ingrese nuevo dato:");
                        cambio=lea.nextInt();
                        l.account.set(6,cambio);
                        break;
                    case 8:
                         System.out.println("dato a cambiar:");
                        System.out.println(l.account.get(0)); 
                        System.out.println("ingrese nuevo dato:");
                        cambio=lea.nextInt();
                        l.account.set(7,cambio);
                        break;
                    case 9:
                         System.out.println("dato a cambiar:");
                        System.out.println(l.account.get(0)); 
                        System.out.println("ingrese nuevo dato:");
                        cambio=lea.nextInt();
                        l.account.set(8,cambio);
                        break;
                        
                }
                break;
            case 3:
                char r = 's';
                System.out.println(l.preguntas);
                while (r == 's') {
                    System.out.println("ingrese respuesta");
                    String resp = lea.nextLine();
                    l.preguntas.add(resp);
                    System.out.println("desea continuar contestando el examen[s/n]");
                    r = lea.next().charAt(0);
                }
                break;
            case 4:
                break;
        }
    }
}
