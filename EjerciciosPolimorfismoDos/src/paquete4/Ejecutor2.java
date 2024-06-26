/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.ArrayList;
import java.util.Scanner;
import paquete2.Arriendo;
import paquete3.ArriendoLocalComercial;
import paquete3.ArriendoLocalComida;
import paquete3.ArriendoLocalSesiones;

public class Ejecutor2 {

    public static void main(String[] args) {
//  ArriendoLocalComida ArriendoLocalComercial ArriendoLocalSesiones
//  
        Scanner entrada = new Scanner(System.in);
        String nombre;
        double cuotaB;
        double valorAdicionalFijo;
        double valorLuz;
        double valorAgua;
        double iva;
        double valorSillas;
        double valorAmplificacion;
        int contador = 0;
        int instancias;
        int opc;
        System.out.println("Ingrese el numero de Locales que va"
                + " ingresar");
        instancias = entrada.nextInt();
        while (contador < instancias) {
            System.out.printf("[1] Arriendo Local Comercial\n[2] Arriendo Local"
                    + "Comida\n[3] Arriendo Local Sesiones\n");
            opc = entrada.nextInt();
            entrada.nextLine();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese los nombres del estudiante");
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese los apellidos del estudiante");
                    valorAdicionalFijo = entrada.nextDouble();
                    System.out.println("Ingrese la identificación del estudiante");
                    identificacionEst = entrada.nextLine();
                    System.out.println("Ingrese la edad del estudiante");
                    edadEst = entrada.nextInt();

                    contador++;
                    break;
                case 2:
                    contador++;
                    break;
                case 3:
                    contador++;
                    break;
                default:
                    contador--;
            }
        }
        ArrayList<Arriendo> listaArriendos = new ArrayList<>();
        ArriendoLocalComida arriendoComida = new ArriendoLocalComida(
                "Christian Shepherd", 300);
        arriendoComida.establecerIva(10); // en porcentaje
        arriendoComida.establecerValorAgua(20.2); // en $
        arriendoComida.establecerValorLuz(40.2); // en $

        ArriendoLocalComercial arriendoComercial = new ArriendoLocalComercial(
                "Andrew Schroeder", 400);
        arriendoComercial.establecerValorAdicionalFijo(100); // en $

        ArriendoLocalSesiones arriendoSesiones = new ArriendoLocalSesiones(
                "Angela Watson", 350);
        arriendoSesiones.establecerValorSillas(10); // en $
        arriendoSesiones.establecerValorAmplificacion(20); // en $

        listaArriendos.add(arriendoComida);
        listaArriendos.add(arriendoComercial);
        listaArriendos.add(arriendoSesiones);

        for (int i = 0; i < listaArriendos.size(); i++) {
            listaArriendos.get(i).establecerArriendoMensual();
        }

        CentroComercial centro = new CentroComercial("La Pradera",
                listaArriendos);
        // centro.establecerTotalArriendosBaseMensual();
        //centro.establecerTotalArriendosFinalMensual();
        System.out.println(centro);

    }
}
