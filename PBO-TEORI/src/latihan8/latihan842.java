/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan8;

/**
 *
 * @author WIN10PC
 */
public class latihan842 {
     public static void main(String[] args){
        int angka1 = Integer.parseInt(args[0]);
        int angka2 = Integer.parseInt(args[1]);
        
        //operasi
        int tambah = 0;
        tambah = angka1 + angka2;
        
        int kurang =0;
        kurang = angka1 - angka2;
        
        int kali = 1;
        kali = angka1 * angka2;
        
        int bagi = 1;
        bagi = angka1 / angka2;
        
        //hasil
        System.out.println("sum : "+tambah);
        System.out.println("diff : "+kurang);
        System.out.println("product : "+kali);
        System.out.println("quotient : "+bagi);
    }
    
}
