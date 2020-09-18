import javax.persistence.*;

@Entity
@Table(name = "Lugares")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Lugar {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private int anioFundacion;
    private int poblacion;

    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }
}
