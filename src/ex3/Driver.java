package ex3;

import javax.swing.*;

public class Driver {

    public static void main(String[] args) {
        System.out.println("Max is: " + Overload.ReturnMax(45.3,22));
        System.out.println("Max is: " + Overload.ReturnMax(new double[]{22.3,20.1,300,300.1}) );
        System.out.println("Max is: " + Overload.ReturnMax(new double[]{1.5,1.2,1.3}, new double[]{1.9,1.01,1.99}  ) );

    }

}
