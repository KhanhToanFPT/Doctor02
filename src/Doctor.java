/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Doctor {

    private String code;
    private String name;
    private String specialization;
    private int availability;

    public Doctor(String code, String name, String specialization, int availability) {
        if(code.matches(Constant.CODE)&& name.matches(Constant.NAME)
                && specialization.matches(Constant.Specialization)&& availability>0){
                
        this.code = code;
        this.name = name;
        this.specialization = specialization;
        this.availability = availability;
    }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if(code.matches(Constant.CODE)){
        this.code = code;
    }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.matches(Constant.NAME)){
        this.name = name;
    }
    }
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if(specialization.matches(Constant.Specialization)){
        this.specialization = specialization;
    }
    }
    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        if(availability>0){
        this.availability = availability;
    }
    }
    public void display(){
        System.out.printf("%-12s%-17s%-24s%-28s\n", getCode(), getName(), getSpecialization(), getAvailability());
    }
}
