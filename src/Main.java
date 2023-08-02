import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();

        Doctor myDoctor = new Doctor("Juan Vilchez", "Pediatra");

        //creando un arraylist de avaibleappointment
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        //mostrando las citas disponibles
        for (Doctor.AvaibleAppointment ap : myDoctor.getAvaibleAppointments()){
            System.out.println(ap.getDate() + " " +ap.getTime());
        }

        System.out.println();
        System.out.println();

        Patient patient = new Patient("Alejandro", "ale@gmail.com");
        System.out.println(patient);

        patient.setWeight(60.5);
        System.out.println(patient.getWeight());
        patient.setHeight(1.65);
        System.out.println(patient.getHeight());

        System.out.println(patient.toString());
        patient.setPhoneNumber("1515");
        System.out.println(patient.getPhoneNumber());


    }
}

