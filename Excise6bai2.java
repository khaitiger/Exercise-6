/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excise6bai2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Excise6bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String z = "Toi thich thich an an comm ";
          String c= "Toi co 1 1 cai keo keo ngon";
          System.out.println("Input: "+z);
          System.out.println("Expect Output: Toi REPEAT REPEAT comm");
          System.out.println("Real Output:"+ z.replaceAll("(.+?)\\1+", " REPEAT"));
          System.out.println("Input: "+c);
          System.out.println("Expect Output: Toi co REPEAT cai REPEAT ngon");
          System.out.println("Output:"+ c.replaceAll("(.+?)\\1+", " REPEAT"));
    }
    
}
