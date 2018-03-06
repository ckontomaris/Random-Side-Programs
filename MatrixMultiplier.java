import java.io.*;
import java.util.*;

public class MatrixMultiplier{
    public static void main (String [] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Let's multiply 2 matrices!");
        boolean multipliable= false;
        int m1r=0;
        int m1c=0;
        int m2r=0;
        int m2c=0;
        while (multipliable==false){
            System.out.println("How many rows does matrix1 have?");
            m1r= scan.nextInt();
            System.out.println("How many columns does matrix1 have?");
            m1c=scan.nextInt();
            System.out.println("How many rows does matrix2 have?");
            m2r= scan.nextInt();
            System.out.println("How many columns does matrix2 have?");
            m2c=scan.nextInt();

            //check to make sure the 2 have multipliable dimensions
            if(m1c!=m2r){
                System.out.println("These 2 matrices cannot be multiplied! The number of columns in matrix 1 has to be the same as the number of columns of matrix 2!"); 
                System.out.println("Choose 2 matrices that fuffil this property!");
            } else{
                multipliable=true;    
            }
        }
        //if they can be multiplied, now let the user put them in
        int[][] m1 = arrayMaker(1, m1r, m1c);
        int[][] m2 = arrayMaker(2, m2r, m2c);
        System.out.println("  ");
        System.out.println("Here's your resulant matrix!");
        arrayPrinter(multiplier(m1, m2));
    }

    public static int[][] arrayMaker(int arrayNum, int rows, int cols){
        Scanner scan= new Scanner(System.in);

        //checking that the 2 can work

        int [][] matrix= new int[rows][cols];
        System.out.println("enter matrix " + arrayNum+ ", from left to right, top to bottom. "); 
        arrayPrinter(matrix);
        for (int r=0; r<rows;r++){
            for(int c=0; c<cols; c++){
                if(scan.hasNext()){

                    matrix[r][c]= scan.nextInt();
                    arrayPrinter(matrix);
                }
            }
        }

        return matrix; 
    }

    public static void arrayPrinter(int [][] matrix){
        for(int r=0; r<matrix.length;r++){
            System.out.println(" ");
            for(int c=0; c<matrix[0].length; c++){
                System.out.print(matrix[r][c]+ " ");
            }
        }
    }

    public static int[][] multiplier(int [][] matrix1, int [][] matrix2){
        //start in 
        int d1= matrix1.length;
        int d2= matrix2[0].length;
        int [][] result= new int[d1][d2];

        //first for loop does dot product for each row of m1
        for(int r1=0; r1<matrix1.length; r1++){
            //the column pos in m1 is the row pos in m2
            //we need to repeat in each column of m2
            for(int c2=0; c2<matrix2[0].length; c2++){
                int sum=0;
                for(int c1=0; c1<matrix1[0].length; c1++){
                    sum= sum+ matrix1[r1][c1]*matrix2[c1][c2];    
                }
                result[r1][c2]=sum;
            }
        }
        return result;
    }
}

