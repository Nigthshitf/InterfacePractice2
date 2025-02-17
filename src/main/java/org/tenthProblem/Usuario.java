package org.tenthProblem;

public class Usuario {
    String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void hacerReserva(Reservable alojamiento, String fecha) {
        System.out.println("" + nombre + " está haciendo una reserva...");
        alojamiento.reservar(fecha);
    }

    public void cancelarReserva(Reservable alojamiento) {
        System.out.println(""+ nombre + " está cancelando su reserva...");
        alojamiento.cancelarReserva();
    }

    public void calificarHotel(Hotel hotel, int estrellas) {
        System.out.println("" + nombre + " está calificando el hotel...");
        hotel.calificar(estrellas);
    }
}
