import java.util.Scanner;

/**
Escribe un programa que pida una cadena al usuario y que revise si esta es un palindromo o no y terminar.
Un palindromo significa que los caracteres de la cadena son los mismos al leer hacia adelante o hace atras.
Debes ignorar los espacios, los acentos, puntuaciones y mayusculas y minusculas.
Ejemplos de palindromos:
Amor a Roma
Bob
Somos o no somos
Acaso hubo buhos aca.
Ana, la tacana catalana
racecar
was it a car or a cat I saw
never odd or even
rats live on no evil star
El programa debe imprimir true si es un palindromo y false si no lo es.
*/
class Palindrome {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        String reverse = "";
        s = s.toLowerCase();
        if (s.contains(" ")) {
            s = s.replace(" ", "");
        }
        if (s.contains("ñ")) {
            s = s.replace("ñ", "n");
        }
        if (s.contains(",")) {
            s = s.replace(",", "");
        }
        if (s.contains(".")) {
            s = s.replace(".", "");
        }
        if (s.contains("á")) {
            s = s.replace("á", "a");
        }
        if (s.contains("é")) {
            s = s.replace("é", "e");
        }
        if (s.contains("í")) {
            s = s.replace("í", "i");
        }
        if (s.contains("ó")) {
            s = s.replace("ó", "o");
        }
        if (s.contains("ú")) {
            s = s.replace("ú", "u");
        }
        
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.substring(i, i + 1);
        }
        System.out.println("");
        if (s.equals(reverse)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        

    }

    
}
