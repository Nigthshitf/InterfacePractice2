package org.sixthProblem;

public class main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Taxi taxi = new Taxi();
        Bus bus = new Bus();
        BicicletaCompartida bici = new BicicletaCompartida();

        usuario.solicitarViaje(taxi, "Casa", "Universidad");
        usuario.solicitarViaje(bus, "Plaza", "Centro");
        usuario.solicitarViaje(bici, "Parque", "Gimnasio");
    }
}
