import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("N")
public class Naval extends FuerzaMilitar {
    int cantidadBarcos;

    @Override
    public void atacarA(Lugar unLugar) {
        return;
    }
}
