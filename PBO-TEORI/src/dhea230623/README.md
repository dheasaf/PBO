1.mahkluk hidup
Kode ini adalah definisi dari kelas abstrak MakhlukHidup. Kelas ini memiliki dua metode: bernafas() dan jalan().

Metode bernafas() adalah metode konkret yang didefinisikan di dalam kelas MakhlukHidup. Ketika metode ini dipanggil, ia akan mencetak "Bernafas" ke konsol.

Metode jalan() adalah metode abstrak yang tidak memiliki implementasi di dalam kelas MakhlukHidup. Metode ini ditandai dengan kata kunci abstract dan diikuti oleh tanda kurung kurawal {}. Metode abstrak tidak memiliki tubuh (implementasi) di dalam kelas induk, tetapi harus diimplementasikan oleh kelas-kelas anak yang menggantikan kelas ini.

Kelas abstrak sendiri tidak dapat diinstansiasi, artinya Anda tidak dapat membuat objek langsung dari kelas MakhlukHidup. Namun, Anda dapat mewarisi kelas ini dan mengimplementasikan metode jalan() di kelas anak.

2.manusia
Kode ini adalah sebuah kelas Manusia yang merupakan turunan dari kelas abstrak MakhlukHidup.

Kelas Manusia mengimplementasikan metode abstrak jalan() yang dideklarasikan di kelas MakhlukHidup. Implementasi metode ini mencetak "Berjalan Manusia" ke konsol.

Di dalam metode main(), sebuah objek Manusia dengan nama m dibuat. Kemudian, metode bernafas() dan jalan() dipanggil pada objek m. Metode bernafas() merupakan metode yang diwarisi dari kelas MakhlukHidup, sementara metode jalan() adalah implementasi spesifik untuk kelas Manusia.

3.persegi panjang
Kode ini adalah contoh implementasi kelas PersegiPanjang yang mengimplementasikan antarmuka (interface) Relation.

Kelas PersegiPanjang memiliki dua variabel instance panjang dan lebar yang menyimpan nilai panjang dan lebar persegi panjang.

Konstruktor pertama PersegiPanjang() adalah konstruktor default yang tidak melakukan apa pun.

Konstruktor kedua PersegiPanjang(int panjang, int lebar) adalah konstruktor yang menerima nilai panjang dan lebar sebagai argumen dan menginisialisasi variabel instance panjang dan lebar sesuai dengan nilai yang diberikan.

Metode getLuas() mengembalikan luas persegi panjang dengan mengalikan nilai panjang dan lebar.

Metode getKeliling() mengembalikan keliling persegi panjang dengan menghitung jumlah kedua sisi panjang dan dua sisi lebar.

Kelas PersegiPanjang mengimplementasikan tiga metode yang didefinisikan di antarmuka Relation: isGreater(), isLess(), dan isEqual(). Implementasi metode ini membandingkan luas dua objek PersegiPanjang yang diberikan sebagai argumen. Untuk melakukan perbandingan, metode mengakses luas objek dengan memanggil metode getLuas() pada masing-masing objek dan membandingkan nilainya. Metode ini mengembalikan true jika perbandingan sesuai dengan kondisi yang diberikan.

Di dalam metode main(), dua objek PersegiPanjang dibuat, p1 dengan panjang 5 dan lebar 2, dan p2 dengan panjang 4 dan lebar 3. Objek r dari tipe Relation juga dibuat dan diinisialisasi dengan objek PersegiPanjang. Kemudian, metode isGreater() dan isLess() dari objek r dipanggil untuk membandingkan luas p1 dan p2, dan hasilnya dicetak ke konsol.

Ketika program dijalankan, outputnya akan menjadi:
Luas p1 > luas p2 true
Luas p1 < luas p2 false





