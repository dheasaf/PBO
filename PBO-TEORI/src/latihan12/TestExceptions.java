/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan12;

/**
 *
 * @author Melida Sari
 */
public class TestExceptions {
    public static void main(String[] args) {
        try {
            for (int i = 0; true; i++) {
                System.out.println("args[" + i + "]=" + args[i]);
            }
        } catch (ArrayIndexOutOfBoundsException i) {
            System.out.println("Exception caught:");
            System.out.println(i);
            System.out.println("Quitting...");
        }
    }
}
