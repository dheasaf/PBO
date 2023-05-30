/*1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author WIN10PC
 */
public class Menu_Gaji {
     public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        Data_Gaji data = new Data_Gaji();
        int pil=0;
        try {
            
            while(pil!=5){
                System.out.println("1.Input Data");
                System.out.println("2.Hapus Data");
                System.out.println("3.Update Data");
                System.out.println("4.Tampilkan");
                System.out.println("5.Keluar");
                System.out.print("Pilihan Anda ?");
                pil =Integer.parseInt(dataIn.readLine());
                switch(pil){
                    case 1:
                        Data_Gaji temp = new Data_Gaji();
                        System.out.print("Nama      :");
                        temp.setNama(dataIn.readLine());
                        System.out.print("NIP   :");
                        temp.setNIP(dataIn.readLine());
                        System.out.print("Gol_3a  :");
                        temp.setGol(dataIn.readLine());
                        System.out.print("Gol_3b  :");
                        temp.setGol(dataIn.readLine());
                        System.out.print("Gol_3c  :");
                        temp.setGol(dataIn.readLine());
                        System.out.print("Gaji_pokok     :");
                        temp.setGaji_pokok(dataIn.readLine());
                        System.out.print("Tunjangan     :");
                        temp.setTunjangan(dataIn.readLine());
                        System.out.print("Total     :");
                        temp.setTotal(dataIn.readLine());
                        data.insert( temp);
                        break;
                    case 4:
                        Gaji[] list = data.getAll();
                        for(int i=0;i<list.length;i++){
                            System.out.println("Data_Gaji--->"+(i+1));
                            System.out.println("Nama    :"+list[i].getNama());
                            System.out.println("NIP :"+list[i].getNIP());
                            System.out.println("Gol_3a :"+list[i].getGol_3a());
                            System.out.println("Gol_3b :"+list[i].getGol_3b());
                            System.out.println("Gol_3c :"+list[i].getGol_3c());
                            System.out.println("Gaji_pokok   :"+list[i].getGaji_pokok ());
                            System.out.println("Tunjangan :"+list[i].getTunjangan());
                            System.out.println("Total :"+list[i].getTotal());
                        }
                        break;

                }
            }

        } catch (Exception ex) {

        }
    }
    
    
}
