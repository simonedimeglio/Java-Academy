/* 
Scrivi un programma Java 
che dichiari un array di interi 
e stampi tutti gli elementi dell'array.
*/

public class ArrayEsercizio1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
