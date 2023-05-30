/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A;

/**
 *
 * @author WIN10PC
 */
public class Data_Gaji {
    private Gaji[] data = new Gaji[100];
    private int index;
    
     public void insert(int index, Gaji gaji){
        data[index] = gaji;
        index++;
    }
    
    public void update(int index, Gaji gaji){
        data[index] = gaji;
    }
    
    public Gaji[] getAll(){
        Gaji[] temp = new Gaji[index];
        for(int i=0;i<index;i++){
            temp[i]=data[i];
        }
        return temp;
    }
    
    public void delete(int index){
        data[index].setNama("");
        data[index].setNIP("");
        data[index].setGol_3a("");
        data[index].setGol_3b("");
        data[index].setGol_3c("");
        data[index].setGaji_pokok("");
        data[index].setTunjangan("");
        data[index].setTotal("");
    }
    
    public static void main(String[] args){
        Data_Gaji data = new Data_Gaji();
        Data_Gaji temp = new Data_Gaji();
        
        temp.setNama("Dhea");
        temp.setNIP("2201081005");
        temp.setGol_3a("1.000.000");
        temp.setGol_3b("2.000.000");
        temp.setGol_3c("3.000.000");
        temp.setGaji_pokok("2.000.000");
        temp.setTunjangan("52%");
        temp.setTotal("Gaji_pokok + Tunjangan");
        data.insert(temp);
        Data_Gaji temp1 = new Data_Gaji();
        temp.setNama("Dhea");
        temp.setNIP("2201081005");
        temp.setGol_3a("1.000.000");
        temp.setGol_3b("2.000.000");
        temp.setGol_3c("3.000.000");
        temp.setGaji_pokok("Gol");
        temp.setTunjangan("52%");
        temp.setTotal("Gaji pokok + Tunjangan");
        data.insert(temp1); 
        //tampilkan
        Gaji[] list = data.getAll();
        for(int i=0;i<list.length;i++){
            System.out.println("Data Gaji--->"+(i+1));
            System.out.println("Nama    :"+list[i].getNama());
            System.out.println("NIP  :"+list[i].getNIP());
            System.out.println("Gol_3a :"+list[i].getGol_3a());
            System.out.println("Gol_3b :"+list[i].getGol_3b());
            System.out.println("Gol_3c :"+list[i].getGol_3c());
            System.out.println("Tunjangan   :"+list[i].getTunjangan());
            System.out.println("Total :"+list[i].getTotal());
        }
    }

    void setNama(String dhea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setNIP(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setGol_3a(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setGol_3b(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setGol_3c(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setGaji_pokok(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setTunjangan(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setTotal(String gaji_pokok__Tunjangan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setGol(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void insert(Data_Gaji temp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}