/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author PC
 */
public class Exercise6 {

  public static void main(String [] args){
  String z = "Toi thich thich an an com ";

System.out.println(z.replaceAll("(.+?)\\1+", " REPEAT"));
  }
  
}