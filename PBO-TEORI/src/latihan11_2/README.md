
1.Circle
Kode ini adalah contoh kelas Circle dalam bahasa Java.
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public String getName() {
        return "Circle";
    }
}
Kelas Circle merupakan kelas yang merepresentasikan sebuah lingkaran. Kelas ini memiliki satu atribut radius yang merupakan jari-jari lingkaran dan di-deklarasikan sebagai variabel private.

Kelas ini memiliki konstruktor Circle(double radius) yang digunakan untuk membuat objek Circle dengan jari-jari yang ditentukan.

Metode getArea() digunakan untuk menghitung dan mengembalikan luas lingkaran. Luas lingkaran dihitung dengan rumus π * r * r, di mana r adalah jari-jari lingkaran.

Metode getName() mengembalikan nama "Circle".

2.Main
Kode ini adalah contoh kelas Main dalam bahasa Java.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(30);
        System.out.println("Area of " + circle.getName() + ": " + circle.getArea());

        Square square = new Square(17);
        System.out.println("Area of " + square.getName() + ": " + square.getArea());
    }
}
Kelas Main merupakan kelas utama yang berfungsi sebagai tempat eksekusi program. Di dalam metode main(), kita melakukan beberapa tindakan:

    Membuat objek circle dari kelas Circle dengan jari-jari 30.
    Menggunakan objek circle untuk mencetak luas lingkaran dengan menggunakan metode getName() untuk mendapatkan nama "Circle" dan metode getArea() untuk mendapatkan luas lingkaran.
    Membuat objek square dari kelas Square dengan panjang sisi 17.
    Menggunakan objek square untuk mencetak luas persegi dengan menggunakan metode getName() untuk mendapatkan nama "Square" dan metode getArea() untuk mendapatkan luas persegi.

Dengan demikian, program ini akan mencetak luas lingkaran dan luas persegi ke layar.

3.Shape
Kode ini mengandung beberapa kelas dalam bahasa Java yang menggunakan konsep abstraksi.
abstract class Shape {
    public abstract double getArea();
    public abstract String getName();
}
Kelas Shape adalah kelas abstrak yang mendefinisikan dua metode abstrak: getArea() dan getName(). Metode getArea() digunakan untuk menghitung luas bentuk, sedangkan metode getName() digunakan untuk mendapatkan nama bentuk. Karena kelas Shape adalah kelas abstrak, tidak dapat dibuatkan objek langsung dari kelas ini.
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public String getName() {
        return "Circle";
    }
}
Kelas Circle merupakan turunan dari kelas abstrak Shape. Kelas ini mengimplementasikan metode-metode abstrak yang didefinisikan di kelas Shape, yaitu getArea() untuk menghitung luas lingkaran dan getName() untuk mendapatkan nama "Circle". Kelas Circle memiliki atribut radius yang merepresentasikan jari-jari lingkaran
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public String getName() {
        return "Square";
    }
}
Kelas Square juga merupakan turunan dari kelas abstrak Shape. Kelas ini mengimplementasikan metode-metode abstrak yang didefinisikan di kelas Shape, yaitu getArea() untuk menghitung luas persegi dan getName() untuk mendapatkan nama "Square". Kelas Square memiliki atribut side yang merepresentasikan panjang sisi persegi.

Dengan menggunakan konsep abstraksi, kelas Circle dan Square dapat digunakan untuk menghitung luas dan mendapatkan nama bentuk tanpa perlu memperhatikan implementasi detailnya.

4.Square
Kode ini adalah contoh kelas Square dalam bahasa Java.
public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public String getName() {
        return "Square";
    }
}
Kelas Square merepresentasikan sebuah persegi. Kelas ini memiliki satu atribut side yang merupakan panjang sisi persegi dan di-deklarasikan sebagai variabel private.

Kelas ini memiliki konstruktor Square(double side) yang digunakan untuk membuat objek Square dengan panjang sisi yang ditentukan.

Metode getArea() digunakan untuk menghitung dan mengembalikan luas persegi. Luas persegi dihitung dengan mengalikan panjang sisi dengan panjang sisi.

Metode getName() mengembalikan nama "Square".

Dengan menggunakan kelas Square, kita dapat membuat objek persegi dengan panjang sisi tertentu dan menghitung luasnya dengan menggunakan metode getArea() serta mendapatkan nama persegi dengan menggunakan metode getName().

