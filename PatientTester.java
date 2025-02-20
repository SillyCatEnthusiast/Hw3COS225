public class PatientTester {
    public static void main(String args[]){
        Patient temp = new Patient(0, 000);
        int temp2 = 0;
        PatientManager hopital = new PatientManager();
        System.out.printf(hopital.toString());
        Patient patient1 = new Patient(1, 200);
        hopital.occupy(patient1);
        Patient patient2 = new Patient(2, 400);
        hopital.occupy(patient2);
        Patient patient3 = new Patient(3, 600);
        hopital.occupy(patient3);
        Patient patient4 = new Patient(4, 800);
        hopital.occupy(patient4);
        System.out.printf(hopital.toString());
        hopital.caffieneAbsorption();
        hopital.caffieneAbsorption();
        System.out.printf(hopital.toString());
        for (int i = 0; i < hopital.patients.length; i++){
            if (hopital.patients[i] != null){
            if (hopital.patients[i].caffiene >= temp.caffiene){
                temp = hopital.patients[i];
                temp2 = i;
            }}
        }
        hopital.unoccupy(temp2);
        System.out.printf(hopital.toString());

    }
}
