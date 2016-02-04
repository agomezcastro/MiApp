package miapp;

import javax.swing.JOptionPane;

/**
 * Añade un propietario para la libreta y ser administrador de esta
 * @author agomezcastro
 */
public class Propietario {
   private String nombrePropietario;
   private String apellidoPropietario;
   private String password;

    public Propietario() {
    }

    public Propietario(String nombrePropietario, String apellidoPropietario, String password) {
        this.nombrePropietario = nombrePropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.password = password;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getApellidoPropietario() {
        return apellidoPropietario;
    }

    public void setApellidoPropietario(String apellidoPropietario) {
        this.apellidoPropietario = apellidoPropietario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
   public void datosPropietario(){
       nombrePropietario= JOptionPane.showInputDialog("Introduzca el NOMBRE del propietario:");
       apellidoPropietario= JOptionPane.showInputDialog("Introduzca el APELLIDO del propietario:");
       password=JOptionPane.showInputDialog("Introduzca una contraseña:");
   }
}
