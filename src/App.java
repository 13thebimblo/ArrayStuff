public class App {

    public static void main(String[] args) throws Exception {

        int a[] = {1,2,3,4};
        String hollywoodDudes[] = {"Tom Hanks", "John Williams", "Denzel Washington", "Woody Harrelson", "Michael Giacchino", "Mr. Trainor", "Orlando Bloom", "Jason Momoa"};
    
        printArray(hollywoodDudes);
        
    
    }

    public static String[] printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            //hollywoodDudes[i] = hollywoodDudes[i].toLowerCase();
            System.out.println(array[i]);
        }
        return array;
    }

}