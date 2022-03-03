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

        do {

            juego.tirarDado(rand.nextInt(5) + 1);

            if (rand.nextInt(9) == 7) {
                noGanador = !juego.respuestaIncorrecta();
            } else {
                noGanador = !juego.fueRespuestaCorrecta();
            }

        } while (!noGanador);

        try{
            juego.agregar("Nerea");
            juego.agregar("Lidia");
            juego.agregar("Rocío");
            juego.agregar("Nacho");
            juego.agregar("Mary");
            juego.agregar("Jorge");

            if (juego.esJugable() && noMasDeSeis()) {
                Random random = new Random();

            } else {
                System.out.println("SOLO SE PODRÁ JUGAR CON MÍNIMO 2 JUGADORES");
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("NO PUEDE HABER EN ESTA PARTIDA MÁS DE 6 JUGADORES");
        }

    }

    private static boolean noMasDeSeis() {
        return true;
    }


}
