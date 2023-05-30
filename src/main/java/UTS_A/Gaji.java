/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A;

/**
 *
 * @author WIN10PC
 */
public class Gaji {
    private String nama;
    private String NIP;
    private String Gol_3a;
    private String Gol_3b;
    private String Gol_3c;
    private String Gaji_pokok;
    private String Tunjangan;
    private String Total;
    
    public Gaji(){
    }
    
    public Gaji(String nama, String NIP, String Gol, String Gaji_pokok,String Tunjangan){
        this.nama = nama;
        this.NIP= NIP;
        this.Gol_3a = Gol_3a;
         this.Gol_3b = Gol_3b;
          this.Gol_3c = Gol_3c;
        this.Gaji_pokok =Gaji_pokok;
        this.Total = Total;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNIP(){
        return NIP;
    }
    
    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    
    public String getGol_3a(){
        return Gol_3a;
    }
    
    public void setGol_3a(String Gol){
        this.Gol_3a = Gol_3a;
    }
      public String getGol_3b(){
        return Gol_3b;
    }
    
    public void setGol_3b(String Gol){
        this.Gol_3b = Gol_3b;
    }
    
   public String getGol_3c(){
        return Gol_3c;
    }
    
    public void setGol_3c(String Gol){
        this.Gol_3c = Gol_3c;
    }
    
    public String getTunjangan(){
        return Tunjangan;
    }
    
    public void setTunjangan(String Tunjangan){
        this.Tunjangan = Tunjangan;
    }
      public String getGaji_pokok(){
        return Gaji_pokok;
    }
    
    public void setGaji_pokok(String Gaji_pokok){
        this.Gaji_pokok = Gaji_pokok;
    }

    void setTotal(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
        
    
}
