
package main;

public class Kare extends  Sekil{
    
    private  int kenar;

    public Kare(int kenar, String isim) {
        super(isim);
        this.kenar = kenar;
    }

    

    @Override
    void AlanHesapla() {
       
        System.out.println(getIsim()+" in alanı"+(kenar*kenar));
        
    }
    
    
    
}
