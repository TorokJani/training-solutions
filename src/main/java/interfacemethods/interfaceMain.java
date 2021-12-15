package interfacemethods;

import java.time.LocalDateTime;

public class interfaceMain {
    public static void main(String[] args) {
        Account account = new Account(LocalDateTime.of(2018,1,1,10,0));
        boolean result= account.createdAfter(LocalDateTime.of(2018,1,1,11,0));
        System.out.println(result);
    }
}
