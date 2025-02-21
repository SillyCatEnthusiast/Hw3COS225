import java.util.ArrayList;

public class PatientManager {
    // Patient[] patients; 
    ArrayList<Patient> patients;
    PatientManager(){
        patients = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            patients.add(null);
        }
    }
    int occupy(Patient patient){
        for (int i = 0; i < patients.size(); i++){
            if (patients.get(i) == null){
                patients.set(i, patient);
                return i;
            }
        }
        return -1;
    }
    Patient unoccupy(int spot){
        Patient temp = patients.get(spot);
        patients.set(spot, null);
        return temp;
    }
    void caffieneAbsorption(){
        for (int i = 0; i < patients.size(); i++){
            if (patients.get(i) != null){
                patients.get(i).caffiene -= 160;
                if (patients.get(i).caffiene <= 0){
                    patients.set(i,null);
                }
            }
        }
    }
    public String toString(){
        String temp = "";
        boolean empty = true;
        for (int i = 0; i < patients.size(); i++){
            if (patients.get(i) != null) {empty = false;}
        }
        if (empty){
            temp = "Empty\n";
            return temp;
        }
        else{
            for (int i = 0; i < patients.size(); i++){
                if (patients.get(i) != null) {temp += patients.get(i).ID + " " + patients.get(i).caffiene + "\n";}
            }
            return temp;
        }
    }
}
