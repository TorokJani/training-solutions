package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add the client's name: ");
        client.name= scanner.nextLine();
        System.out.println("Please add  the birth of year of client :");
        client.birthofyear=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please add the address of client :");
        client.address = scanner.nextLine();
        System.out.println(client.name + ' ' + client.birthofyear + ' ' +client.address);

    }
}
