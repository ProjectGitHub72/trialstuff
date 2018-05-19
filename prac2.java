/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author julia dhakal
 */
public class prac2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr= new BufferedReader(isr);
        
        System.out.println("enter name");
        String name= bfr.readLine();
        
        System.out.println("enter age");
        int age=Integer.parseInt(bfr.readLine());
        
        System.out.println("enter rol no");
        double rollno=Double.parseDouble(bfr.readLine());
        System.out.println("Your name is "+name);
        System.out.println("your age is"+age);
        System.out.println("your roll no is"+rollno);
    }
    
}
