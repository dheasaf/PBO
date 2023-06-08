1. Employee
Kode yang Anda berikan adalah contoh penggunaan pewarisan kelas dalam bahasa Java. Dalam bahasa Indonesia, kode tersebut dapat dijelaskan sebagai berikut:

public class Employee extends Person berarti kelas Employee mewarisi (extends) kelas Person. Artinya, kelas Employee akan memiliki semua atribut dan metode yang didefinisikan dalam kelas Person.

@Override digunakan untuk menandai bahwa metode getName() dalam kelas Employee akan menggantikan (override) implementasi metode dengan nama yang sama dalam kelas yang diwarisi, yaitu kelas Person.

public String getName() menunjukkan bahwa metode getName() memiliki tipe pengembalian (return type) String dan dideklarasikan sebagai metode publik (public). Metode ini digunakan untuk mengambil nama (name) objek yang ada dalam kelas.

System.out.println("Employee Name:" + name); merupakan pernyataan yang mencetak nama karyawan ke konsol dengan format "Employee Name: [nama]". Variabel name mengacu pada atribut yang ada di kelas Person yang diwarisi oleh kelas Employee.

return name; mengembalikan nilai name dari metode getName() sebagai hasil dari pemanggilan metode tersebut.

Dengan demikian, kode tersebut menjelaskan kelas Employee yang merupakan turunan dari kelas Person dan menggantikan metode getName() untuk mencetak nama karyawan dan mengembalikan nilainya.

2.Person
Kode ini adalah contoh dari kelas Person dalam bahasa Java. 
public class Person {
    protected String name;
    protected String address;

    /**
     * Konstruktor default
     */
    public Person() {
        System.out.println("Di dalam Person: Konstruktor");
        name = "";
        address = "";
    }

    /**
     * Konstruktor dengan dua parameter
     * @param name    Nama
     * @param address Alamat
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Metode akses untuk mendapatkan nama
     */
    public String getName() {
        System.out.println("Induk: getName");
        return name;
    }

    /**
     * Metode akses untuk mendapatkan alamat
     */
    public String getAddress() {
        return address;
    }

    /**
     * Metode mutator untuk mengatur nama
     * @param name Nama
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metode mutator untuk mengatur alamat
     * @param add Alamat
     */
    public void setAddress(String add) {
        this.address = add;
    }
}
Kelas Person adalah kelas yang memiliki dua atribut, yaitu name dan address, yang diberi hak akses protected sehingga dapat diakses oleh kelas-kelas turunannya.

Konstruktor default (public Person()) digunakan untuk membuat objek Person tanpa argumen. Di dalam konstruktor ini, nama (name) dan alamat (address) diatur menjadi string kosong.

Konstruktor kedua (public Person(String name, String address)) menerima dua parameter, yaitu name dan address, dan mengatur nilai atribut name dan address sesuai dengan nilai parameter yang diberikan.

Metode getName() digunakan untuk mengembalikan nilai dari atribut name. Di dalamnya, ada pernyataan cetak yang menampilkan pesan "Induk: getName".

Metode getAddress() digunakan untuk mengembalikan nilai dari atribut address.

Metode setName(String name) digunakan untuk mengatur nilai atribut name sesuai dengan nilai yang diberikan.

Metode setAddress(String add) digunakan untuk mengatur nilai atribut address sesuai dengan nilai yang diberikan.

Dengan demikian, kelas Person memiliki beberapa metode akses dan mutator yang digunakan untuk mengakses dan mengubah nilai dari atribut name dan address.

3.PolimorfisExample
Kode ini adalah contoh dari kelas Person dalam bahasa Java. 
public class PolimorfisExample {
    public static void main(String[] args) {
        Person ref;
        Student studentObject = new Student();
        Employee employeeObject = new Employee();
        
        studentObject.setName("Anna");
        employeeObject.setName("Budi");
        
        ref = studentObject;
        System.out.println("Nama  :" + ref.getName());
        
        ref = employeeObject;
        System.out.println("Nama  :" + ref.getName());
        
        printInformation(studentObject);
        printInformation(employeeObject);
    }
    
    public static void printInformation(Person ref) {
        if (ref instanceof Student) {
            System.out.println("Nama Student    :" + ref.getName());
            System.out.println("Alamat Student  :" + ref.getAddress());
        } else if (ref instanceof Employee) {
            System.out.println("Nama Employee   :" + ref.getName());
            System.out.println("Alamat Employee :" + ref.getAddress());  
        }
    }
}
Kelas PolimorfisExample memiliki metode main() yang merupakan titik masuk (entry point) untuk program. Di dalamnya, terdapat objek studentObject dari kelas Student dan employeeObject dari kelas Employee.

Pada baris berikutnya, nama "Anna" diatur untuk objek studentObject dan nama "Budi" diatur untuk objek employeeObject menggunakan metode setName().

Variabel referensi ref dari tipe Person digunakan untuk menyimpan referensi objek. Pada baris ref = studentObject;, ref menunjuk pada objek studentObject, dan kemudian metode getName() dipanggil melalui ref untuk mencetak nama objek tersebut.

Pada baris ref = employeeObject;, ref menunjuk pada objek employeeObject, dan kembali metode getName() dipanggil melalui ref untuk mencetak nama objek tersebut.

Metode printInformation() memiliki parameter ref dengan tipe Person. Di dalam metode ini, menggunakan operator instanceof, kita memeriksa tipe objek yang diterima sebagai argumen.

Jika ref adalah instance dari Student, maka metode akan mencetak nama dan alamat mahasiswa. Jika ref adalah instance dari Employee, maka metode akan mencetak nama dan alamat karyawan.

Dalam main(), kita memanggil printInformation() dua kali, satu dengan objek studentObject dan satu lagi dengan objek employeeObject, untuk melihat bagaimana polimorfisme mempengaruhi pemilihan metode yang dipanggil.

Dengan demikian, kode tersebut menggambarkan contoh penggunaan polimorfisme di Java, di mana metode yang dipanggil akan ditentukan secara dinamis berdasarkan tipe objek yang sesuai saat menjalankan program.

4.Student
Kode ini adalah contoh kelas Student yang merupakan turunan dari kelas Person dalam bahasa Java.
public class Student extends Person {
    public Student() {
        super();
        super.name = "anna";
        super.address = "padang";
        
        System.out.println("Di dalam Student: Konstruktor");
        // beberapa kode di sini
    }
    
    @Override
    public String getName() {
        System.out.println("Student: getName");
        return name;
    }
    
    // beberapa kode di sini
    
    public static void main(String[] args) {
        Student anna = new Student();
        System.out.println("Nama: " + anna.getName());
        System.out.println("Alamat: " + anna.getAddress());
    }
}
Kelas Student merupakan turunan dari kelas Person menggunakan kata kunci extends. Konstruktor Student() digunakan untuk membuat objek Student tanpa argumen. Di dalam konstruktor ini, kita memanggil konstruktor dari kelas Person menggunakan super() untuk melakukan inisialisasi awal. Kemudian, kita mengatur nilai atribut name dan address menjadi "anna" dan "padang" menggunakan super.name dan super.address. Pernyataan super digunakan untuk merujuk ke atribut atau metode yang ada di kelas induk.

Metode getName() di-override dari kelas Person untuk mencetak pesan "Student: getName" dan mengembalikan nilai atribut name.

Di dalam metode main(), kita membuat objek anna dari kelas Student. Kemudian, kita memanggil metode getName() dan getAddress() dari objek anna untuk mencetak nama dan alamat yang telah diatur dalam konstruktor Student().

Dengan demikian, kode tersebut menggambarkan kelas Student yang mewarisi kelas Person dan menunjukkan penggunaan konstruktor, metode yang di-override, serta penggunaan atribut dari kelas induk.

5.Student Computer
Kode ini adalah contoh kelas StudentComputer yang merupakan turunan dari StudentRecord dalam bahasa Java.
public class StudentComputer extends StudentRecord {
   double network;
   double pbo;
   double web;
   double average;
   
   //***NETWORK***//
   public double getNetwork() {
        return network;
    }
    public void setNetwork(double network) {
        this.network = network;
    }
    
    //***PBO***//
    public double getPbo() {
        return pbo;
    }
    public void setPbo(double pbo) {
        this.pbo = pbo;
    }
    
    //***WEB***//
    public double getWeb() {
        return web;
    }
    public void setWeb(double web) {
        this.web = web;
    }
    
    public double getAverage() {
         average = (web + pbo + network) / 3;
        return average;
    }
    public void setAverage(double average) {
        this.average = average;
    }
       
    @Override
    public String getName() {
        System.out.println("StudentComputer = " + name);
        return name;
    }
    
    public static void main(String[] args) {
        StudentComputer siswa1 = new StudentComputer();
        siswa1.setNetwork(90);
        siswa1.setPbo(80);
        siswa1.setWeb(70);
           
        StudentRecord ref;
        ref = siswa1;
        ref.setName("ALI");
        ref.setAddress("Padang");
        ref.setAge("19 Tahun");
            
        System.out.println("Nama    = " + ref.getName());
        System.out.println("Alamat  = " + ref.getAddress());
        System.out.println("Umur    = " + ref.getAge());
        System.out.println("\nNilai Kompetisi Komputer");
        System.out.println("PBO     = " + siswa1.getPbo());
        System.out.println("NETWORK = " + siswa1.getNetwork());
        System.out.println("WEB     = " + siswa1.getWeb());
        System.out.println("Rata-rata = " + siswa1.getAverage());  
    }
}
Kelas StudentComputer merupakan turunan dari kelas StudentRecord. Kelas ini memiliki empat atribut, yaitu network, pbo, web, dan average yang merupakan nilai-nilai dalam kompetisi komputer.

Kelas ini memiliki metode akses (getter) dan mutator (setter) untuk masing-masing atribut, yaitu getNetwork(), setNetwork(), getPbo(), setPbo(), getWeb(), setWeb(), getAverage(), dan setAverage().

Metode getAverage() menghitung rata-rata dari nilai web, pbo, dan network dan mengembalikan hasilnya.

Metode getName() di-override dari kelas StudentRecord untuk mencetak pesan "StudentComputer = [nama]" dan mengembalikan nilai atribut name.

Di dalam metode main(), kita membuat objek siswa1 dari kelas StudentComputer. Kemudian, kita menggunakan metode mutator untuk mengatur nilai-nilai atribut network, pbo, dan web.

Variabel referensi ref dari tipe StudentRecord digunakan untuk menyimpan referensi objek siswa1.

6.student Record
Kode ini adalah contoh kelas StudentRecord dalam bahasa Java. 
public class StudentRecord {
    protected String name;
    protected String address;
    protected String age;
        
    public StudentRecord() {
        System.out.println("SuperClass");
    }
    
    public StudentRecord(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    public StudentRecord(String name) {
        this.name = name;
        this.address = "";
        this.age = "";
    }
    
    public String getName() {
        System.out.println("StudentRecord name: " + name);
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setAge(String age) {
        this.age = age;
    }
}
Kelas StudentRecord merupakan kelas utama yang berfungsi sebagai kelas dasar (superclass) dari kelas StudentComputer. Kelas ini memiliki tiga atribut yang dilindungi (protected), yaitu name, address, dan age, yang merupakan informasi dasar tentang catatan siswa.

Kelas ini memiliki beberapa konstruktor:

    Konstruktor StudentRecord() merupakan konstruktor default yang mencetak pesan "SuperClass". Digunakan untuk membuat objek StudentRecord tanpa argumen.
    Konstruktor StudentRecord(String name, String address, String age) digunakan untuk membuat objek StudentRecord dengan nilai-nilai name, address, dan age yang disediakan.
    Konstruktor StudentRecord(String name) digunakan untuk membuat objek StudentRecord dengan nilai name yang disediakan, sedangkan address dan age diatur sebagai string kosong.

Kelas ini juga memiliki metode-metode akses (getter) dan mutator (setter) untuk masing-masing atribut, yaitu getName(), getAddress(), getAge(), setName(), setAddress(), dan setAge(). Metode-metode ini digunakan untuk mendapatkan dan mengatur nilai dari atribut-atribut tersebut.

Dalam metode getName(), pesan "StudentRecord name: [nama]" dicetak dan nilai atribut name dikembalikan.

Kelas StudentRecord merupakan kelas dasar yang dapat digunakan sebagai kerangka untuk menciptakan objek-objek catatan siswa dengan informasi nama, alamat, dan usia.




