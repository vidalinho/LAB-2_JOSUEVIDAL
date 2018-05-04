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
public class admin {

    static void administracion() {
        ArrayList preguntas = new ArrayList();
        Scanner lea = new Scanner(System.in);
        System.out.println("1) Crear examen ");
        System.out.println("2) Revisar examen ");
        System.out.println("3) Ver notas ");
        System.out.println("4) Modificar notas ");
        System.out.println("Ingrese una opcion: ");
        int opc = lea.nextInt();
        switch (opc) {
            case 1:
                char r = 's';
                while (r == 's') { //aqui creo el examen
                    System.out.println("Ingrese una pregunta: ");
                    String pregunta = lea.nextLine();
                    pregunta = lea.nextLine();
                    preguntas.add(pregunta);
                    System.out.println("Desea agregar otra pregunta [s/n]: ");
                    r=lea.next().charAt(0);

                }
                System.out.println(preguntas);

        }

    }
}
