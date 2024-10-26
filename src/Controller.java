
import com.sun.source.tree.BreakTree;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Controller {

    Manager mng = new Manager();
    Validation vali = new Validation();
  

    public void addDoctor()  {
    String code = vali.inputString(false,"Enter code", Constant.CODE);
    String name = vali.inputString(false,"Enter name", Constant.NAME);
    String specialization = vali.inputString(false,"Enter specialization", Constant.Specialization);
    int availability = vali.inputInt(false,"Enter availability", Constant.availability);
   Doctor dt = new Doctor(code, name, specialization, availability);
        try {
            mng.addDoctor(dt);
            System.out.println("Add sucessfully");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        }
    public void updateDoctor(){
        String code = vali.inputString(false,"Enter code", Constant.CODE);
    String name = vali.inputString(true,"Enter name", Constant.NAME);
    String specialization = vali.inputString(true,"Enter specialization", Constant.Specialization);
    int availability = vali.inputInt(true,"Enter availability", Constant.availability);
   Doctor found = mng.updateDoctor(code, name, specialization, availability);
    if(found!=null){
        
        System.out.println("update succesfully");
        
    }else{
        System.err.println("Not found code");
    }
    }
    public void deleteDoctor(){
        String code = vali.inputString(false,"Enter code", Constant.CODE);
        Doctor dt = mng.deleteDoctor(code);
        if(dt!=null){
            System.out.println("Delete succesfully");
        }else{
            System.err.println("Not found code");
        }
    }
    public void searchDoctor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text") ;
        String key = sc.nextLine().trim();
        ArrayList<Doctor> found = mng.searchDoctors(key);
        if(found!=null){
      System.out.printf("%-12s%-17s%-24s%-28s\n", "Code", "Name","Specialization", "Availability");

           for(Doctor dt : found){
               dt.display();
               
               }
            System.out.println("Search sucessfully");
              }
        else{
            System.err.println("Not found code");
        }
        
    }
    public void add() throws Exception {
//        Doctor dt1 = new Doctor("1", "Toan", "vinhlon", 3);
//        Doctor dt2 = new Doctor("2", "DD", "df", 3);
//        Doctor dt3 = new Doctor("3", "ds", "vinhlon", 3);
//        Doctor dt4 = new Doctor("4", "ff", "vinhlon", 3);
//        
//        mng.addDoctor(dt1);
//        mng.addDoctor(dt2);
//        mng.addDoctor(dt3);
//        mng.addDoctor(dt4);
    }
}
