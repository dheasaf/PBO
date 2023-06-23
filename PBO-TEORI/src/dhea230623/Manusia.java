package dhea230623;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Labor 1
 */
public class Manusia extends MakhlukHidup{
    public void jalan(){
        System.out.println("Berjalan Manusia");
    }
    
    public static void main(String[] args) {
        Manusia m = new Manusia();
        m.bernafas();
        m.jalan();
    }
}
