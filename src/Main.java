import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Pelicula duro = new Pelicula("Duro", "Accion", "Un dolape mala onda", "LTU", "+18", 120, 5, "151288");

        ArrayList<Pelicula> listaPelicula = new ArrayList<>();
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        ArrayList<Alquiler> listaAlquiler = new ArrayList<>();

        //listaPelicula.add(duro);

        VideoStore roberto = new VideoStore();  //CREA EL OBJETO ROBERTO DE VIDEOSTORE

        roberto.crearPelicula();   //CREA LA PELICULA PORQUE NO LAS GUARDA

        roberto.crearCliente();   //CREA EL CLIENTE PORQUE NO LAS GUARDA

        String nombreCliente = Consola.leerString("Escriba el nombre del cliente que alquila: \n"); //CREA LA VARIABLE NC Y LEE UN MENSAJE

        String tituloPelicula = Consola.leerString("Escriba el título de la película para alquilar: \n"); //CREA LA VARIABLE TP Y LEE UN MENSAJE


        roberto.alquilarPelicula(nombreCliente, tituloPelicula);//ALQUILAR PELICULA

        //System.out.println(roberto.toString());//ESTE MUESTRA TODO COMO SI FUERAS EL DUEÑO SI QUERES VER MENOS USAR EL DE LA CLASE ALQUILER
        System.out.println(roberto.getarregloAlquileres().toString());// //ESTE MUESTRA TU DATOS COMO CLIENTE Y EL ALQUILER

    }
}