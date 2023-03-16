package Package1;

import java.util.*;
import java.io.*;

public class MenuPrincipal {
    private static Scanner scanner = new Scanner(System.in);
    private static int wins = 0;
    private static int losses = 0;
    private static String playerName;

    public static void main(String[] args) throws IOException {
        System.out.println("¡Bienvenido a Adivina Quién!");

        // Pedir al usuario su nombre para guardar el archivo correspondiente
        System.out.print("Ingresa tu nombre: ");
        playerName = scanner.nextLine();

        // Cargar archivo de estadísticas del jugador
        File playerFile = new File(playerName + ".txt");
        if (playerFile.exists()) {
            Scanner fileScanner = new Scanner(playerFile);
            wins = fileScanner.nextInt();
            losses = fileScanner.nextInt();
            fileScanner.close();
        }

     // Iniciar el juego
        boolean playAgain = true;
        while (playAgain) {
            playGame();
            System.out.print("¿Quieres jugar de nuevo? (s/n): ");
            String playAgainStr = scanner.nextLine();
            if (playAgainStr.equals("n")) {
                playAgain = false;
            }
        }

        // Guardar estadísticas del jugador
        FileWriter writer = new FileWriter(playerFile);
        writer.write(wins + " " + losses);
        writer.close();

        System.out.println("¡Gracias por jugar!");
    }

	private static void playGame() {
		// TODO Auto-generated method stub
		
	}
}






     
