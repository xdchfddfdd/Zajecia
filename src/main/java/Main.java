// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wysokość trójkąta:");
        int height = scanner.nextInt();

        System.out.println("Podaj znak, z którego ma być zbudowany trójkąt:");
        char symbol = scanner.next().charAt(0);

        generateRightTriangle(height, symbol);
    }

    public static void generateRightTriangle(int height, char symbol) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
