public class PatientManager {
    Patient[] patients; // I should've used an arraylist but I'm not changing it now
    PatientManager(){
        this.patients = new Patient[10];
    }
    int occupy(Patient patient){
        for (int i = 0; i < this.patients.length; i++){
            if (this.patients[i] == null){
                this.patients[i] = patient;
                return i;
            }
        }
        return -1;
    }
    Patient unoccupy(int spot){
        Patient temp = this.patients[spot];
        this.patients[spot] = null;
        return temp;}

    void caffieneAbsorption(){
        for (int i = 0; i < this.patients.length; i++){
            if (this.patients[i] != null){
                this.patients[i].caffiene -= 160;
                if (this.patients[i].caffiene <= 0){
                    this.patients[i] = null;
                }
            }
        }
    }
    public String toString(){
        String temp = "";
        boolean empty = true;
        for (int i = 0; i < this.patients.length; i++){
            if (this.patients[i] != null) {empty = false;}
        }
        if (empty){
            temp = "Empty\n";
            return temp;
        }
        else{
            for (int i = 0; i < this.patients.length; i++){
                if (this.patients[i] != null) {temp += this.patients[i].ID + " " + this.patients[i].caffiene + "\n";}
            }
            return temp;
        }
    }
}
