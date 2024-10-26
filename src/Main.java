/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Main {
public void displayMess(String msg){
    System.out.println(msg);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Controller controller = new Controller();
        Validation vali = new Validation();
         controller.add();
//        controller.addDoctor();
//        controller.addDefault();
        while (true) {
            System.out.println("========= Doctor Management ==========\n"
                    + "1.	Add Doctor\n"
                    + "2.	Update Doctor\n"
                    + "3.	Delete Doctor\n"
                    + "4.	Search Doctor\n"
                    + "5.	Exit");
           
            int choice = vali.menu("Enter choice: ");
            switch (choice) {
                case 1:
                    controller.addDoctor();
                   
                    break;
                case 2:
                    controller.updateDoctor();
                    break;
                case 3:
                    controller.deleteDoctor();
                    break;
                case 4:
                    controller.searchDoctor();
                    break;
                case 5:
                    
                    System.exit(choice);
                    
                default:
                    
                    System.out.println("Khong co lua chon nay!! moi nhap lai");
                    continue;
                    
                    
            }
        }
    }

}
