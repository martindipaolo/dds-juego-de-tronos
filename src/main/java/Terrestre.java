import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("T")
public class Terrestre extends FuerzaMilitar{
    int cantidadSoldados;

    @Override
    public void atacarA(Lugar unLugar) {
        return;
    }
}
