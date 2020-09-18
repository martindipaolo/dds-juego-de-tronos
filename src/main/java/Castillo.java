import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Castillos")
public class Castillo extends Lugar {
    private int cantidadTorres;
    private int cantidadMurallas;
}
