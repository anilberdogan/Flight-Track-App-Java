
package donemprojesi;             // kaydedilen dosyanın adı burada dosya.txt olarak belirlenmistir asagida koddan degistirilebilir

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Ucuslar extends Thread { 
    
    private String kalkis_sehri;
    private String varis_sehri;
    private String ucus_gunleri;
    private String kalkis_zamani;
    private String varis_zamani;
    private String ucak_modeli;
    private String ucakNo;        
    private String havayoluSirketi;

    public Ucuslar(String kalkis_sehri, String varis_sehri, String ucus_gunleri, String kalkis_zamani, String varis_zamani, String ucak_modeli, String ucakNo, String havayoluSirketi) {
        this.kalkis_sehri = kalkis_sehri;
        this.varis_sehri = varis_sehri;
        this.ucus_gunleri = ucus_gunleri;
        this.kalkis_zamani = kalkis_zamani;
        this.varis_zamani = varis_zamani;
        this.ucak_modeli = ucak_modeli;
        this.ucakNo = ucakNo;
        this.havayoluSirketi = havayoluSirketi;
    }

    public String getKalkis_sehri() {
        return kalkis_sehri;
    }

    public void setKalkis_sehri(String kalkis_sehri) {
        this.kalkis_sehri = kalkis_sehri;
    }

    public String getVaris_sehri() {
        return varis_sehri;
    }

    public void setVaris_sehri(String varis_sehri) {
        this.varis_sehri = varis_sehri;
    }

    public String getUcus_gunleri() {
        return ucus_gunleri;
    }

    public void setUcus_gunleri(String ucus_gunleri) {
        this.ucus_gunleri = ucus_gunleri;
    }

    public String getKalkis_zamani() {
        return kalkis_zamani;
    }

    public void setKalkis_zamani(String kalkis_zamani) {
        this.kalkis_zamani = kalkis_zamani;
    }

    public String getVaris_zamani() {
        return varis_zamani;
    }

    public void setVaris_zamani(String varis_zamani) {
        this.varis_zamani = varis_zamani;
    }

    public String getUcak_modeli() {
        return ucak_modeli;
    }

    public void setUcak_modeli(String ucak_modeli) {
        this.ucak_modeli = ucak_modeli;
    }

    public String getUcakNo() {
        return ucakNo;
    }

    public void setUcakNo(String ucakNo) {
        this.ucakNo = ucakNo;
    }

    public String getHavayoluSirketi() {
        return havayoluSirketi;
    }

    public void setHavayoluSirketi(String havayoluSirketi) {
        this.havayoluSirketi = havayoluSirketi;
    }

      
    public void kaydet(String s){
        
     try {
    Files.write(Paths.get("dosya.txt"), s.getBytes(), StandardOpenOption.APPEND);
}catch (IOException e) {
}
        
        
        
        
    }
    
    @Override
    public void run() {
        
        
        
        int kontrol=1;
        
        String[] sure = new String[10];
        String[] gunler= new String[10];
        String[] saat=new String[10];
        String[] varis=new String[10];
         
        
       
        
        
        while(true){
            
        saat=this.kalkis_zamani.split(":");
        int kalkis_saati=Integer.parseInt(saat[0]);
        int kalkis_dakikasi=Integer.parseInt(saat[1]);
        
        gunler=this.ucus_gunleri.split(" ");
        int gunsayisi=gunler.length;
        
            
            sure=AnaEkran.mesaj.split(" ");
            
            
            
            int saatim=Integer.parseInt(sure[0]);
            int dakikam=Integer.parseInt(sure[1]);
      
           
        
            
            
            if(kalkis_saati==saatim){
                
                if(kalkis_dakikasi==dakikam){
                    
                    for(int i=0;i<gunsayisi;i++){
                        
                        
                            
                          if(gunler[i].equals(sure[2])){
                            String ekranayaz=this.ucakNo+" nolu ucak "+this.kalkis_sehri+" sehrinden havalandi\n";
                             
                           AnaEkran.yazdirMesaj=this.ucakNo+" nolu ucak "+this.kalkis_sehri+" sehrinden havalandi";  
                              kaydet(ekranayaz);
                            kontrol=0;
                            break;
                                                    
                        }
                        
                        }
                    }
               
                }
                    
                      
                    
               if(kontrol==0){
                break;
               }
               else
               try {
                   Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ucuslar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
        
         kontrol=1;
         
         
         
         
         
        while(true){
            
            varis=this.varis_zamani.split(":");
        int varis_saati=Integer.parseInt(varis[0]);
        int varis_dakikasi=Integer.parseInt(varis[1]);
            
            sure=AnaEkran.mesaj.split(" ");
        
            int saatim=Integer.parseInt(sure[0]);
            int dakikam=Integer.parseInt(sure[1]);
            
            
            gunler=this.ucus_gunleri.split(" ");
            int gunsayisi=gunler.length;
            
            if(varis_saati==saatim){
                
                if(varis_dakikasi==dakikam){
                    
                    
                    
                    for(int i=0;i<gunsayisi;i++){
                        
                        
                            
                          if(gunler[i].equals(sure[2])){
                            String ekranayaz2=this.ucakNo+" nolu ucak "+this.varis_sehri+" sehrine inis yapti\n";
                             
                           AnaEkran.yazdirMesaj=this.ucakNo+" nolu ucak "+this.varis_sehri+" sehrine inis yapti";  
                              kaydet(ekranayaz2);
                            kontrol=0;
                            break;
                                                    
                        }
                        
                        }
                    }
               
                }
                    
                      
                    
               if(kontrol==0){
                break;
               }
               else
               try {
                   Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ucuslar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
            
            
        }
        
     
        
    }
    