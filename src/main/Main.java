
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
        System.out.println("sekillerin alan hesaplaması");
        
        
        String islemler="1 Kare alan hesaplama\n"+
                        "2 Ucgen alan hesaplama\n"+
                        "3 Daire alan hesaplama\n"+
                        "cıkış için q ya basınız...";

        while (true) {   
        System.out.println("*************************");
        System.out.println(islemler); 
       
        Sekil sekil=null;
        Scanner scanner =new Scanner(System.in);
        
        String secim=scanner.nextLine();
            if (secim.equals("q")) {
                System.out.println("programdean çıkılıyor");
                break;
            }else if (secim.equals("1")) {
                
                System.out.println("Karenin kenar uzunluğunu giriniz:");
                int kenar=scanner.nextInt();
                scanner.nextLine();
                
                sekil= new Kare(kenar,"Kare");
                
                sekil.AlanHesapla();
                
                
            }else if (secim.equals("2")) {
                
                int a= scanner.nextInt();
                int b=scanner.nextInt();
                int c=scanner.nextInt();
                scanner.nextLine();
                sekil =new Ucgen(a, b, c,"uçgen");
                sekil.AlanHesapla();
                
            }else if (secim.equals("3")) {
                int yaricap=scanner.nextInt();
                scanner.nextLine();
                
                sekil= new Daire("Daire", yaricap);
                sekil.AlanHesapla();
                
                
            }else{
                
                System.out.println("seçimniz yanlış tekrar seçim yapınız...");
            }
            
            
        }
        
        
    }
    
}
