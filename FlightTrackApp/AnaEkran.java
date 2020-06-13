
package donemprojesi;

import com.sun.org.apache.xml.internal.security.c14n.helper.C14nHelper;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Duration;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.applet.AppletThreadGroup;

/**
 *
 * @author msi
 */
public class AnaEkran extends javax.swing.JFrame {
    
   public static String kontrol1="0";
   
   public static int degis=0;
    
    public static String yazdirMesaj;
    
    public static ArrayList<Ucuslar> ucuslarim = new ArrayList<Ucuslar>();
    
    DefaultTableModel model_table;
    DefaultTableModel model_table1;
    
    public static String mesaj;
    
     DefaultListModel model= new DefaultListModel();
    
    public static ArrayList<String> sehirler= new ArrayList<String>();
    
    public static ArrayList<String> getSehirler() {
        return sehirler;
    }

    public static void setSehirler(ArrayList<String> sehirler) {
        AnaEkran.sehirler = sehirler;
    }
    
     public void sehirSil(String silinenSehir){
        sehirler.remove(silinenSehir); 
    
}
    
    public void sehirEkle(String yeniSehir){
        
        sehirler.add(yeniSehir);
    }
    
    public void getTime(){
        String deneme = zaman_label.getText();
        String[] deneme2=deneme.split(":");
        String[] deneme3=deneme2[1].split(" ");
        mesaj=deneme2[0]+" "+deneme3[0]+" "+deneme3[2];
        
    }
    /**
     * Creates new form AnaEkran
     */
    public AnaEkran() {
        initComponents();
        clock();
        
        
       
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AnaEkran.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        CityList.setModel(model);
        model_table =(DefaultTableModel) ucus_tablosu.getModel();
        model_table1 =(DefaultTableModel) ucus_tablosu1.getModel();
        
        
        
        Sehir sehir1=new Sehir("New York");
        Sehir sehir2=new Sehir("Sydney");
        Sehir sehir3=new Sehir("Paris");
        Sehir sehir4=new Sehir("Tokyo");
        Sehir sehir5=new Sehir("Istanbul");
        
        sehirler.add(sehir1.getSehir());
        sehirler.add(sehir2.getSehir());
        sehirler.add(sehir3.getSehir());
        sehirler.add(sehir4.getSehir());
        sehirler.add(sehir5.getSehir());
        
        Ucuslar ucus1= new Ucuslar("New York", "Sydney", "Cumartesi", "23:33", "06:00", "A-380", "123456", "Turkish Airlines");
        Ucuslar ucus2= new Ucuslar("New York", "Istanbul", "Pazartesi Sali", "20:56", "21:10", "Boeing-777", "147852", "Emirates Airlines");
        Ucuslar ucus3= new Ucuslar("Sydney", "Paris", "Sali Cuma", "17:15", "21:00", "A-240", "959582", "Qatar Airlines");
        Ucuslar ucus4= new Ucuslar("Sydney", "Tokyo", "Persembe", "18:30", "23:50", "A-145", "238568", "Turkish Airlines");
        Ucuslar ucus5= new Ucuslar("Paris", "Tokyo", "Sali", "17:45", "22:00", "A-240", "168468", "Pegasus");
        Ucuslar ucus6= new Ucuslar("Paris", "Sydney", "Carsamba Cumartesi", "18:00", "21:00", "B-380", "268184", "Turkish Airlines");
        Ucuslar ucus7= new Ucuslar("Tokyo", "Istanbul", "Pazar", "17:50", "17:55", "Boeing-777", "985268", "Turkish Airlines");
        Ucuslar ucus8= new Ucuslar("Tokyo", "New York", "Pazartesi Pazar", "19:00", "19:05", "Boeing-777", "585564", "American Airlines");
        Ucuslar ucus9= new Ucuslar("Istanbul", "Paris", "Cumartesi Pazar", "17:40", "20:30", "A-380", "168165", "Pegasus");
        Ucuslar ucus10= new Ucuslar("Istanbul", "New York", "Carsamba Cuma", "12:00", "20:15", "A-240", "126185", "American Airlines");
        
        
        ucuslarim.add(ucus1);
        ucuslarim.add(ucus2);
        ucuslarim.add(ucus3);
        ucuslarim.add(ucus4);
        ucuslarim.add(ucus5);
        ucuslarim.add(ucus6);
        ucuslarim.add(ucus7);
        ucuslarim.add(ucus8);
        ucuslarim.add(ucus9);
        ucuslarim.add(ucus10);
        
  
        
        model.addElement("New York");
        model.addElement("Sydney");
        model.addElement("Paris");
        model.addElement("Tokyo");
        model.addElement("Istanbul");
        
        String[] obje1 ={"New York", "Sydney", "Cumartesi", "23:33", "06:00", "A-380", "123456", "Turkish Airlines"};
        model_table.addRow((Object[]) obje1);
        model_table1.addRow((Object[]) obje1);
        String[] obje2 ={"New York", "Istanbul", "Pazartesi Sali", "20:56", "21:10", "Boeing-777", "147852", "Emirates Airlines"};
        model_table.addRow((Object[]) obje2);
        model_table1.addRow((Object[]) obje2);
        String[] obje3 ={"Sydney", "Paris", "Sali Cuma", "00:05", "21:00", "A-240", "959582", "Qatar Airlines"};
        model_table.addRow((Object[]) obje3);
        model_table1.addRow((Object[]) obje3);
        String[] obje4 ={"Sydney", "Tokyo", "Persembe", "18:30", "23:50", "A-145", "238568", "Turkish Airlines"};
        model_table.addRow((Object[]) obje4);
        model_table1.addRow((Object[]) obje4);
        String[] obje5 ={"Paris", "Tokyo", "Sali", "17:45", "22:00", "A-240", "168468", "Pegasus"};
        model_table.addRow((Object[]) obje5);
        model_table1.addRow((Object[]) obje5);
        String[] obje6 ={"Paris", "Sydney", "Carsamba Cumartesi", "18:00", "21:00", "B-380", "268184", "Turkish Airlines"};
        model_table.addRow((Object[]) obje6);
        model_table1.addRow((Object[]) obje6);
        String[] obje7 ={"Tokyo", "Istanbul", "Pazar", "17:50", "17:55", "Boeing-777", "985268", "Turkish Airlines"};
        model_table.addRow((Object[]) obje7);
        model_table1.addRow((Object[]) obje7);
        String[] obje8 ={"Tokyo", "New York", "Pazartesi Pazar", "21:20", "22:05", "Boeing-777", "585564", "American Airlines"};
        model_table.addRow((Object[]) obje8);
        model_table1.addRow((Object[]) obje8);
        String[] obje9 ={"Istanbul", "Paris", "Cumartesi Pazar", "17:40", "20:30", "A-380", "168165", "Pegasus"};
        model_table.addRow((Object[]) obje9);
        model_table1.addRow((Object[]) obje9);
        String[] obje10 ={"Istanbul", "New York", "Carsamba Cuma", "12:00", "20:15", "A-240", "126185", "American Airlines"};
        model_table.addRow((Object[]) obje10);
        model_table1.addRow((Object[]) obje10);
        
        
        
        for (Ucuslar s : ucuslarim) {
            
            s.start();
            
        }
       
    }
   
    
    
    
    public static Calendar cl;
  
  public void  clock(){
        
        Thread th = new Thread(){
            
            
            public void run(){
               
                String gun="";
                try{
                    
                        cl = new GregorianCalendar();
                        int day= cl.get(Calendar.DAY_OF_WEEK);
                        
                        int min=cl.get(Calendar.MINUTE);
                        int hour = cl.get(Calendar.HOUR);
                        int am_pm= cl.get(Calendar.AM_PM);
                        
                        if(am_pm==1){
                            
                            hour=hour+12;
                        }
                        
                        
                        
                           int [] a;
                       
                        
                        
                        
                        while(true){
                            
                            
                            
                            
                            
                            if(kontrol1.equals("0")){
                                
                                
                                min++;
                            if(min==60){
                                hour++;
                                min=0;
                            }
                            if(hour==24){
                                hour=0;
                                day++;
                            }
                            
                            
                            day=day%8;
                            
                            if(day==2)
                                gun="Pazartesi";
                            if(day==3)
                                gun="Sali";
                            if(day==4)
                                gun="Carsamba";
                            if(day==5)                                  //günleri kontrol et yarın bugün cuma gösteriyor
                                gun="Persembe";
                            if(day==6)
                                gun="Cuma";
                            if(day==7)
                                gun="Cumartesi";
                            if(day==1)
                                gun="Pazar";
                            
                            
                            
                            
                            String saat=String.valueOf(hour);
                            String dakika=String.valueOf(min);
                            
                            ucakhavalandi.setText(yazdirMesaj);
                            
                            
                            zaman_label.setText(saat+":"+ dakika +" Gun-> "+gun);
                            
                            getTime();
                            
                                
                            }
                                
                        Thread.sleep(1000);
                            
                            
                        }
                        
                        
                    
                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
                    
                
            }
        };
        
        th.start();
        
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        zaman_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CityList = new javax.swing.JList<>();
        sehir_ekle = new javax.swing.JButton();
        sehir_cikar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ucus_tablosu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        ucakhavalandi = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        duraklat_buton = new javax.swing.JButton();
        devamet_buton = new javax.swing.JButton();
        bitir_buton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ucus_tablosu1 = new javax.swing.JTable();
        ucus_sil_buton = new javax.swing.JButton();
        ucus_yarat_buton = new javax.swing.JButton();
        ucus_guncelle_buton = new javax.swing.JButton();
        kalkis_sehri_tab = new javax.swing.JTextField();
        pazartesi_tab = new javax.swing.JCheckBox();
        Carsamba_tab = new javax.swing.JCheckBox();
        sali_tab = new javax.swing.JCheckBox();
        Persembe_tab = new javax.swing.JCheckBox();
        Cuma_tab = new javax.swing.JCheckBox();
        Cumartesi_tab = new javax.swing.JCheckBox();
        Pazar_tab = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        varis_sehri_tab = new javax.swing.JTextField();
        kalkis_zamani_tab = new javax.swing.JTextField();
        varis_zamani_tab = new javax.swing.JTextField();
        ucak_modeli_tab = new javax.swing.JTextField();
        ucak_no_tab = new javax.swing.JTextField();
        havayolu_tab = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rotar_text = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        havadabekle_text = new javax.swing.JTextField();
        rotar_buton = new javax.swing.JButton();
        inis_engelle_buton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        zaman_label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jScrollPane1.setViewportView(CityList);

        sehir_ekle.setText("Sehir Ekle");
        sehir_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sehir_ekleActionPerformed(evt);
            }
        });

        sehir_cikar.setText("Sehir Cikar");
        sehir_cikar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sehir_cikarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cikarmak istediginiz sehri önce seciniz");

        ucus_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kalkis Sehri", "Varis Sehri", "Ucus Gunleri", "Kalkis Zamani", "Varis Zamani", "Ucak Modeli", "UcakNo", "Havayolu Sirketi"
            }
        ));
        jScrollPane2.setViewportView(ucus_tablosu);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Sistem Zamani");

        ucakhavalandi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("En son gerceklesen kalkis , inis haberi:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Sehirler");

        duraklat_buton.setText("Duraklat");
        duraklat_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duraklat_butonActionPerformed(evt);
            }
        });

        devamet_buton.setText("Devam Et");
        devamet_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devamet_butonActionPerformed(evt);
            }
        });

        bitir_buton.setText("Bitir");
        bitir_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitir_butonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(sehir_ekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sehir_cikar, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel1))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(301, 301, 301)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(duraklat_buton)
                                                .addGap(36, 36, 36)
                                                .addComponent(devamet_buton)
                                                .addGap(34, 34, 34)
                                                .addComponent(bitir_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(zaman_label, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(210, 210, 210)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ucakhavalandi, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ucakhavalandi, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addComponent(zaman_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(duraklat_buton, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(bitir_buton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(devamet_buton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sehir_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(sehir_cikar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("AnaEkran", jPanel2);

        ucus_tablosu1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kalkis Sehri", "Varis Sehri", "Ucus Gunleri", "Kalkis Zamani", "Varis Zamani", "Ucak Modeli", "UcakNo", "Havayolu Sirketi"
            }
        ));
        ucus_tablosu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ucus_tablosu1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ucus_tablosu1);

        ucus_sil_buton.setText("Ucus Sil");
        ucus_sil_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ucus_sil_butonActionPerformed(evt);
            }
        });

        ucus_yarat_buton.setText("Ucus Yarat");
        ucus_yarat_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ucus_yarat_butonActionPerformed(evt);
            }
        });

        ucus_guncelle_buton.setText("Ucus Guncelle");
        ucus_guncelle_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ucus_guncelle_butonActionPerformed(evt);
            }
        });

        pazartesi_tab.setText("Pazartesi");

        Carsamba_tab.setText("Carsamba");

        sali_tab.setText("Sali");

        Persembe_tab.setText("Persembe");

        Cuma_tab.setText("Cuma");
        Cuma_tab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cuma_tabActionPerformed(evt);
            }
        });

        Cumartesi_tab.setText("Cumartesi");

        Pazar_tab.setText("Pazar");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Ucus Gunleri");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Ucus silmek veya Güncellemek icin bir ucus seciniz.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Kalkis Sehri");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Varis Sehri");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Kalkis Zamani");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Varis Zamani");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Ucak Modeli");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Ucak No");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Havayolu Sirketi");

        varis_zamani_tab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varis_zamani_tabActionPerformed(evt);
            }
        });

        mesaj_yazisi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 51));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Secili ucaga eklenecek rotar suresi (dk)");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Secilen ucagin inis yapmadan havada bekleme suresi (dk)");

        rotar_buton.setText("Rotar Ekle");
        rotar_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotar_butonActionPerformed(evt);
            }
        });

        inis_engelle_buton.setText("Inis Engelle");
        inis_engelle_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inis_engelle_butonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kalkis_sehri_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(varis_sehri_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(kalkis_zamani_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(varis_zamani_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ucak_modeli_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ucak_no_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(havayolu_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(272, 272, 272))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pazar_tab)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(171, 171, 171)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ucus_yarat_buton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ucus_sil_buton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(ucus_guncelle_buton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(185, 185, 185)
                                .addComponent(jLabel18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Cuma_tab)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Cumartesi_tab))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(Carsamba_tab)
                                                .addGap(18, 18, 18))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(pazartesi_tab)
                                                .addGap(24, 24, 24)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sali_tab)
                                            .addComponent(Persembe_tab))))
                                .addGap(557, 557, 557)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(havadabekle_text, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(inis_engelle_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(rotar_text, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(rotar_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(420, 420, 420)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kalkis_sehri_tab)
                    .addComponent(varis_sehri_tab)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kalkis_zamani_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varis_zamani_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ucak_modeli_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ucak_no_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(havayolu_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ucus_guncelle_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ucus_sil_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(havadabekle_text, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(pazartesi_tab)
                                            .addComponent(sali_tab)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(rotar_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Carsamba_tab)
                                    .addComponent(Persembe_tab)
                                    .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ucus_yarat_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Cuma_tab)
                                            .addComponent(Cumartesi_tab)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inis_engelle_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(rotar_text, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(Pazar_tab)))
                .addGap(47, 47, 47)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Ucus İslemleri", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sehir_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sehir_ekleActionPerformed
        String yeniSehir=JOptionPane.showInputDialog("Hangi sehiri eklemek istiyorsunuz?");
       
        sehirEkle(yeniSehir);
        
        
        model.addElement(yeniSehir);
        
    }//GEN-LAST:event_sehir_ekleActionPerformed

    private void sehir_cikarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sehir_cikarActionPerformed
        
        String silinenSehir=CityList.getSelectedValue();
        
        sehirSil(silinenSehir);
        
        
        
        model.removeElement(silinenSehir);
        
        
        
        
       
        
        
        
      int satir_sayisi= model_table.getRowCount();
       
       for(int i =0;i<satir_sayisi;i++){
           
           
           String sehir_cikacak = (String)model_table.getValueAt(i, 0);
           String sehir_cikacak2=(String)model_table.getValueAt(i, 1);
           
           if(silinenSehir.equals(sehir_cikacak) || silinenSehir.equals(sehir_cikacak2)){
               
               model_table.removeRow(i);
               model_table1.removeRow(i);
               i--;
               satir_sayisi--;
           }
          
           
       }
       
       
       satir_sayisi=ucuslarim.size();
       
       for(int i=0;i<satir_sayisi;i++){              // satirsayisi-1 olabilir burası
           
        String sehir_cikacak=(String)ucuslarim.get(i).getKalkis_sehri();
        String sehir_cikacak2=(String)ucuslarim.get(i).getVaris_sehri();
        
        if(silinenSehir.equals(sehir_cikacak) || silinenSehir.equals(sehir_cikacak2)){
            
            ucuslarim.remove(i);
            
        }
           
           int yeni_satir_sayisi= ucuslarim.size();
            
            if(satir_sayisi != yeni_satir_sayisi){
                
                satir_sayisi=yeni_satir_sayisi;
                i--;
            }
           
           
           
       }
       
       
        
    }//GEN-LAST:event_sehir_cikarActionPerformed

    private void ucus_sil_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucus_sil_butonActionPerformed
    
        int secili_row=ucus_tablosu1.getSelectedRow();
        
        
        if(secili_row==-1){
            if(ucus_tablosu1.getRowCount() == 0){
                
               mesaj_yazisi.setText("Ucus Tablosu suanda bos.");
            }
            else{
                
                mesaj_yazisi.setText("Lutfen silinecek ucusu secin!");
            }
  
        }
        
        else{
                    
                    model_table1.removeRow(secili_row);
                    model_table.removeRow(secili_row);
                    
                    mesaj_yazisi.setText("Uçuş silindi");
                    
                    }   
        
        ucuslarim.remove(secili_row);
    }//GEN-LAST:event_ucus_sil_butonActionPerformed

    private void varis_zamani_tabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varis_zamani_tabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varis_zamani_tabActionPerformed

    private void Cuma_tabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cuma_tabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cuma_tabActionPerformed

    private void ucus_yarat_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucus_yarat_butonActionPerformed
        
        int kontrol=0;
        
        String kalkis_yeri =kalkis_sehri_tab.getText();
        String varis_yeri=varis_sehri_tab.getText();
        
        
        for(String s : sehirler){
            
            if(kalkis_yeri.equals(s)){
                kontrol++;
           
            }
            
            
            if(varis_yeri.equals(s)){
                kontrol++;
            }
            
            
        }
        
        if(kontrol==2){
        
        
        
        String kalkis_sure=kalkis_zamani_tab.getText();
        String varis_sure=varis_zamani_tab.getText();
        String ucak_modeli=ucak_modeli_tab.getText();
        String ucakNo=ucak_no_tab.getText();        
        String havayoluSirketi=havayolu_tab.getText();
        
        String ucus_gunu="";
        
        if(pazartesi_tab.isSelected())
          ucus_gunu+="Pazartesi ";
        if(sali_tab.isSelected())
          ucus_gunu+="Sali ";
        if(Carsamba_tab.isSelected())
          ucus_gunu+="Carsamba ";
        if(Persembe_tab.isSelected())
          ucus_gunu+="Persembe ";
        if(Cuma_tab.isSelected())
          ucus_gunu+="Cuma ";
        if(Cumartesi_tab.isSelected())
          ucus_gunu+="Cumartesi ";
        if(Pazar_tab.isSelected())
          ucus_gunu+="Pazar ";
     
         Ucuslar ucus=new Ucuslar(kalkis_yeri, varis_yeri, ucus_gunu, kalkis_sure, varis_sure, ucak_modeli, ucakNo, havayoluSirketi);
         ucuslarim.add(ucus);
         
         ucus.start();
         
         String[] obje1 ={kalkis_yeri, varis_yeri, ucus_gunu, kalkis_sure, varis_sure, ucak_modeli, ucakNo, havayoluSirketi};
         model_table.addRow(obje1);
         model_table1.addRow(obje1);
        
        } 
        else{
            mesaj_yazisi.setText("Sehirler listede yok!!");
            
        }
        
        
        
        
        
    }//GEN-LAST:event_ucus_yarat_butonActionPerformed

    private void ucus_tablosu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ucus_tablosu1MouseClicked
        int secili_row=ucus_tablosu1.getSelectedRow();
        
        kalkis_sehri_tab.setText(model_table1.getValueAt(secili_row, 0).toString());
        varis_sehri_tab.setText(model_table1.getValueAt(secili_row, 1).toString());
        kalkis_zamani_tab.setText(model_table1.getValueAt(secili_row, 3).toString());
        varis_zamani_tab.setText(model_table1.getValueAt(secili_row, 4).toString());
        ucak_modeli_tab.setText(model_table1.getValueAt(secili_row, 5).toString());
        ucak_no_tab.setText(model_table1.getValueAt(secili_row, 6).toString());
        havayolu_tab.setText(model_table1.getValueAt(secili_row, 7).toString());

        
        
    }//GEN-LAST:event_ucus_tablosu1MouseClicked

    private void ucus_guncelle_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucus_guncelle_butonActionPerformed
           
        int secili_row=ucus_tablosu1.getSelectedRow();
        
        
        if(secili_row==-1){
            if(ucus_tablosu1.getRowCount() == 0){
                
               mesaj_yazisi.setText("Ucus Tablosu suanda bos.");
            }
            else{
                
                mesaj_yazisi.setText("Lutfen guncellenecek ucusu secin!");
            }
  
        }
        
        else{
            
            model_table1.setValueAt(kalkis_sehri_tab.getText(), secili_row, 0);
            model_table1.setValueAt(varis_sehri_tab.getText(), secili_row, 1);
            model_table1.setValueAt(kalkis_zamani_tab.getText(), secili_row, 3);
            model_table1.setValueAt(varis_zamani_tab.getText(), secili_row, 4);
            model_table1.setValueAt(ucak_modeli_tab.getText(), secili_row, 5);
            model_table1.setValueAt(ucak_no_tab.getText(), secili_row, 6);
            model_table1.setValueAt(havayolu_tab.getText(), secili_row, 7);
            
            
            String ucus_gunu="";
        
        if(pazartesi_tab.isSelected())
          ucus_gunu+="Pazartesi ";
        if(sali_tab.isSelected())
          ucus_gunu+="Sali ";
        if(Carsamba_tab.isSelected())
          ucus_gunu+="Carsamba ";
        if(Persembe_tab.isSelected())
          ucus_gunu+="Persembe ";
        if(Cuma_tab.isSelected())
          ucus_gunu+="Cuma ";
        if(Cumartesi_tab.isSelected())
          ucus_gunu+="Cumartesi ";
        if(Pazar_tab.isSelected())
          ucus_gunu+="Pazar ";
            
            
            
            model_table1.setValueAt(ucus_gunu, secili_row, 2);
            
           
            
            model_table.setValueAt(kalkis_sehri_tab.getText(), secili_row, 0);
            model_table.setValueAt(varis_sehri_tab.getText(), secili_row, 1);
            model_table.setValueAt(kalkis_zamani_tab.getText(), secili_row, 3);
            model_table.setValueAt(varis_zamani_tab.getText(), secili_row, 4);
            model_table.setValueAt(ucak_modeli_tab.getText(), secili_row, 5);
            model_table.setValueAt(ucak_no_tab.getText(), secili_row, 6);
            model_table.setValueAt(havayolu_tab.getText(), secili_row, 7);
            model_table.setValueAt(ucus_gunu, secili_row, 2);
            
            
            
        ucuslarim.get(secili_row).setKalkis_sehri(kalkis_sehri_tab.getText());
        ucuslarim.get(secili_row).setVaris_sehri(varis_sehri_tab.getText());
        ucuslarim.get(secili_row).setKalkis_zamani(kalkis_zamani_tab.getText());
        ucuslarim.get(secili_row).setVaris_zamani(varis_zamani_tab.getText());
        ucuslarim.get(secili_row).setUcakNo(ucak_no_tab.getText());
        ucuslarim.get(secili_row).setUcak_modeli(ucak_modeli_tab.getText());
        ucuslarim.get(secili_row).setUcus_gunleri(ucus_gunu);
        ucuslarim.get(secili_row).setHavayoluSirketi(havayolu_tab.getText());
        
        }
        
        
       
        
        
        
        
        
    }//GEN-LAST:event_ucus_guncelle_butonActionPerformed

    private void devamet_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devamet_butonActionPerformed
        kontrol1="0";
    }//GEN-LAST:event_devamet_butonActionPerformed

    private void duraklat_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duraklat_butonActionPerformed
    
        
        kontrol1="1";
    }//GEN-LAST:event_duraklat_butonActionPerformed

    private void bitir_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bitir_butonActionPerformed
       JOptionPane.showMessageDialog(this, "Sistem bitirliyor");
       System.exit(0);
    }//GEN-LAST:event_bitir_butonActionPerformed

    private void rotar_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotar_butonActionPerformed
        
        int saat=0;
        
        String dakika=rotar_text.getText();
        
        int dakikam=Integer.parseInt(dakika);
        
        for(int i=59;i<dakikam;i=i+60){
            
            saat++;
            
        }
        
        dakikam=dakikam%60;
        
        int selected_row=ucus_tablosu1.getSelectedRow();
        
        String surem=ucuslarim.get(selected_row).getKalkis_zamani();
        
        String inis_surem=ucuslarim.get(selected_row).getVaris_zamani();
        
        String[] varislistesi=inis_surem.split(":");
        
        int inisdegisensaat=Integer.parseInt(varislistesi[0]);
        int inisdegisendakika=Integer.parseInt(varislistesi[1]);
        
        
        
        
        
        
        
        String[] surelistesi=surem.split(":");
        
        int degisensaat=Integer.parseInt(surelistesi[0]);
        
        int degisendakika=Integer.parseInt(surelistesi[1]);
        
        degisendakika+=dakikam;
        
        if(degisendakika>=60){
            
            degisensaat++;
            degisendakika=degisendakika%60;
            
            
        }
        
        degisensaat=degisensaat+saat;
        degisensaat=(degisensaat % 24);
        
        
        
        surelistesi[0]=String.valueOf(degisensaat);
        surelistesi[1]=String.valueOf(degisendakika);
        
        String sonuc1=surelistesi[0]+":"+surelistesi[1];
        
        
        ucuslarim.get(selected_row).setKalkis_zamani(sonuc1);
        
        model_table1.setValueAt(sonuc1, selected_row, 3);
        
        model_table.setValueAt(sonuc1, selected_row,3);
        
        
        
        
        inisdegisendakika+=dakikam;
        
        if(inisdegisendakika>=60){
            
            inisdegisensaat++;
            inisdegisendakika=inisdegisendakika%60;
            
            
        }
        
        inisdegisensaat=inisdegisensaat+saat;
        inisdegisensaat=(inisdegisensaat % 24);
        
        varislistesi[0]=String.valueOf(inisdegisensaat);
        varislistesi[1]=String.valueOf(inisdegisendakika);
        
        String sonuc2=varislistesi[0]+":"+varislistesi[1];
        
        ucuslarim.get(selected_row).setVaris_zamani(sonuc2);
        
        model_table1.setValueAt(sonuc2, selected_row, 4);
        
        model_table.setValueAt(sonuc2, selected_row, 4);
    }//GEN-LAST:event_rotar_butonActionPerformed

    private void inis_engelle_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inis_engelle_butonActionPerformed
        
        int saat=0;
        
        String dakika=havadabekle_text.getText();
        int dakikam=Integer.parseInt(dakika);
        
        for(int i=59;i<dakikam;i=i+60){
            
            saat++;
            
        }
        
        dakikam=dakikam%60;
        
        int selected_row=ucus_tablosu1.getSelectedRow();
        
        String inis_surem=ucuslarim.get(selected_row).getVaris_zamani();
        
        String[] varislistesi=inis_surem.split(":");
        
        int inisdegisensaat=Integer.parseInt(varislistesi[0]);
        int inisdegisendakika=Integer.parseInt(varislistesi[1]);
        
        
        
        inisdegisendakika+=dakikam;
        
        if(inisdegisendakika>=60){
            
            inisdegisensaat++;
            inisdegisendakika=inisdegisendakika%60;
            
            
        }
        
        
        inisdegisensaat=inisdegisensaat+saat;
        inisdegisensaat=(inisdegisensaat % 24);
        
        varislistesi[0]=String.valueOf(inisdegisensaat);
        varislistesi[1]=String.valueOf(inisdegisendakika);
        
        String sonuc2=varislistesi[0]+":"+varislistesi[1];
        
        ucuslarim.get(selected_row).setVaris_zamani(sonuc2);
        model_table1.setValueAt(sonuc2, selected_row, 4);
        
        model_table.setValueAt(sonuc2, selected_row, 4);
        
        
    }//GEN-LAST:event_inis_engelle_butonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkran().setVisible(true);
                
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Carsamba_tab;
    private javax.swing.JList<String> CityList;
    private javax.swing.JCheckBox Cuma_tab;
    private javax.swing.JCheckBox Cumartesi_tab;
    private javax.swing.JCheckBox Pazar_tab;
    private javax.swing.JCheckBox Persembe_tab;
    private javax.swing.JButton bitir_buton;
    private javax.swing.JButton devamet_buton;
    private javax.swing.JButton duraklat_buton;
    private javax.swing.JTextField havadabekle_text;
    private javax.swing.JTextField havayolu_tab;
    private javax.swing.JButton inis_engelle_buton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField kalkis_sehri_tab;
    private javax.swing.JTextField kalkis_zamani_tab;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JCheckBox pazartesi_tab;
    private javax.swing.JButton rotar_buton;
    private javax.swing.JTextField rotar_text;
    private javax.swing.JCheckBox sali_tab;
    private javax.swing.JButton sehir_cikar;
    private javax.swing.JButton sehir_ekle;
    private javax.swing.JTextField ucak_modeli_tab;
    private javax.swing.JTextField ucak_no_tab;
    private javax.swing.JLabel ucakhavalandi;
    private javax.swing.JButton ucus_guncelle_buton;
    private javax.swing.JButton ucus_sil_buton;
    private javax.swing.JTable ucus_tablosu;
    private javax.swing.JTable ucus_tablosu1;
    private javax.swing.JButton ucus_yarat_buton;
    private javax.swing.JTextField varis_sehri_tab;
    private javax.swing.JTextField varis_zamani_tab;
    private javax.swing.JLabel zaman_label;
    // End of variables declaration//GEN-END:variables
}
