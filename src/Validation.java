
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Validation {

    Scanner sc = new Scanner(System.in);
public String inputString(boolean isUpdate, String msg, String regex){
    System.out.println(msg);
    while (true) {        
        String input = sc.nextLine().trim();
        if(input.isEmpty()&& isUpdate){
            return input;
        }
        if(input.matches(regex)){
            return input;
        }else{
            System.err.println("Error, Try again !");
        }
        }
    }
public int inputInt(boolean isUpdate, String msg, String regex){
    System.out.println(msg);
    while (true) {        
        String input = sc.nextLine().trim();
        if(input.isEmpty()&&isUpdate){
            return -1;
        }if(input.matches(regex)){
            int number = Integer.parseInt(input);
            return number;
        }else{
            System.out.println("Error input, Try again");
        }
    }
}
public int menu(String msg){
    System.out.println(msg);
    while (true) {        
        String input = sc.nextLine();
        try {
            
            int number = Integer.parseInt(input);
            return number;
        } catch (Exception e) {
            System.out.println("Enter number");
        }
    }
    
}
}
    
    



    

