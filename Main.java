

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
       
        Phone Realme1 = new Realme();

      
        PhoneUser Yahya = new PhoneUser(Realme1);

     
            Yahya.turnOnThePhone();
        
        
        Scanner input = new Scanner(System.in);
        String aksi; 

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Power On HP");
            System.out.println("[2] Power Off HP");
            System.out.println("[3] Tambah Volume");
            System.out.println("[4] Kuranggi Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                    Yahya.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                    Yahya.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                    Yahya.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                    Yahya.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("ERORRR! ");
            }
        }

    }

}