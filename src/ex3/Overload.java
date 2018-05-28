package ex3;

public class Overload {

    public static double ReturnMax(double num1, double num2){
        return Double.max(num1,num2);
    }

    public static double ReturnMax(double[] numbers){
        double max = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }

        return max;
    }

    public static double ReturnMax(double[] numbers1, double[] numbers2){
        double max = numbers1[0];
        for(int i = 1; i < numbers1.length; i++){
            if(numbers1[i] > max){
                max = numbers1[i];
            }
        }

        for(int i = 0; i < numbers2.length; i++){
            if(numbers2[i] > max){
                max = numbers2[i];
            }
        }

        return max;
    }

}
