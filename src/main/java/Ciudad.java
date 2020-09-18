import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Ciudades")
public class Ciudad extends Lugar {
    private int cantidadDeComercios;
    private int cantidadDeSantuarios;
    private double tasaDeMortalidad;
}
