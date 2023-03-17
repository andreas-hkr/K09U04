public class Main {
    public static void main(String[] args) {
        // Skriv ut en slumpad tipskupong (13 rader med 1, X, 2)
        // Använd gärna Math.random

        for (int i=0; i < 13; i++) {
            int x = (int)(Math.random() * 3);
            if (x == 0) {
                System.out.println("1");
            } else if(x == 1) {
                System.out.println(" X");
            } else {
                System.out.println("  2");
            }
        }
    }
}