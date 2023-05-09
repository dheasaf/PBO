PENJELASAN LATIHAN 61

package latihan6;
import javax.swing.JOptionPane;


/**
 *
 * @author WIN10PC
 */
public class latihan61 {

     public static void main(String[]args)
{
int a=0;
int b=0;
int c=0;
int rata=0;

String input1="";
String input2="";
String input3="";
String hasil="";
String senyum="";

input1=JOptionPane.showInputDialog("Nilai1:" );
input2=JOptionPane.showInputDialog("Nilai2:" );
input3=JOptionPane.showInputDialog("Nilai3:" );

a=Integer.parseInt(input1);
b=Integer.parseInt(input2);
c=Integer.parseInt(input3);

rata=(a+b+c)/3;

if(rata>60){
senyum=":D";
}else
senyum=":(";

hasil +=(hasil)+(" Menghitung Rata-rata")+"\n";
hasil +="\n";
hasil +="Nilai 1:"+Integer.toString(a)+"\n";
hasil +="Nilai 2:"+Integer.toString(b)+"\n";
hasil +="Nilai 3:"+Integer.toString(c)+"\n";

hasil +="\n";
hasil +="Hasil Rata-rata= "+Integer.toString(rata)+"\n"+"\n"+"\n";
JOptionPane.showMessageDialog(null,hasil+"Ekspresi"+" "+senyum);
}

    
}
This Java program prompts the user to input three numbers and calculates their average. It then determines whether the average is greater than 60 and displays a happy or sad face accordingly.

Here's the breakdown of the program:

    The program starts with importing the JOptionPane class from the javax.swing package.
    The latihan61 class is defined with a public static void main method.
    Four integer variables a, b, c, and rata are initialized to 0.
    Four string variables input1, input2, input3, and hasil are initialized to empty strings.
    The showInputDialog method of the JOptionPane class is used to prompt the user to input three numbers, which are stored as strings in input1, input2, and input3.
    The parseInt method of the Integer class is used to convert the string inputs to integers and store them in a, b, and c.
    The average of the three numbers is calculated and stored in rata.
    If the average is greater than 60, a happy face is assigned to the senyum variable; otherwise, a sad face is assigned.
    The hasil string is constructed using concatenation with the += operator and string literals. It contains the input values, the average value, and the expression to be displayed.
    The showMessageDialog method of the JOptionPane class is used to display the hasil string and the senyum expression.

Note that the program does not have any error-handling or input validation, which can lead to runtime errors if the user inputs non-numeric values.

PENJELASAN LATIHAN 62 IF-ELSE
package latihan6;
import javax.swing.JOptionPane;

/**
 *
 * @author WIN10PC
 */
public class latihan62ifelse {

     public static void main(String[]args){
     
            String angka="";
            angka=JOptionPane.showInputDialog("Silahkan masukkan angka ");
            int z = Integer.valueOf(angka).intValue();

            String hasil ="";
            if (z>=1&&z<=10){
            
             hasil += "Valid number";
            }
            else{
            
             hasil += "Invalid Number";
            }
           JOptionPane.showMessageDialog(null, hasil);
           }

    
}
This Java program prompts the user to input a number and checks whether the number is between 1 and 10 (inclusive). It then displays a message indicating whether the number is valid or invalid.

Here's the breakdown of the program:
    The program starts with importing the JOptionPane class from the javax.swing package.
    The latihan62ifelse class is defined with a public static void main method.
    A string variable angka is initialized to an empty string.
    The showInputDialog method of the JOptionPane class is used to prompt the user to input a number, which is stored as a string in angka.
    The valueOf method of the Integer class is used to convert the string input to an integer and store it in z.
    A string variable hasil is initialized to an empty string.
    An if-else statement is used to check if z is between 1 and 10 (inclusive).
        If z is between 1 and 10, the string "Valid number" is appended to hasil.
        Otherwise, the string "Invalid Number" is appended to hasil.
    The showMessageDialog method of the JOptionPane class is used to display the hasil string.

Note that the program assumes that the user inputs a valid integer value. If the user inputs a non-numeric or out-of-range value, the program may produce unexpected results or runtime errors. Therefore, input validation is recommended to ensure that the program handles all possible input values correctly.

PENJELASAN LATIHAN 62 SWITCH
public class latihan62swicth {

     public static void main(String[]args){
     
        String angka="";
        angka=JOptionPane.showInputDialog("Silahkan masukkan angka ");
        int z = Integer.valueOf(angka).intValue();

        String hasil="";
        switch(z){
        
        case 1: hasil+= "Valid Number"; break;
        case 2: hasil+= "Valid Number"; break;
        case 3: hasil+= "Valid Number"; break;
        case 4: hasil+= "Valid Number"; break;
        case 5: hasil+= "Valid Number"; break;
        case 6: hasil+= "Valid Number"; break;
        case 7: hasil+= "Valid Number"; break;
        case 8: hasil+= "Valid Number"; break;
        case 9: hasil+= "Valid Number"; break;
        case 10: hasil+= "Valid Number"; break;
        default: hasil+= "Invalid Number"; break;
        }
       JOptionPane.showMessageDialog(null, hasil);
       } 
}
This Java program also prompts the user to input a number and checks whether the number is between 1 and 10 (inclusive). However, instead of using an if-else statement to check the number, it uses a switch statement.

Here's the breakdown of the program:

    The latihan62swicth class is defined with a public static void main method.
    A string variable angka is initialized to an empty string.
    The showInputDialog method of the JOptionPane class is used to prompt the user to input a number, which is stored as a string in angka.
    The valueOf method of the Integer class is used to convert the string input to an integer and store it in z.
    A string variable hasil is initialized to an empty string.
    A switch statement is used to check the value of z.
        If z is equal to 1, 2, 3, 4, 5, 6, 7, 8, or 9, the string "Valid number" is appended to hasil.
        If z is equal to 10, the string "Valid number" is appended to hasil.
        If z is not equal to any of the above values, the string "Invalid Number" is appended to hasil.
    The showMessageDialog method of the JOptionPane class is used to display the hasil string.

Note that the switch statement is a more concise way to check multiple values of a variable, especially if there are many possible values. However, in this case, using a switch statement is arguably less readable than using an if-else statement, as the switch statement contains many identical cases.

PENJELASAN LATIHAN 63 DO-WHILE
public class latihan63dowile {

     public static void main(String[] args ){
     
         int i=0;
     do{
     
          System.out.println("Dhea safira");
        i++;
     }while(i<100);
    }
    
}
This Java program uses a do-while loop to repeatedly print the string "Dhea safira" 100 times.

Here's how the program works:

    The latihan63dowile class is defined with a public static void main method.
    An integer variable i is initialized to 0.
    A do-while loop is used to repeatedly execute the code block inside the loop.
        The System.out.println method is used to print the string "Dhea safira".
        The value of i is incremented by 1.
        The loop condition is checked, and the loop continues to execute as long as i is less than 100.
    After the loop finishes executing, the program terminates.

Note that the do-while loop is similar to the while loop, but with one key difference: the code block inside a do-while loop is always executed at least once, even if the loop condition is false. In this program, the loop will execute at least once, even if i is initially greater than or equal to 100.

PENJELASAN 63 DOR-LOOP
public class latihan63forlop {

     public static void main(String[] args ){
     
        int i;
      for(i=0; i<100; i++){
      
            System.out.println("Dhea safira");
        
        }
    }
    
}
This Java program uses a for loop to repeatedly print the string "Dhea safira" 100 times.

Here's how the program works:

    The latihan63forlop class is defined with a public static void main method.
    An integer variable i is declared and initialized to 0.
    A for loop is used to repeatedly execute the code block inside the loop.
        The loop header specifies three parts: an initialization expression (i=0), a loop condition (i<100), and an update expression (i++).
        The loop condition is checked at the beginning of each iteration, and the loop continues to execute as long as i is less than 100.
        The code block inside the loop uses the System.out.println method to print the string "Dhea safira".
        The update expression (i++) is executed at the end of each iteration, incrementing the value of i by 1.
    After the loop finishes executing, the program terminates.

In this program, the for loop is a more concise way to write the same logic as the previous do-while loop. The for loop is often used when you know in advance how many times you want to execute the loop.

PENJELASAN LATIHAN 63WHILE-LOOP
public class latihan63whileloop {

     public static void main(String[] args ){
     
        int i=0;
        while(i<100){
        
            System.out.println("Dhea safira");
        i++;
        }
    }
    
}
This Java program uses a while loop to repeatedly print the string "Dhea safira" 100 times.

Here's how the program works:

    The latihan63whileloop class is defined with a public static void main method.
    An integer variable i is declared and initialized to 0.
    A while loop is used to repeatedly execute the code block inside the loop.
        The loop condition (i<100) is checked at the beginning of each iteration, and the loop continues to execute as long as i is less than 100.
        The code block inside the loop uses the System.out.println method to print the string "Dhea safira".
        The update expression (i++) is executed at the end of each iteration, incrementing the value of i by 1.
    After the loop finishes executing, the program terminates.

The while loop is similar to the do-while loop, but the loop condition is checked at the beginning of each iteration, so the loop may not execute at all if the condition is initially false. In this program, the while loop and for loop are interchangeable and produce the same output.

PENJELASAN LATIHAN 64 DO-WHILE
package latihan6;
import java.util.Scanner;

/**
 *
 * @author WIN10PC
 */
public class latihan64dowhile {

     public static void main(String[] args) {
     
    Scanner input = new Scanner(System.in);
    System.out.println("masukkan angka : ");
    int angka = input.nextInt();
    System.out.println("masukkan pangkat : ");
    int pangkat = input.nextInt();

    int i = 1;
    int h = 1;

    do {
    
    h = h*angka;
    i++ ;
    }while(i<pangkat);
    System.out.println(angka +" ^ " + pangkat + " = " +h);
   }
    
}
This program takes an integer and its exponent from the user and calculates its value using the do-while loop. Here's how it works:

    First, it imports the Scanner class from the java.util package, which is used to read input from the user.
    It prompts the user to enter an integer and its exponent using the System.out.println() statement and reads the input using the Scanner.nextInt() method.
    It initializes two integer variables, i and h, to 1.
    
    PENJELASAN LATIHAN 64 FORLOOP
    package latihan6;
import java.util.Scanner;

/**
 *
 * @author WIN10PC
 */
public class latihan64forlop {

     public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka : ");
        int nilai = input.nextInt();
        System.out.println("masukkan pangkat : ");
        int pkt = input.nextInt();

        int h = 1;

        for (int i = 1; i < pkt;i++){
        
        h = h * nilai;
        }
        System.out.println(nilai+ " ^ " + pkt + " = " +h);
         }
    
}
This Java program prompts the user to input two integer values: nilai and pkt. Then, it calculates the value of nilai raised to the power of pkt using a for loop and displays the result.

Here is how the program works:

    The program imports the Scanner class from the java.util package to allow user input.

    The program declares a Scanner object named input and prompts the user to input an integer value for nilai.

    The program uses the nextInt() method of the Scanner class to read the integer value input by the user and assigns it to the variable nilai.

    The program prompts the user to input an integer value for pkt.

    The program uses the nextInt() method of the Scanner class to read the integer value input by the user and assigns it to the variable pkt.

    The program declares and initializes an integer variable h to 1.

    The program enters a for loop that runs pkt-1 times. The loop multiplies the value of nilai with h and assigns the result to h.

    After the loop completes, the program displays the result of nilai raised to the power of pkt by concatenating the values of nilai, pkt, and h using the + operator and printing the resulting string.

Overall, the program calculates the value of nilai raised to the power of pkt using a for loop and displays the result

PENJELASAN LATIHAN 64 WHULELOOP
package latihan6;
import java.util.Scanner;

/**
 *
 * @author WIN10PC
 */
public class latihan64whilelop {

    public static void main(String[] args) {
    
            Scanner b = new Scanner(System.in);
            System.out.println("masukkan angka : ");
            int input = b.nextInt();

            System.out.println("masukkan pangkat : ");
            int pangkat = b.nextInt();

            int i = 1;
            int h = 1;

            while (i<pangkat){
            
            h = h*input;
            i++;
            }
            System.out.println(input + " ^ " +pangkat +" = " +h);

            }
    
}
This Java program prompts the user to input two integer values: input and pangkat. Then, it calculates the value of input raised to the power of pangkat using a while loop and displays the result.

Here is how the program works:

    The program imports the Scanner class from the java.util package to allow user input.

    The program declares a Scanner object named b and prompts the user to input an integer value for input.

    The program uses the nextInt() method of the Scanner class to read the integer value input by the user and assigns it to the variable input.

    The program prompts the user to input an integer value for pangkat.

    The program uses the nextInt() method of the Scanner class to read the integer value input by the user and assigns it to the variable pangkat.

    The program declares and initializes two integer variables i and h to 1.

    The program enters a while loop that runs as long as i is less than pangkat. The loop multiplies the value of input with h and assigns the result to h. It also increments the value of i by 1 in each iteration of the loop.
    




