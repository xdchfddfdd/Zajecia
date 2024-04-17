// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        char[][] tablica = generujTablice();
        wyswietlTablice(tablica);
    }

    public static char[][] generujTablice() {
        char[][] tablica = new char[6][6];
        Random rand = new Random();
        String dostepneZnaki = "!@#$%^&*()_+{}[]abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                // Losowanie indeksu do pobrania losowego znaku z dostępnych
                int index = rand.nextInt(dostepneZnaki.length());
                tablica[i][j] = dostepneZnaki.charAt(index);
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


  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}