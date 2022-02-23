package launcher;


import smellytrivial.Game;

import java.util.Random;

public class GameLauncher {

    private static boolean Ganador;

    public static void main(String[] args) {
        Game juego = new Game();

        juego.agregar("Maria");
        juego.agregar("Juan");
        juego.agregar("Antonio");
        juego.agregar("Sara");
        juego.agregar("Rafael");
        juego.agregar("Yaiza");




        Random rand = new Random();

        Ganador = false;
        boolean esJugable = juego.esJugable();
        if (!esJugable) {
            System.out.println("Deben haber al menos 2 jugadores y 6 como mucho");
        }
        while (juego.esJugable() && Ganador == false) {

            juego.tirarDado(rand.nextInt(5) + 1);

            if (rand.nextInt(9) == 7) {
                Ganador = juego.respuestaIncorrecta();
            } else {
                Ganador = juego.fueRespuestaCorrecta();
            }

        }

    }
}
