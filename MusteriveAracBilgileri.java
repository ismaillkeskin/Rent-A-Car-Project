package arackiralamaprojesi;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class MusteriveAracBilgileri {
   public void aracTalep(){
       Scanner input = new Scanner(System.in);

       System.out.println("Aracı Alacağınız Şehiri Giriniz : ");
       String teslimAlinacakSehir = input.nextLine();
       System.out.println("Aracı Teslim Edeceğiniz Şehiri Giriniz : ");
       String teslimEdilecekSehir = input.nextLine();
       System.out.println("Teslim Alınacak Tarih (yyyy-mm-dd) : ");
       LocalDate teslimALinacakTarih = LocalDate.parse(input.nextLine());
       System.out.println("Teslim Alınacak Saat (HH:mm) :");
       LocalTime teslimAlinacakSaat = LocalTime.parse(input.nextLine());
       System.out.print("Teslim günü (yyyy-MM-dd): ");
       LocalDate teslimGun = LocalDate.parse(input.nextLine());
       System.out.print("Teslim saati (HH:mm): ");
       LocalTime teslimSaati = LocalTime.parse(input.nextLine());

       if (teslimALinacakTarih.isAfter(teslimGun)) {
           System.out.println("Hatalı Tarih Girdiniz!");
           return;
       }





   }


}