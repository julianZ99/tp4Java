import java.util.ArrayList;
import java.util.Scanner;

public class VideoStore {
    private ArrayList<Pelicula> arregloPeliculas;
    private ArrayList<Cliente> arregloClientes;
    private ArrayList<Alquiler> arregloAlquileres;

    public VideoStore() {
        this.arregloPeliculas = new ArrayList<>();
        this.arregloClientes = new ArrayList<>();
        this.arregloAlquileres = new ArrayList<>();
    }


    public ArrayList<Pelicula> getarregloPeliculas() {
        return arregloPeliculas;
    }

    public void setarregloPeliculas(ArrayList<Pelicula> arregloPeliculas) {
        this.arregloPeliculas = arregloPeliculas;
    }

    public ArrayList<Cliente> getarregloClientes() {
        return arregloClientes;
    }

    public void setarregloClientes(ArrayList<Cliente> arregloClientes) {
        this.arregloClientes = arregloClientes;
    }

    public ArrayList<Alquiler> getarregloAlquileres() {
        return arregloAlquileres;
    }

    public void setarregloAlquileres(ArrayList<Alquiler> arregloAlquileres) {
        this.arregloAlquileres = arregloAlquileres;
    }

    @Override
    public String toString() {
        return "VideoStore{" +
                "arregloPeliculas=" + arregloPeliculas +
                ", arregloClientes=" + arregloClientes +
                ", arregloAlquileres=" + arregloAlquileres +
                '}';
    }

    //endregion
    public void crearCliente() {
        String nombre = Consola.leerString("Ingrese nombre cliente: ");
        String telefono = Consola.leerString("Ingrese telefono: ");
        String direccion = Consola.leerString("Ingrese direccion: ");
        Cliente c = new Cliente(nombre, telefono, direccion);
        arregloClientes.add(c);
    }

    public Cliente buscarCliente(String nombre) {
        Cliente aux = null;
        for (Cliente c : arregloClientes) {
            if (c.getNombre().equals(nombre)) {
                aux = c;
                break;
            }
        }
        return aux;
    }

    public void crearPelicula() {
        String titulo = Consola.leerString("ingresa titulo: ");
        Integer duracion = Consola.leerInt("ingresa duracion: ");
        Integer stock = Consola.leerInt("ingresa stock: ");

        Consola.limpiar();

        Pelicula c = new Pelicula(titulo, "lucha", "forsen", "arg", "18+", duracion, stock, "hoy");
        arregloPeliculas.add(c);

    }

    //buscarla peli
    public Pelicula buscarPelicula(String titulo) {
        Pelicula aux = null; //IGUALA UNA VARIABLE A NULL PARA TENERLA VACIA
        for (Pelicula p : arregloPeliculas) //el : es para la comparacion de string
        {
            if (p.getTitulo().equals(titulo)) //si encuntra la pelicula devuelve la pelicula en si sino sigue buscando o devuelve null
            {
                aux = p;
                break;
            }
        }
        return aux;
    }

    //alquilarla
    public void alquilarPelicula(String nombre, String titulo) {
        Cliente c = new Cliente(); //CREA OBJETO CLIENTE
        c = buscarCliente(nombre); //BUSCA SI EXISTE ESE CLIENTE EN EL ARRAY O LISTA MEDIANTE EL NOMBRE

        Scanner scan = new Scanner(System.in); //??

        if (c == null) //SI NO EXISTE
        {
            Consola.leerString("Vamos a crear al nuevo cliente");
            crearCliente(); //CREA EL CLIENTE
        }

        Pelicula p = new Pelicula(); //CREA OBJETO PELICULA
        p = buscarPelicula(titulo);//BUSCA SI EXISTE ESA PELICULA EN EL ARRAY O LISTA MEDIANTE EL TITULO

        if (p == null) //SI NO EXISTE
        {
            Consola.escribir("Como?! no esta el torrent de esa papa"); //LO BOLUDEA
        } else {
            if (p.getStock() > 0) //SI EXISTE PERO Y HAY STOCK
            {
                p.setStock(p.getStock() - 1); //LE SETEA -1 AL STOCK GENERAL DE LA PELICULA
                Alquiler i = new Alquiler(p, c); //CREA OBJETO ALQUILADAS
                arregloAlquileres.add(i); //AÑADE EL OBJETO DE LA PELICULA ALQUILADA AL ARRAY O LISTA
            } else //SI EXISTE PERO EL STOCK ES 0
            {
                Consola.escribir("uhhhhh vo sabe que de esa no me quedo"); //LO BOLUDEA
            }

        }

    }
}