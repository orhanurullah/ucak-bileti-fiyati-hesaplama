import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int km, age, tripType;
        double kmPrice = 0.10;
        System.out.println("Uçak Bileti Programına Hoşgeldiniz.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gideceğiniz Yer Kaç Km Uzakta : ");
        km = scanner.nextInt();
        if(km < 0){
            System.out.println("Hatalı Veri Girdiniz.");
            return;
        }
        System.out.print("Yaşınızı Girin : ");
        age = scanner.nextInt();
        if(age < 0){
            System.out.println("Hatalı Veri Girdiniz");
            return;
        }
        System.out.print("Sadece Gidiş için 1'e basın.\nGidiş-Dönüş için 2'ye basın : ");
        tripType = scanner.nextInt();
        if(!(tripType == 1 || tripType == 2)){
            System.out.println("Hatalı Veri Girdiniz.");
            return;
        }
        double totalPrice = km * kmPrice;
        if(age < 12){
            totalPrice = totalPrice / 2;
        }else if(age >= 12 && age < 24){
            totalPrice = totalPrice * 0.90;
        }else if(age > 65){
            totalPrice = totalPrice * 0.70;
        }

        if(tripType == 2){
            totalPrice = totalPrice * 0.80 * 2;
        }

        System.out.println("Ödeyeceğiniz Bedel : " + totalPrice);
    }
}
