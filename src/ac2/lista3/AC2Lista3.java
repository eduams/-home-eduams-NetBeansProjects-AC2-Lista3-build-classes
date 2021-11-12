package ac2.lista3;

import java.util.Scanner;

public class AC2Lista3 {

    public static void main(String[] args) {
        int mascara = 0b00100000;
        Scanner frase = new Scanner(System.in);      
        System.out.println("Digite um texto");
        String fraseInput = frase.nextLine();
        int x = 0;
        while (x < fraseInput.length()){  
            System.out.print((char)(fraseInput.charAt(x) | mascara));
            x++;
        }
    }
}
