// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rozmiar ramki:");
        int size = scanner.nextInt();

        System.out.println("Podaj znak, z którego ma być zbudowana ramka:");
        char symbol = scanner.next().charAt(0);

        generateFrameSquare(size, symbol);
    }

    public static void generateFrameSquare(int size, char symbol) {

        for (int i = 0; i < size; i++) {
            System.out.print(symbol + " ");
        }
        System.out.println();

        for (int i = 0; i < size - 2; i++) {
            System.out.print(symbol + " ");
            for (int j = 0; j < size - 2; j++) {
                System.out.print("  ");
            }
            System.out.println(" " + symbol);
        }

        for (int i = 0; i < size; i++) {
            System.out.print(symbol + " ");
        }
        System.out.println();
    }
}


  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
