import java.util.ArrayList;

public class Bingo {
    public static void main(String[] args) {
        Jugador jugador=new Jugador();
        Jugador Jugador2=new Jugador();
        Jugador.rellenar();
        Jugador2.rellenar();
        Generador_de_bolas generar=new Generador_de_bolas();
         Generador_de_bolas.jugar(Jugador,Jugador2);
    }

}
