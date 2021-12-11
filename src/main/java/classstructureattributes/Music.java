package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song favoriteSong = new Song();
        System.out.println("Add meg a kedvenc előadód: ");
        favoriteSong.band = scanner.nextLine();
        System.out.println("Add meg a szám címét: ");
        favoriteSong.title= scanner.nextLine();
        System.out.println("Add meg a szám hosszát: ");
        favoriteSong.length=scanner.nextInt();
        System.out.println(favoriteSong.band + " - "+ favoriteSong.title + " (" + favoriteSong.length + " perc)!");
    }
}
