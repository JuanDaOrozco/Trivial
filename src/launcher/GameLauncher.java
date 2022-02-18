package launcher;


import smellytrivial.Game;

import java.util.Random;

public class GameLauncher {

    private static boolean noGanador;

    public static void main(String[] args) {
        Game juego = new Game();

        juego.agregar("Maria");
        juego.agregar("Juan");
        juego.agregar("Antonio");

        Random rand = new Random();

        noGanador = true;
        if (!juego.esJugable()) {
            System.out.println("Deben haber al menos 2 jugadores");
        }
        while (juego.esJugable() && noGanador) {

            juego.tirarDado(rand.nextInt(5) + 1);

            if (rand.nextInt(9) == 7) {
                noGanador = juego.respuestaIncorrecta();
            } else {
                noGanador = juego.fueRespuestaCorrecta();
            }

        }

    }
}
