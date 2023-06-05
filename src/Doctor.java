public class Doctor {
    //atributos
    static int id = 0; //autoincrementado
    String name;
    String speciality;

    //contructor vacio
    Doctor(){
        System.out.println("Contruyendo el Obj Doctor");
        id++; //se autoincrementa cuando se crea un nuevo obj
    }

    //constructor con una variable
    Doctor(String name){
        System.out.println("Contruyendo el Obj Doctor - " + name);
    }

    //comportamientos - la forma de usar los atributos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: "+id);
    }
}
