import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "Regiones")
public class Region {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    @ManyToMany
    @JoinTable(name = "Regiones_Lugares")
    private Collection<Lugar> lugares;
    @ManyToOne
    private Casa casaPrincipal;


    public Set<Castillo> castillos(){
        return ((Set<Castillo>) this.lugares.stream().filter(l -> l instanceof Castillo));
    }

    public Set<Ciudad> ciudades(){
        return ((Set<Ciudad>) this.lugares.stream().filter(l -> l instanceof Ciudad));
    }

    public int poblacionTotal(){
        return this.lugares.stream().mapToInt(l -> l.getPoblacion()).sum();
    }
}

