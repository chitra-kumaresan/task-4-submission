package ttttaskthree;

import java.util.ArrayList;
import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        //Scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index: ");
        int a=sc.nextInt();



      ArrayList<String> arr = new ArrayList<>(7);
        arr.add("SUNDAY");
        arr.add("MONDAY");
        arr.add("TUESDAY");
        arr.add("WEDNESDAY");
        arr.add("THURSDAY");
        arr.add("FRIDAY");
        arr.add("SATURDAY");
        //i/p:1
        //o/p:Monday
        //...
        //i/p:7
        //o/p:enter valid index
        try{
        for (int i = 0; i <arr.size() ; i++) {
            if(a==i){
                System.out.println(arr.get(i));
            }else{
                throw new ArrayIndexOutOfBoundsException();
            }
        }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter valid index between 0-6 ");

        }

    }

}