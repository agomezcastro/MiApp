package miapp;

import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Libreta {

    private String nombre;
    private String dni;
    private Contacto arrayContactos[] = new Contacto[10];
    private Grupo arrayGrupo[]= new Grupo[10];

    public Grupo[] getArrayGrupo() {
        return arrayGrupo;
    }

    public void setArrayGrupo(Grupo[] arrayGrupo) {
        this.arrayGrupo = arrayGrupo;
    }

    public Contacto[] getArrayContactos() {
        return arrayContactos;
    }

    public void setArrayContactos(Contacto[] arrayContactos) {
        this.arrayContactos = arrayContactos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String engadir() {
        nombre = JOptionPane.showInputDialog("Introduzca el nombre del contacto:");
        dni = JOptionPane.showInputDialog("Introduzca el DNI del contacto:");
        return nombre;
    }

    public int cualLibre() {
        int i;
        for (i = 0; i < arrayContactos.length; i++) {
            if (arrayContactos[i].getNombre().equals(""));
     
        JOptionPane.showMessageDialog(null, "Hay hueco");
        
        return i;
    }
    return -1;
    }
    public void listar(){
        
    }
}
