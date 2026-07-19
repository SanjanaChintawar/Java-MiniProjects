// Association, Aggregation & Composition

// PS - Build a hospital management system using all three relationships.

// Association:
//The doctor and patient should exist independently.
class Doctor{
    String name;

    public Doctor(String name) {
        this.name = name;
    }
    
}
class Patient{
    String name;

    MedicalRecord medicalRecord;

    public Patient(String name) {
        this.name = name;
    }

    void consult(Doctor doctor){
        medicalRecord = new MedicalRecord();
        medicalRecord.medRecord();
        System.out.println(doctor.name+" is trating "+ name);
        
    }
    
}

// Aggregation
// If the hospital closes,the doctor should still be able to work somewhere else.
class Hospital{
    String name;
    Doctor doctor;

    public Hospital(String name, Doctor doctor) {
        this.name = name;
        this.doctor = doctor;
    }

    public void hosptalInfo(){
        System.out.println("Hospital name is: "+ name);
        System.out.println("Doctor name is: "+ doctor.name);
    }

}

// Composition
// Every patient owns one medical record. The record should be created inside the Patient constructor.

class MedicalRecord{
    public void medRecord(){
        System.out.println("Patients medical record");
    }
}


public class has {

    public static void main(String[] args){
        Doctor doctor = new Doctor("Meera");
        Hospital hospital = new Hospital("Care Plus Hospital", doctor);
        Patient patient = new Patient("Sanjana");

        hospital.hosptalInfo();
        patient.consult(doctor);

    }
    
}
