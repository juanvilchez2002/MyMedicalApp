import java.util.ArrayList;
import java.util.Date;
public class Doctor extends User{
    private String speciality;

    //contructor vacio
    Doctor(){

    }

    //constructor con dos variables
    public Doctor(String name, String email) {
        super(name, email);
        System.out.println("El nombre del Doctor asignado es: "+name);
        this.speciality = speciality;
    }

    //creando un arreglo
    ArrayList<AvaibleAppointment> avaibleAppointments = new ArrayList<>();

    /**
     * creando un metodo para adicionar al arraylist un elemento
     */
    public void addAvailableAppointment(Date date, String time){
        avaibleAppointments.add(new AvaibleAppointment(date, time));
    }

    //retornando el arraylist
    public ArrayList<AvaibleAppointment> getAvaibleAppointments(){
        return avaibleAppointments;
    }

    /*
    * creando una clase anidada estatica, esta debe estar dentro de la logica de la clase
    *
    */
    public static class AvaibleAppointment{
        //atributos
        private int id_avaibleAppointment;
        private Date date;
        private String time;

        public AvaibleAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId_avaibleAppointment() {
            return id_avaibleAppointment;
        }

        public void setId_avaibleAppointment(int id_avaibleAppointment) {
            this.id_avaibleAppointment = id_avaibleAppointment;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
