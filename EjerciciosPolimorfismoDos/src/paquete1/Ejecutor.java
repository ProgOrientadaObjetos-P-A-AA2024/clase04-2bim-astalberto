/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete3.ArriendoLocalComercial;
import paquete3.ArriendoLocalComida;
import paquete3.ArriendoLocalSesiones;
import java.util.ArrayList;
import paquete2.Arriendo;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        ArrayList<Arriendo> listaArriendos = new ArrayList<>();
        
        ArriendoLocalComida arriendoComida = new ArriendoLocalComida(
                "Christian Shepherd", 300);
        arriendoComida.establecerIva(10); // en porcentaje
        arriendoComida.establecerValorAgua(20.2); // en $
        arriendoComida.establecerValorLuz(40.2); // en $
        
        
        ArriendoLocalComida arriendoComida2 = new ArriendoLocalComida(
                "Christian Cruz", 300, 10, 20.2, 40.2);
        
        
        
        ArriendoLocalComercial arriendoComercial = new ArriendoLocalComercial(
                "Andrew Schroeder", 400);
        arriendoComercial.establecerValorAdicionalFijo(100); // en $
        
        ArriendoLocalSesiones arriendoSesiones = new ArriendoLocalSesiones(
                "Angela Watson", 350);
        arriendoSesiones.establecerValorSillas(10); // en $
        arriendoSesiones.establecerValorAmplificacion(20); // en $
        
        listaArriendos.add(arriendoComida);
        listaArriendos.add(arriendoComida2);
        listaArriendos.add(arriendoComercial);
        listaArriendos.add(arriendoSesiones);
        
        // En el arraylist de tipo Arriendo se pueden almacenar todos los objetos
        // creados que son subclases de la misma
        // En la cual utililizamos el metodo establecerArriendoMensual para dar
        // El valor faltante en todos los objetos almacenados en el array
        // ademas de la respectiva impresion
        for (int i = 0; i < listaArriendos.size(); i++) {
            listaArriendos.get(i).establecerArriendoMensual(); // se llama al 
                                                            // métodos abstracto
            System.out.println(listaArriendos.get(i));
            System.out.println();
        }
        
        
    }
}
