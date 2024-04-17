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

        generateTriangle(height, symbol);
    }

    public static void generateTriangle(int height, char symbol) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
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
