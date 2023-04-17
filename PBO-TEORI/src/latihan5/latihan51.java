/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author WIN10PC
 */
public class latihan51 {
     public static void main(String[] args) {
        BufferedReader dataIn
                = new BufferedReader(new InputStreamReader(System.in));
        String word1 = "";
        String word2 = "";
        String word3 = "";

        try {
            System.out.println("Enter word1 :");
            word1 = dataIn.readLine();
            System.out.println("Enter word2 :");
            word2 = dataIn.readLine();
            System.out.println("Enter word3 :");
            word3 = dataIn.readLine();

        } catch (IOException ex) {
            System.out.println("Error!");

        }

        System.out.println( word1  + " " +  word2  + " " + word3 );

    }
}

