PENJELASAN LATIHAN 81
public class latihan841 {

     public static void main(String[] args){
     
        for(int i=0;i<5;i++){
        
            System.out.println(" "+args[i]);
        }
        System.out.println("number of argument : "+args.length);
    }
    
}
The provided Java code demonstrates an example of accessing command-line arguments and printing them using a for loop. It also prints the total number of arguments passed.

Here's a breakdown of how the code works:

    The main method is defined, which is the entry point of the program.

    Inside the for loop, the loop variable i is initialized to 0, and the loop iterates as long as i is less than 5 (indicating that the loop will run five times).

    Within the loop, the System.out.println(" " + args[i]) statement is used to print the value of the i-th command-line argument. The args array represents the command-line arguments passed to the program, and args[i] accesses the i-th element of that array. The space before args[i] is added for formatting purposes.

    After the loop ends, the System.out.println("number of argument: " + args.length) statement is used to print the total number of command-line arguments passed. args.length returns the length of the args array, which gives the count of command-line arguments.

When you run this code and pass command-line arguments, it will print the values of the first five arguments (if available) using the for loop. Additionally, it will display the total number of arguments passed using args.length. If fewer than five arguments are provided, it will only print the available arguments without causing an error

PENJELASAN 842
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
The provided Java code demonstrates an example of performing basic arithmetic operations on two command-line arguments and printing the results.

Here's a breakdown of how the code works:

    The main method is defined, which is the entry point of the program.

    The first command-line argument (args[0]) is accessed and converted to an integer using Integer.parseInt(args[0]), and the result is stored in the variable angka1. Similarly, the second command-line argument (args[1]) is accessed and converted to an integer, and the result is stored in the variable angka2.

    The variables tambah, kurang, kali, and bagi are initialized to hold the results of addition, subtraction, multiplication, and division operations, respectively.

    The addition operation is performed using angka1 + angka2, and the result is assigned to tambah.

    The subtraction operation is performed using angka1 - angka2, and the result is assigned to kurang.

    The multiplication operation is performed using angka1 * angka2, and the result is assigned to kali.

    The division operation is performed using angka1 / angka2, and the result is assigned to bagi.

    Finally, the results of the operations are printed using System.out.println() statements, displaying the sum, difference, product, and quotient.

When you run this code and provide two command-line arguments as integers, it will perform the specified arithmetic operations on those numbers and print the results accordingly.
