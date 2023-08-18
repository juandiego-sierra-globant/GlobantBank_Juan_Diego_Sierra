import java.util.Date;

public class Main {
    public static void main(String[] args) {
        users newUsers = new users("Pepe","jajaja","12243");
        bankAccount cliente = new bankAccount(1233,new Date(122, 7, 18), 1000.0);
        cliente.withdraw();
        cliente.adding();
        cliente.transfering();
    }
}