package Package1;

import java.util.Random;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		persona[] array1 = new persona[10];
		int [] array2 = {0,1,2,3,4,5,6,7,8,9};
		String[] array3 = new String[] {"Pedro", "Luis", "Carmen", "Julia", "Alejandro", "Karla", "Fernanda", "Luisa", "Rafael", "Julian"};
		int delete=10;
		
		Random random = new Random();
				
		for (int i=0; i<10; i++) {
			int rand= random.nextInt(delete);
			
			Boolean bool1= random.nextBoolean();
			Boolean bool2= random.nextBoolean();
			Boolean bool3= random.nextBoolean();
			Boolean bool4= random.nextBoolean();
			
			array1[i] = new persona(array3[array2[rand]], bool1, bool2, bool3, bool4);
			
			System.out.println(array1[i].getName());
			System.out.println("¿Tiene bigote? " + array1[i].getBigote());
			System.out.println("¿Es rubio? " +array1[i].getRubio());
			System.out.println("¿Es coreano? " + array1[i].getCoreano());
			System.out.println("¿Está peinado? " + array1[i].getPeinado() + "\n");
			
			delete--;
			for(int x=0;x<10; x++) {
				if(x==rand) {
					array2[x]=array2[delete];
					array2[delete]=0;
				}
			}
		}
		
		int bigote = 0;
		int rubio = 0;
		int coreano = 0;
		int peinado = 0;
		
		for(persona p: array1) {
			if(p.getBigote() == true) {
				bigote = bigote + 1;
			}
			if(p.getRubio() == true) {
				rubio = rubio + 1;
			}
			if(p.getCoreano() == true) {
				coreano = coreano + 1;
			}
			if(p.getPeinado() == true) {
				peinado= peinado + 1;
			}
		}
		
		System.out.println("Bigotes: " + bigote);
		System.out.println("Rubios: " + rubio);
		System.out.println("Coreanos: " + coreano);
		System.out.println("Peinado: " + peinado);
		
		int quien = random.nextInt(10);
		int[] opciones = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println("\n\nAdivina quien??\n\n");
		
		Scanner scan = new Scanner(System.in);
		
		
		for(int i=0; i<10; i++) {
			if(opciones[i] != 12) {
				System.out.println(i + " " + array1[i].getName());
			}
		}
		System.out.println();
		
		for(int n=0; n<3; n++) {
			System.out.println("1. ¿Tiene bigote?");
			System.out.println("2. ¿Es rubio(a)?");
			System.out.println("3. ¿Es coreano?");
			System.out.println("4. ¿Está peinado?");
			
			String pregunta = scan.nextLine();
			
			switch (pregunta) {
				case "1":
					System.out.println("¿Tiene bigote? " + array1[quien].getBigote() + "\n");
									
					for(int i=0; i<10; i++) {
						if(array1[quien].getBigote() != array1[i].getBigote()) {
							opciones[i] = 12;
						}
					}
					
					for(int i=0; i<10; i++) {
						if(opciones[i] != 12) {
							System.out.println(i + " " + array1[i].getName());
						}
					}
					System.out.println();
					break;
					
				case "2":
					System.out.println("¿Es rubio? " + array1[quien].getRubio() + "\n");
					
					for(int i=0; i<10; i++) {
						if(array1[quien].getRubio() != array1[i].getRubio()) {
							opciones[i] = 12;
						}
					}
					
					for(int i=0; i<10; i++) {
						if(opciones[i] != 12) {
							System.out.println(i + " " + array1[i].getName());
						}
					}
					System.out.println();
					break;
					
				case "3":
					System.out.println("¿Es coreano? " + array1[quien].getCoreano() + "\n");
					
					for(int i=0; i<10; i++) {
						if(array1[quien].getCoreano() != array1[i].getCoreano()) {
							opciones[i] = 12;
						}
					}
					
					for(int i=0; i<10; i++) {
						if(opciones[i] != 12) {
							System.out.println(i + " " + array1[i].getName());
						}
					}
					System.out.println();
					break;
					
				case "4":
					System.out.println("¿Está peinado? " + array1[quien].getPeinado() + "\n");
					
					for(int i=0; i<10; i++) {
						if(array1[quien].getPeinado() != array1[i].getPeinado()) {
							opciones[i] = 12;
						}
					}
					
					for(int i=0; i<10; i++) {
						if(opciones[i] != 12) {
							System.out.println(i + " " + array1[i].getName());
						}
					}
					System.out.println();
					break;
					
				default:
					System.out.println("Pregunta invalida");
					System.out.println();
					continue;
			}
		}
		
		System.out.println("¿Puedes adivinar quien soy?");
		
		String res = scan.nextLine();
		if(quien == Integer.parseInt(res)) {
			System.out.println("Eres un ganador");
		} else {
			System.out.println("Te equivocaste, la respuesta correcta es: " +array1[quien].getName());
		}
		
		scan.close();
	}
				
}
