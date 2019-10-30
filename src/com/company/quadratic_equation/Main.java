package com.company.quadratic_equation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean done = false;
        double a=0;
        double b=0;
        double c=0;
        do {
            try {
                System.out.println("Enter a,b,c: ");
                 a = scanner.nextDouble();
                 b = scanner.nextDouble();
                 c = scanner.nextDouble();
                done = true;
            } catch (InputMismatchException ex) {
                System.out.println("Input validate: " + ex.toString());
                scanner.nextLine();
            }
        }while (!done);
        System.out.println(a+","+b+","+c);
        QuadraticEquation quadratic = new QuadraticEquation(a,b,c);
        if (quadratic.getA() == quadratic.getB() && quadratic.getB()==0)
            System.out.println(" No Root");
        else if (quadratic.getA()==0){
            double root = (-quadratic.getC()/quadratic.getB());
            System.out.println("The equation has one root : "+root);
        } else {
            if (quadratic.getDiscriminant()<0)
                System.out.println("The equation has no roots");
            if (quadratic.getDiscriminant() ==0 )
                System.out.println("The equation has one root: "+quadratic.getRoot1());
            if (quadratic.getDiscriminant()>0)
                System.out.println("The equation has two roots: " +quadratic.getRoot1() +" and "+quadratic.getRoot2());
        }
    }
}
