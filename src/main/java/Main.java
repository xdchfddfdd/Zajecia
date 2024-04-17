// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        char[][] tablica = generujTablice(6, 6);
        wyswietlTablice(tablica);
    }

    public static char[][] generujTablice(int wiersze, int kolumny) {
        char[][] tablica = new char[wiersze][kolumny];
        Random rand = new Random();

        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                // Generowanie losowego znaku ASCII
                char znak = (char) (rand.nextInt(94) + 33); // Zakres od 33 do 126 (włącznie) dla drukowalnych znaków ASCII
                tablica[i][j] = znak;
            }
        }

        return tablica;
    }

    public static void wyswietlTablice(char[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
    }
}


  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
