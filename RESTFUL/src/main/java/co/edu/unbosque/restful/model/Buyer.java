package co.edu.unbosque.restful.model;

public class Buyer extends Person {

    public Buyer(){}

    public Buyer(String nombre, String correo, String clave, String rol, double coins) {
        super(nombre, correo, clave, rol, coins);
    }

    public String getName() {
        return super.name;
    }

    public void setName(String name) {
        super.name = name;
    }

    public String getEmail() {
        return super.email;
    }

    public void setEmail(String email) {
        super.email = email;
    }

    public String getPassword() {
        return super.password;
    }

    public void setPassword(String password) {
        super.password = password;
    }

    public String getRole() {
        return super.role;
    }

    public void setRole(String role) {
        super.role = role;
    }

    public double getFcoins() {
        return super.fcoins;
    }

    public void setFcoins(double fcoins) {
        super.fcoins = fcoins;
    }
}
