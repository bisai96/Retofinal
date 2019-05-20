/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retofinal;

/**
 *
 * @author bisai
 */
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Random;

public class RetoFinal {

        public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int numTurnos;
        int nivelVidaMago = 100;
        int nivelVidaJugador = 100;
        int opcion;
        int turno = 0;
        System.out.println("Tu vida inicial es: "+nivelVidaMago);
        System.out.println("La vida del mago es: "+nivelVidaMago);
        System.out.println("Se recomienda al jugador jugar 50 turnos o más para poder obtener a un ganador =)");
        System.out.println("Ingrese cantidad de turnos a jugar: ");
        numTurnos = Integer.parseInt(entrada.readLine());
        System.out.println(" ");

        Random aleatorio = new Random(System.currentTimeMillis());
        for (int turActual = 1; turActual <= numTurnos; turActual++){
        System.out.println("El juego está en el turno " + turActual);

        if (turno == 1) {
            opcion = aleatorio.nextInt(4) + 1;
            switch(opcion){
                case 1:
                    nivelVidaJugador += 1;
                    nivelVidaMago -= 1;
                    System.out.println(" ");
                    System.out.println("-- Haz salvado 10 hadas, aumenta tu poder --");
                    System.out.println("-- El mago pierde poder --");
                    System.out.println(" ");
                    break;
                case 2:
                    nivelVidaJugador -= 1;
                    nivelVidaMago += 1;
                    System.out.println(" ");
                    System.out.println("-- Pierdes poder --");
                    System.out.println("-- El mago atrapó 10 hadas, aumenta su poder --");
                    System.out.println(" ");
                    break;
                case 3:
                    nivelVidaJugador -= 1;
                    System.out.println(" ");
                    System.out.println("-- Un ogro te ha golpeado, pierdes poder --");
                    System.out.println(" ");
                    break;
                case 4:
                    nivelVidaMago  -= 1;
                    System.out.println(" ");
                    System.out.println("-- Le quitaste un hada al mago --");
                    System.out.println("-- El mago pierde poder --");
                    System.out.println(" ");
                    break;
            }
            turno = 0;
        }
        turno++;
            if(nivelVidaJugador == 0 || nivelVidaMago ==  0){
                System.out.println("-- Se acabó el juego --");
                System.out.println("Poder del Jugador: "+nivelVidaJugador);
                System.out.println("Poder del Mago: "+nivelVidaMago);
                break;
            }
        }
    }
}