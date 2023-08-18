import java.util.Date;
import java.util.Scanner;
public class bankAccount {
    private int numeroCuenta;
    private Date fechaApertura;
    private double saldo;

    public bankAccount(int numeroCuenta, Date fechaApertura, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldoInicial;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double withdraw(){
        System.out.println("What amount do you want to with draw:");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();

        if(amount>saldo){
            System.out.println("Insufficient funds");
        }
        else if(amount<1000){
            saldo = saldo - amount - 200;
            System.out.println("New amount: " + saldo);
        }

        else{
            saldo = saldo - amount - (amount*0.15);
        }
        return saldo;
    }

    public double adding(){
        System.out.println("What amount do you want to add:");
        Scanner sc = new Scanner(System.in);
        double add_amount = sc.nextDouble();

        saldo = saldo + add_amount;
        System.out.println("New amount: " + saldo);
        return saldo;
    }
    public double transfering(){
        System.out.println("What amount do you want to transfer:");
        Scanner sc = new Scanner(System.in);
        double transfer_amount = sc.nextDouble();

        if(transfer_amount>saldo){
            System.out.println("Insufficient funds");
        }

        else{
            saldo = saldo - transfer_amount - 100;
        }
        System.out.println("New amount: " + saldo);
        return saldo;
    }

}
