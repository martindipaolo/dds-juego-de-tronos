import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Casas")
public class Casa {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private int patrimonio;
    private int anioFundacion;
    @ManyToOne
    private Lugar lugarOrigen;
    @OneToMany
    @JoinColumn(name = "casa_id")
    private Collection<FuerzaMilitar> fuerzasMilitares;
    @ManyToOne
    private Casa vasallaDe;


    public String nombreLugarOrigen(){
        return this.lugarOrigen.getNombre();
    }
}
