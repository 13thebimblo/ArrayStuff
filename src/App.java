import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

    //     String hollywoodDudes[] = {"Tom Hanks", "John Williams", "Denzel Washington", "Woody Harrelson", "Michael Giacchino", "Mr. Trainor", "Orlando Bloom", "Jason Momoa"};
    
    
    //     // printArray(hollywoodDudes);
    //     Scanner in = new Scanner(System.in);
    //     String s = in.nextLine();
    //     String a[] = s.split(",");
       
    //     int intArray[] = new int[a.length];

    //     for (int i = 0; i <intArray.length; i++) {
    //         intArray[i] = Integer.parseInt(a[i]);
    //     }
    //     printArray(intArray);
        
    int a[][] = {{1,2,3},{4,5,6}};
    String employees[][] = {{"William","Brady","Hand","$40K"},
                            {"Kimory","Stanley","Janitor","$200K"}};

    printArray(employees);

    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[0].length; j++) {
            a[i][j] *= a [i][j];

        }
    }

    printArray(a);

    
    }

    public static String[] printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            //hollywoodDudes[i] = hollywoodDudes[i].toLowerCase();
            System.out.println(array[i]);
        }
        return array;
    }
   
    public static int[] printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            //hollywoodDudes[i] = hollywoodDudes[i].toLowerCase();
            System.out.println(array[i]);
        }
        return array;
    }

    public static int[][] printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.print("\n");
        }
        return array;
    }
    
    public static String[][] printArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
        return array;
    }
    
}