import java.util.ArrayList;
import java.util.Date;
public class Doctor {
    //atributos
    static int id = 0; //autoincrementado
    private String name;
    private String speciality;

    //contructor vacio
    Doctor(){
        //System.out.println("Contruyendo el Obj Doctor");
        //id++; //se autoincrementa cuando se crea un nuevo obj
    }

    //constructor con una variable
    Doctor(String name){
        System.out.println("Contruyendo el Obj Doctor - " + name);
    }

    //constructor con dos variables
    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
        System.out.println("Contruyendo el Obj Doctor - " + name);
        id++;
    }

    //comportamientos - la forma de usar los atributos
    public void showName(){
        System.out.println(name);
    }

    //metodos de la clase
    public void showId(){
        System.out.println("ID Doctor: "+id);
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

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
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
