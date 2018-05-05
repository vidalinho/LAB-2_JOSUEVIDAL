/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2_josuevidal;

import java.util.*;

/**
 *
 * @author josue
 */
public class Laboratorio2_JosueVidal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        admin m= new admin();
        logIn q=new logIn();
        crearCuenta n=new crearCuenta();
        System.out.println("1) Administracion ");
        System.out.println("2) Crear cuenta ");
        System.out.println("3) log in");
        System.out.println("INGRESE UNA OPCION: ");
        int opc = lea.nextInt();
        switch (opc) {
            case 1:
                m.administracion();
                break;
            case 2:
                n.cuenta();
                break;
            case 3:
                q.logiin();
                break;
        }//fin del switch
    }//fin del main

}//fin de la clase
