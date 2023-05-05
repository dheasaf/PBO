PENJELASAN LATIHAN 51


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
Kode tersebut merupakan sebuah program Java yang meminta pengguna untuk memasukkan tiga kata melalui konsol, kemudian mencetak ketiga kata tersebut dengan dipisahkan oleh spasi.

Pada baris 2-8, program mengimpor beberapa kelas dari pustaka Java yang dibutuhkan. Kelas BufferedReader digunakan untuk membaca masukan dari konsol, sedangkan InputStreamReader digunakan untuk mengubah byte stream yang dibaca oleh BufferedReader menjadi karakter. Kelas IOException digunakan untuk menangani exception yang mungkin terjadi saat membaca masukan.

Pada baris 11-15, program mendeklarasikan tiga variabel string word1, word2, dan word3.

Pada baris 17-24, program menggunakan blok try-catch untuk membaca masukan dari konsol dengan menggunakan BufferedReader dan InputStreamReader. Program meminta pengguna untuk memasukkan tiga kata berturut-turut, lalu setiap kata disimpan dalam variabel word1, word2, dan word3.

Pada baris 26, program mencetak ketiga kata yang dimasukkan oleh pengguna dengan dipisahkan oleh spasi.

Jadi, ketika program dijalankan, akan meminta pengguna untuk memasukkan tiga kata berturut-turut, kemudian mencetak ketiga kata tersebut dengan dipisahkan oleh spasi.

PENJELASAN LATIHAN 52
import javax.swing.JOptionPane;

/**
 *
 * @author WIN10PC
 */
public class latihan52 {

     public static void main(String[] args){
     
        
        String Word1 = "";
        Word1 =             
        JOptionPane.showInputDialog("Enter Word 1 :");
        
        String Word2 = "";
        Word2 = 
        JOptionPane.showInputDialog("Enter Word 2 :");

        
        String msg = Word1 + " " + Word2 + " " + "Hello " + "!";
        JOptionPane.showMessageDialog(null, msg);
        
    }
    
}
dua kata melalui dialog input (input dialog) dari JOptionPane, kemudian mencetak kedua kata tersebut dengan kata "Hello !" yang ditambahkan, melalui dialog output (message dialog) dari JOptionPane.

Pada baris 1-2, program mengimpor kelas JOptionPane dari pustaka Java Swing.

Pada baris 5-6, program mendeklarasikan dua variabel string Word1 dan Word2.

Pada baris 8-9, program menggunakan method showInputDialog dari JOptionPane untuk memunculkan dialog input dan meminta pengguna memasukkan sebuah kata. Input tersebut disimpan ke variabel Word1. Program melakukan hal yang sama pada baris 12-13 untuk meminta pengguna memasukkan kata kedua, dan menyimpan input tersebut ke variabel Word2.

Pada baris 16, program membuat string msg yang berisi kedua kata yang dimasukkan oleh pengguna, ditambah dengan kata "Hello !" yang ditambahkan dengan spasi.

Pada baris 17, program menggunakan method showMessageDialog dari JOptionPane untuk memunculkan dialog output dan menampilkan variabel msg.

Jadi, ketika program dijalankan, akan memunculkan dua dialog input untuk meminta pengguna memasukkan dua kata, kemudian mencetak kedua kata tersebut dengan kata "Hello !" yang ditambahkan, melalui dialog output.

