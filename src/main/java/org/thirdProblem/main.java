package org.thirdProblem;

public class main {
    public static void main(String[] args) {




        Usuario usuario = new Usuario();
        Foto fotito = new Foto();
        Video video = new Video();
        Articulo arti =  new Articulo();




        usuario.interaccionRedesSociales("Comentar", "Que bonitaa", fotito);
        usuario.interaccionRedesSociales("reaccionar", "Sonriendo", video);
        usuario.interaccionRedesSociales("compartir","Lo compartire con mi mama", arti);

        usuario.interaccionRedesSociales("enviar", "Enviando a Joaaco", fotito);
    }
}
