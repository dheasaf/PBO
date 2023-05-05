# PBO_Teori

#modul _1
Kata komputer berasal dari bahasa Latin yaitu Computare yang artinya menghitung. 
Dalam bahasa Inggris disebut to compute. Secara definisi komputer diterjemahkan 
sebagai sekumpulan alat elektronik yang saling bekerja sama, dapat menerima data 
(input), mengolah data (proses) dan memberikan informasi (output) serta terkoordinasi 
dibawah kontrol program yang tersimpan di memorinya.
1.6 Sistem Numerik dan Konversi 
Bilangan dapat disajikan dalam beberapa cara. Cara penyajiannya tergantung pada Basis 
(BASE) bilangan tersebut. Terdapat 4 cara utama dalam penyajian bilangan. 
1.6.1 Sistem Bilangan Desimal 
Manusia umumnya menggunakan bilangan pada bentuk desimal. Bilangan desimal 
adalah sistem bilangan yang berbasis 10. Hal ini berarti bilangan – bilangan pada sistem 
ini terdiri dari 0 sampai dengan 9. Berikut ini beberapa contoh bilangan dalam bentuk 
desimal : 
12610 (umumnya hanya ditulis 126) 
1110 (umumnya hanya ditulis 11) 
1.6.2 Sistem Bilangan Biner 
Bilangan dalam bentuk biner adalah bilangan berbasis 2. Ini menyatakan bahwa 
bilangan yang terdapat dalam sistem ini hanya 0 dan 1. Berikut ini contoh penulisan dari 
bilangan biner : 
11111102 
10112 
1.6.3 Sistem Bilangan Oktal 
Bilangan dalam bentuk oktal adalah sistem bilangan yang berbasis 8. Hal ini berarti 
bilangan – bilangan yang diperbolehkan hanya berkisar antara 0 – 7. Berikut ini contoh 
penulisan dari bilangan oktal : 
1768 
138 
1.6.4 Sistem Bilangan Heksadesimal 
Bilangan dalam sistem heksadesimal adalah sistem bilangan berbasis 16. Sistem ini 
hanya memperbolehkan penggunaan bilangan dalam skala 0 – 9, dan menggunaan 
huruf A – F, atau a – f karena perbedaan kapital huruf tidak memiliki efek apapun.
1.6.5.1 Desimal ke Biner / Biner ke Desimal 
Untuk mengubah angka desimal menjadi angka biner digunakan metode pembagian
dengan angka 2 sambil memperhatikan sisanya. Ambil hasil bagi dari proses pembagian
sebelumnya, dan bagi kembali bilangan tersebut dengan angka 2. Ulangi langkah –
langkah tersebut hingga hasil bagi akhir bernilai 0 atau 1. Kemudian susun nilai – nilai 
sisa dimulai dari nilai sisa terakhir sehingga diperoleh bentuk biner dari angka bilangan 
tersebut.

#modul_2
Pada 1991, sekelompok insinyur Sun dipimpin oleh Patrick Naughton dan James 
Gosling ingin merancang bahasa komputer untuk perangkat konsumer seperti cable 
TV Box. Karena perangkat tersebut tidak memiliki banyak memori, bahasa harus 
berukuran kecil dan mengandung kode yang liat. Juga karena manufaktur – 
manufaktur berbeda memilih processor yang berbeda pula, maka bahasa harus 
bebas dari manufaktur manapun. Proyek diberi nama kode ”Green”. 
Kebutuhan untuk fleksibilitas, kecil, liat dan kode yang netral terhadap platform 
mengantar tim mempelajari implementasi Pascal yang pernah dicoba. Niklaus Wirth, 
pencipta bahasa Pascal telah merancang bahasa portabel yang menghasilkan 
intermediate code untuk mesin hipotesis. Mesin ini sering disebut dengan mesin 
maya (virtual machine). Kode ini kemudian dapat digunakan di sembarang mesin 
yang memiliki interpreter. Proyek Green menggunakan mesin maya untuk mengatasi 
isu utama tentang netral terhadap arsitektur mesin.

#modul_3
 Program Java Pertama
public class Hello 
{ 
 /**
 * My first java program
 */
 public static void main(String[] args) {
//Menampilkan kata "Hello world" dilayar
 System.out.println("Hello world!"); 
 } 
}

#modul_4
4.2 Menganalisa program Java pertama saya 
Sekarang, kita akan berusaha untuk menganalisa program java pertama anda : 
public class Hello 
{ 
 /** 
 * My first java program 
 */ 
 public static void main(String[] args) { 
 //menampilkan string”Hello world” pada screen 
 
 System.out.println("Hello world!"); 
 } 
}
Baris pertama kode : 
public class Hello 
mengindikasikan nama class yaitu Hello. Pada java semua kode seharusnya ditempatkan 
didalam deklarasi class. Kita melakukannya dengan menggunakan kata kunci class. 
Sebagai tambahan, class menggunakan akses khusus public, yang mengindikasikan bahwa 
class kita mempunyai akses bebas ke class yang lain dari package yang lain pula (package 
merupakan kumpulan class-class). Kita akan membahas lebih dalam mengenai package dan 
akses khusus pada pembahasan selanjutnya. 
Baris berikutnya yaitu yang terdiri atas kurung kurawal { mengindikasikan awal blok. Pada 
kode ini, kita menempatkan kurung kurawal pada baris selanjutnya setelah deklarasi class, 
bagaimanapun, kita dapat juga meletakkan kurung kurawal ini setelah baris pertama dari 
kode yang kita tulis. Jadi, kita dapat menulis kode kita sebagai berikut : 
public class Hello 
{ 
atau 
 public class Hello { 
Tiga baris selanjutnya mengindikasikan adanya komentar dalam bahasa java. Komentar 
adalah sesuatu yang digunakan untuk mendokumentasikan setiap bagian dari kode yang 
ditulis. Komentar bukan merupakan bagian dari program itu sendiri, tetapi digunakan untuk 
tujuan dokumentasi. Komentar itu sendiri dapat ditambahkan pada kode yang anda tulis 
sebagai petunjuk yang dapat membantu proses pembelajaran pemrograman yang baik. 
/** 
* My first java program 
*/ 
Komentar diindikasikan oleh tanda “/*” dan “*/”. Segala sesuatu yang ada diantara tanda 
tersebut diabaikan oleh compiler java, dan mereka hanya dianggap sebagai komentar. 
Baris selanjutnya, 
public static void main(String[] args) { 
atau dapat juga ditulis sebagai berikut, 
public static void main(String[] args) 
{ 
mengindikasikan nama suatu method dalam class Hello yang bertindak sebagai method 
utama. Method utama adalah titik awal dari suatu program java. Semua proram kecuali 
applet yang ditulis dalam bahasa java dimulai dengan method utama

#modul_5
 Menggunakan BufferedReader untuk 
mendapatkan input 
Pada bagian ini, kita akan menggunakan kelas BufferedReader yang berada di java.io
package untuk mendapatkan input dari keyboard. 
Berikut ini adalah langkah-langkah yang diperlukan untuk mendapatkan input dari 
keyboard: 
1. Tambahkan di bagian paling atas code anda: 
import java.io.*; 
2. Tambahkan statement ini: 
BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
3. Deklarasikan variabel String temporer untuk mendapatkan input, dan gunakan fungsi 
readLine() untuk mendapatkan input dari keyboard. Anda harus mengetikkannya di 
dalam blok try-catch: 
try{ 
 String temp = dataIn.readLine(); 
 } 
 catch( IOException e ){ 
 System.out.println(“Error in getting input”); 
 }
 import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 
public class GetInputFromKeyboard 
{ 
 public static void main( String[] args ){ 
 
 BufferedReader dataIn = new BufferedReader(new 
 InputStreamReader( System.in) ); 
 String name = ""; 
 
 System.out.print("Please Enter Your Name:"); 
 
 try{ 
 name = dataIn.readLine(); 
 }catch( IOException e ){ 
 System.out.println("Error!"); 
 } 
 System.out.println("Hello " + name +"!"); 
 } 
} 
Berikutnya akan dijelaskan setiap baris dari code: 
Statement, 
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 
menjelaskan bahwa kita akan menggunakan kelas BufferedReader, InputStreamReader
dan IOException yang berada di java.io package. Java Application Programming 
Interface (API) sudah berisi ratusan kelas yang bisa digunakan untuk program anda. 
Kelas-kelas tersebut dikumpulkan ke dalam packages. 
Packages memiliki kelas yang mempunyai fungsi yang saling berhubungan. Seperti 
pada contoh di atas, java.io package mengandung kelas-kelas yang memungkinkan 
program untuk melakukan input dan output data. Statement diatas juga dapat ditulis, 
import java.io.*; 
yang akan mengeluarkan semua kelas yang berada pada paket, dan selanjutnya kita 
bisa menggunakan kelas-kelas tersebut pada program kita.

#modul_6
Statement if 
Statement-if menentukan sebuah statement (atau blok kode) yang akan dieksekusi jika 
dan hanya jika persyaratan boolean (boolean statement) bernilai true. 
Bentuk dari statement if, 
if( boolean_expression ) 
 statement; 
atau 
if( boolean_expression ){ 
 statement1; 
 statement2; 
 . . . 
}
dimana, boolean_expression adalah sebuah persyaratan boolean (boolean statement) 
atau boolean variabel. 
Berikut ini adalah contoh code statement if, 
int grade = 68; 
if( grade > 60 ) System.out.println("Congratulations!"); 
atau 
int grade = 68; 
if( grade > 60 ){ 
 System.out.println("Congratulations!"); 
 System.out.println("You passed!"); 
}
Statement if-else 
Statement if-else digunakan apabila kita ingin mengeksekusi sebuah statement dengan 
kondisi true dan statement yang lain dengan kondisi false. 
Bentuk statement if-else, 
if( boolean_expression ) 
 statement; 
else 
 statement; 
dapat juga ditulis seperti, 
if( boolean_expression ){ 
 statement1; 
 statement2; 
 . . . 
} 
else{ 
 statement1; 
 statement2; 
 . . . 
} 
Berikut ini contoh code statement if-else, 
int grade = 68; 
if( grade > 60 ) System.out.println("Congratulations!"); 
else System.out.println("Sorry you failed"); 
atau 
int grade = 68; 
if( grade > 60 ){ 
 System.out.println("Congratulations!"); 
 System.out.println("You passed!"); 
} 
else{ 
 System.out.println("Sorry you failed");
 }
 
 #modul_7
 Sebagai contoh, kita memiliki tiga variabel dengan tipe data int yang memiliki identifier
yang berbeda untuk tiap variabel. 
int number1; 
int number2; 
int number3; 
number1 = 1; 
number2 = 2; 
number3 = 3; 
Seperti yang dapat Anda perhatikan pada contoh diatas, hanya untuk menginisialisasi 
dan menggunakan variabel terutama pada saat variabel-variabel tersebut memiliki 
tujuan yang sama, dirasa sangat membingungkan. Di Java maupun di bahasa 
pemrograman yang lain, mereka memiliki kemampuan untuk menggunakan satu 
variabel yang dapat menyimpan sebuah data list dan kemudian memanipulasinya 
dengan lebih efektif. Tipe variabel inilah yang disebut sebagai array.
Array harus dideklarasikan seperti layaknya sebuah variabel. Apabila Anda 
mendeklarasikan array, Anda harus membuat sebuah list dari tipe data, yang diikuti oleh 
tanda kurung buka dan kurung tutup, yang diikuti oleh nama identifier. Sebagai contoh, 
int []ages; 
atau Anda dapat menempatkan kurung buka dan kurung tutupnya setelah identifier. 
Sebagai contoh, 
int ages[];
Setelah pendeklarasian, kita harus membuat array dan menentukan berapa panjangnya 
dengan sebuah konstruktor. Proses ini di Java disebut sebagai instantiation ( Kata 
dalam Java yang berarti membuat ). Untuk meng-instantiate sebuah obyek, kita 
membutuhkan sebuah konstruktor. Kita akan membicarakan lagi mengenai instantiate
obyek dan pembuatan konstruktor pada bagian selanjutnya. Perlu dicatat, bahwa ukuran 
dari array tidak dapat diubah setelah Anda menginisialisasinya. Sebagai contoh, 
 
//deklarasi 
int ages[]; 
 
Gambar 2: Inisialisasi Arrays 
//instantiate obyek 
ages = new int[100]; 
atau bisa juga ditulis dengan, 
//deklarasi dan instantiate 
obyek 
int ages[] = new 
int[100]; 
Pada contoh diatas, deklarasi akan 
memberitahukan kepada compiler Java, 
bahwa identifier ages akan digunakan 
sebagai nama array yang berisi data-data 
integer, dan kemudian untuk membuat atau 
meng-instantiate sebuah array baru yang 
terdiri dari 100 elemen. 
Selain menggunakan sebuah keyword baru 
untuk meng-instantiate array, Anda juga 
dapat secara otomatis mendeklarasikan 
array, membangunnya, kemudian 
memberikan sebuah value.
//membuat sebuah array yang berisi variabel-variabel //boolean 
pada sebuah identifier. Array ini terdiri dari 4 //elemen yang 
diinisilisasikan sebagai value //{true,false,true,false} 
boolean results[] ={ true, false, true, false }; 
//Membuat sebuah array yang terdiri dari penginisialisasian //4 
variabel double bagi value {100,90,80,75} 
double []grades = {100, 90, 80, 75}; 
//Membuat sebuah array String dengan identifier days. Array 
//ini terdiri dari 7 elemen. 
String days[] = { “Mon”, “Tue”, “Wed”, “Thu”, “Fri”, “Sat”, 
“Sun”};

#Bab 8
 Argumen Command-line 
Sebuah aplikasi Java dapat menerima berbagai argumen dari command-line. Argumen 
dari command line memberikan kesempatan bagi user untuk mempengaruhi operasi dari 
sebuah aplikasi dalam sekali invokasi. User memasukkan argumen command line pada 
saat meng-invoke aplikasi dan memberikan spesifikasi kepada aplikasi tersebut setelah 
nama kelas untuk dijalankan.
 Di bahasa Java, apabila 
Anda akan memanggil sebuah aplikasi, sebuah runtime system akan memberikan 
argumen command-line ke main method lewat array dari String, dimana tiap String 
dalam array terdiri dari sebuah argumen commmand-line. Perhatikan deklarasi dari main 
method, 
public static void main( String[] args ) 
Argumen yang diberikan kepada program Anda akan disimpan kedalam sebuah array 
String dengan identifier args. 
Pada contoh sebelumnya, argumen dari command-line yang akan diberikan kepada 
aplikasi sort command adalah lima buah String yaitu “5”,”4”,”3”,”2”, dan “1”. Anda 
dapat mengetahaui berapa banyak argumen dari command-line dengan cara melihat 
panjang dari attribute array. 
Sebagai contoh, 
int numberOfArgs = args.length; 
Jika program Anda membutuhkan support sebuah argumen command-line yang 
numeric. Anda harus mengkonversi String argumen tersebut untuk merepresantasikan 
sebuah nomor, misalnya “34” menjadi sebuah nomor. Kode dibawah ini adalah sebuah 
potongan untuk mengkonversi sebuah argumen command-line menjadi integer. 
int firstArg = 0; 
if (args.length > 0){
firstArg = Integer.parseInt(args[0]); 
} 
parseInt akan mendapatkan NumberFormatException (ERROR) jika format args[0] tidak 
valid (bukan sebuah nomor).
Argument Command-line di NetBeans 
Untuk menggambarkan bagaimana sebuah argumen diberikan pada program di 
NetBeans, marilah kita membuat sebuah program Java yang akan mencetak jumlah 
argumen dimana argumen pertama yang telah diberikan pada program tersebut. 
public class CommandLineExample 
{ 
 public static void main( String[] args ){ 
 
 System.out.println("Number of arguments=" + 
 args.length); 
 System.out.println("First Argument="+ args[0]); 
 } 
} 
Sekarang, jalankan NetBeans, buat sebuah project yang baru, dan beri nama project ini 
CommanLineExample. Copy kode yang telah dituliskan diatas, kemudian compile. 
Setelah itu, ikutilah langkah-langkan berikut ini untuk memberikan argumen kepada 
program Anda dengan menggunakan NetBeans.

 
