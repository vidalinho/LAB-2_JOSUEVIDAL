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
public class crearCuenta {

  
    static void cuenta() {
        variables v= new variables ();
     
        Scanner lea = new Scanner(System.in);
        System.out.println("Ingrese numero de cuenta:");
        int nCuenta = lea.nextInt();
        v.account.add(nCuenta);
        System.out.println("Ingrese fecha de nacimiento separado por espacio (4 3 2018): ");
        int fNacimiento = lea.nextInt();
       v. account.add(fNacimiento);
        System.out.println("Ingrese su edad");
        int edad = lea.nextInt();
        v.account.add(edad);
        System.out.println("Ingrese ciudad de residencia: ");
        String ciudad = lea.next();
        v.account.add(ciudad);
        System.out.println("Ingrese nacionalidad:  ");
        String nac = lea.next();
        v.account.add(nac);
        System.out.println("Ingrese ID ");
        int id = lea.nextInt();
        v.account.add(id);
        System.out.println("Ingrese su usuario ");
        String usuario = lea.next();
        v.account.add(usuario);
        System.out.println("Ingrese una contrasena sin numeros: ");
        String contra = lea.next();
        v.account.add(contra);
        
    }
}
