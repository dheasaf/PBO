1.Student Computer
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
            
        System.out.println("Nama      = " + ref.getName());
        System.out.println("Alamat    = " + ref.getAddress());
        System.out.println("Umur      = " + ref.getAge());
        System.out.println("\nNilai Kompetisi Komputer");
        System.out.println("PBO       = " + siswa1.getPbo());
        System.out.println("NETWORK   = " + siswa1.getNetwork());
        System.out.println("WEB       = " + siswa1.getWeb());
        System.out.println("Rata-rata = " + siswa1.getAverage());    
    }
}
Kelas StudentComputer merupakan turunan dari kelas StudentRecord. Kelas ini memiliki empat atribut, yaitu network, pbo, web, dan average, yang merupakan nilai-nilai dalam kompetisi komputer.

Kelas ini memiliki metode akses (getter) dan mutator (setter) untuk masing-masing atribut, yaitu getNetwork(), setNetwork(), getPbo(), setPbo(), getWeb(), setWeb(), getAverage(), dan setAverage().

Metode getAverage() menghitung rata-rata dari nilai web, pbo, dan network dan mengembalikan hasilnya.

Metode getName() di-override dari kelas StudentRecord untuk mencetak pesan "StudentComputer = [nama]" dan mengembalikan nilai atribut name.

Di dalam metode main(), kita membuat objek siswa1 dari kelas StudentComputer. Kemudian, kita menggunakan metode mutator untuk mengatur nilai-nilai atribut network, pbo, dan web.

Variabel referensi ref dari tipe StudentRecord digunakan untuk menyimpan referensi objek siswa1

2.student Record
public class StudentRecord {
    protected String name;
    protected String address;
    protected String age;
        
    public StudentRecord(){
        System.out.println("SuperClass");
    }
    
    public StudentRecord(String name, String address, String age){
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    public StudentRecord(String name){
        this.name = name;
        this.address = "";
        this.age ="";
    }
    
    public String getName(){
        System.out.println("StudentRecord name:" + name);
        return name;
    }
    public String getAddress(){
        return address;
    }
     public String getAge(){
        return age;
    }
     
      
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setAge(String age){
        this.age= age;
    }
}
