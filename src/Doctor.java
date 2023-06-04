public class Doctor {
    //atributos
    int id;
    String name;
    String speciality;

    //contructor vacio
    Doctor(){
        System.out.println("Contruyendo el Obj Doctor");
    }

    //constructor con una variable
    Doctor(String name){
        System.out.println("Contruyendo el Obj Doctor - " + name);
    }

    //comportamientos - la forma de usar los atributos
    public void showName(){
        System.out.println(name);
    }
}
