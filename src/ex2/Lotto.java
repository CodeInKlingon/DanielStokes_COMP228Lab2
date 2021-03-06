package ex2;

import java.util.Random;

public class Lotto {
    private int[] numbers = new int[3];
    private Random rn = new Random();

    //constructor
    public Lotto(){

        //populate array with random numbers
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rn.nextInt(8) + 1;
        }
    }

    //method returns sum of lotto array
    public int getLotto(){
        int count = 0;
        for(int i =0; i < numbers.length; i++ ){
            count += numbers[i];
        }
        return count;
    }
}
