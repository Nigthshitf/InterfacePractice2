package org.thirdProblem;

public class Usuario {


    public void interaccionRedesSociales(String accion, String mensaje, Interactuable publicacion){
        switch (accion.toLowerCase()){
            case "comentar":
                publicacion.comentar(mensaje);
                break;
            case "reaccionar":
                publicacion.reaccionar(mensaje);
                break;
            case "compartir":
                publicacion.compartir();
                break;
            default:
                System.out.println("Accion no reconocida!!");
        }
    }

}
