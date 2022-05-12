package co.edu.unbosque.restful.model;

public abstract class Person {

    protected String name;
    protected String email;
    protected String password;
    protected String role;
    protected double fcoins;

    public Person(){}

    public Person(String nombre, String correo, String clave, String rol, double coins){
        name = nombre;
        email = correo;
        password = clave;
        role = rol;
        fcoins = coins;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", fcoins=" + fcoins +
                '}';
    }
}
