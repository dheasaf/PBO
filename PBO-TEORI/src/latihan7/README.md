PENJELASAN LATIHAN 71
public class latihan71 {

     public static void main(String[] args){
     
       
        
        String days[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        
         int i = 0;
         do
         {
         
             System.out.println(days[i]);
             i++;
             
         }while(i<days.length);
    
}
    
}
The given Java code is an example of using a do-while loop to iterate through an array of strings representing the days of the week and print them out.

Here's a breakdown of how the code works:

    The String array days is declared and initialized with the names of the days of the week.

    The variable i is initialized to 0. This variable will be used as the index to access elements of the days array.

    The do keyword starts the do-while loop.

    Inside the loop, the current day is printed using System.out.println(days[i]).

    The i variable is incremented using i++ to move to the next index.

    The while keyword is used to specify the condition for looping. In this case, the loop continues as long as i is less than the length of the days array (i < days.length).

    If the condition is true, the loop continues to the next iteration. If the condition is false, the loop terminates.
    
    PENJELASAN LATIHAN 72 WHILELOOP
    package latihan7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author WIN10PC
 */
public class latihan71whilelop {


    public static void main(String[]args)
    {
        String[] hari = { "Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};

        int i=0;
        while(i<hari.length)
            {
            
                System.out.println(hari[i]);
               i++;
            }
    }
    
}
The provided Java code is an example of using a while loop to iterate through an array of strings representing the days of the week and print them out.

Here's a breakdown of how the code works:

    The String array hari is declared and initialized with the names of the days of the week.

    The variable i is initialized to 0. This variable will be used as the index to access elements of the hari array.

    The while loop is used to iterate as long as the condition i < hari.length is true.

    Inside the loop, the current day is printed using System.out.println(hari[i]).

    The i variable is incremented using i++ to move to the next index.

    The loop continues until the condition i < hari.length becomes false, i.e., when i reaches the length of the hari array.

When you run this code, it will print the names of the days of the week in the order they appear in the hari array: "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu".

PENJELASAN LATIHAN 72 JAVA
public class latihan72 {

     public static void main(String[] args){
     
        int[] angka = new int[10];
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try{
        
            for(int i=0;i<angka.length;i++){
           System.out.println("Input nilai ke--->" + (i+1));
           angka[i] = Integer.parseInt(dataIn.readLine());
            }
        }catch(Exception ex){ 
        
        };
        int max=0;
        for(int i=0;i<angka.length;i++){
        
            max = (angka[i] > max)? angka[i]:max;
        }
        for(int i=0;i<angka.length;i++){
        The provided Java code demonstrates an example of getting input from the user for 10 integer values and finding the maximum value among them.

Here's a breakdown of how the code works:

    An integer array angka of size 10 is declared to store the input values.

    An instance of BufferedReader is created to read input from the user using InputStreamReader(System.in).

    A try-catch block is used to handle any exceptions that may occur during input.

    Inside the try block, a for loop is used to iterate from 0 to angka.length - 1.

    Within the loop, the user is prompted to input a value for each index of the array using System.out.println("Input nilai ke--->" + (i+1)), and the input value is stored in angka[i] after converting it to an integer using Integer.parseInt(dataIn.readLine()).

    After the input values are obtained, another for loop is used to find the maximum value among the elements in the angka array. The variable max is initialized as 0 and then updated with the larger value between angka[i] and max using the ternary operator (angka[i] > max) ? angka[i] : max.

    Next, a for loop is used to print the index and the first element of the angka array for each index. However, it seems that there is a mistake in this part of the code. Instead of angka[0], it should be angka[i] to print the correct values for each index.

    Finally, the maximum value is printed using System.out.println("Nilai Max =" + max).

When you run this code, it will prompt you to enter 10 integer values. After you provide the input, it will display the entered values and the maximum value among them.
        System.out.println("Nilai ke--->"+ (i+1) + " " + angka[0]);
        }
        
        System.out.println("Nilai Max ="+max);
    }
    
}

PENEJLASAN LATIHAN 73
public class latihan73 {

     public static void main(String[] args){
     
        String entry[][] = {{"Floence","735-1234","Manila"},{"Joyce","983-3333","Quezon City"},
            {"Becca","456-3322","Manila"}};
        int i=0;
        do{
        
            System.out.println("name    :"+entry[i][0]);
            System.out.println("Tel.#   :"+entry[i][1]);
            System.out.println("Address :"+entry[i][2]);
            System.out.println("");
            i++;
            
        }
        while(i<3);
    }
    
}
The provided Java code demonstrates an example of using a do-while loop to iterate through a 2-dimensional array and print the values stored in it.

Here's a breakdown of how the code works:

    The entry array is declared and initialized as a 2-dimensional array with three rows and three columns. Each row represents a person's information, including their name, telephone number, and address.

    The variable i is initialized to 0. This variable will be used as the row index to access elements of the entry array.

    The do keyword starts the do-while loop.

    Inside the loop, the name, telephone number, and address for the current row are printed using System.out.println() statements and accessing the elements of the entry array using entry[i][0], entry[i][1], and entry[i][2], respectively.

    An empty System.out.println("") statement is used to print a blank line for better readability.

    The i variable is incremented using i++ to move to the next row.

    The while keyword is used to specify the condition for looping. In this case, the loop continues as long as i is less than 3 (the number of rows in the entry array).

    If the condition is true, the loop continues to the next iteration. If the condition is false, the loop terminates.

When you run this code, it will print the information of each person stored in the entry array, including their name, telephone number, and address. The loop will iterate through all three rows of the array and print the information for each person.





