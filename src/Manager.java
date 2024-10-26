
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Manager {

    ArrayList<Doctor> dList;

    public Manager() {
        dList = new ArrayList<Doctor>();
    }
    public ArrayList<Doctor> getList(){
    return new ArrayList<>(dList);
}

    

    public Doctor findById(String id) {
        for (Doctor d : dList) {
            if (d.getCode().equalsIgnoreCase(id)) {
                return d;

            }
        }
        return null;
    }

    public void addDoctor(Doctor doctor) throws Exception {
        if (findById(doctor.getCode()) == null) {

            dList.add(doctor);

        } else {
            throw new Exception("Code is exited");
//
        }
    }

    public ArrayList<Doctor> searchDoctors(String keyword) {
        ArrayList<Doctor> foundDoctors = new ArrayList<>();

        for (Doctor dt : dList) {
            if (keyword.isEmpty()) {
                return dList;
            }
            if (dt.getCode().equalsIgnoreCase(keyword) || dt.getName().equalsIgnoreCase(keyword)
                    || dt.getSpecialization().equalsIgnoreCase(keyword)) {
                foundDoctors.add(dt);  
                 return foundDoctors; 
            }
        }

        return null; 
    }

    public Doctor deleteDoctor(String sv) {
    Doctor delete = findById(sv); 
    if (delete != null && delete.getCode() != null) {
        dList.remove(delete); 
        return delete; 
    }
    return null; 
}
    public Doctor updateDoctor(String code, String newName, String newSpecialization, int newAvailability) {

        Doctor doctor = findById(code);

        if (doctor != null) {
            // Kiểm tra và cập nhật nếu có giá trị mới
            if (!newName.trim().isEmpty()) {
                doctor.setName(newName);
            }
            if (!newSpecialization.trim().isEmpty()) {
                doctor.setSpecialization(newSpecialization);
            }
            if (newAvailability != -1) {
                doctor.setAvailability(newAvailability);
            }

            return doctor; // Trả về bác sĩ sau khi cập nhật
        }

        return null; // Trả về null nếu không tìm thấy bác sĩ
    }
}
    
//    public void updateDoctor(Doctor doctor) {
//        Doctor d1 = findById(doctor.getCode());
//    }

