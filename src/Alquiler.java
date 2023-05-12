import java.time.LocalDate;

public class Alquiler {
    private Pelicula peli;
    private Cliente client;
    private LocalDate fechaEntrega;
    private LocalDate fechaDeDevolucion;


    public Alquiler() {
    }

    public Alquiler(Pelicula peli, Cliente client) {
        this.peli = peli;
        this.client = client;
        this.fechaEntrega = LocalDate.now();
        this.fechaDeDevolucion = fechaEntrega.plusDays(2);
    }

    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "----------" + "\n" +
                "ALQUILER:" + "\n" +
                "Pelicula: " + peli + "\n" +
                "Cliente: " + client.getNombre() + "\n" +
                "Entrega: " + fechaEntrega + "\n" +
                "Devolucion: " + fechaDeDevolucion;
    }
}