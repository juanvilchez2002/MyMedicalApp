public class User {
    //atributos
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User() {
    }

    public User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length()>8 || phoneNumber.length()<8 ){
            System.out.println("El número telefonico debe tener 8 digitos");
        }else{
            this.phoneNumber = phoneNumber;
        }
    }
}
