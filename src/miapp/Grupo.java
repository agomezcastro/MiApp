package miapp;

/**
 *
 * @author agomezcastro
 */
public class Grupo {
    private String nombreGrupo;
    private Contacto arrayContactos[]= new Contacto[10];

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }
    
}
