import javax.persistence.*;

import static javax.persistence.InheritanceType.SINGLE_TABLE;

@Entity
@Table(name = "Fuerzas_Militares")
@Inheritance(strategy = SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public abstract class FuerzaMilitar {

    @Id
    @GeneratedValue
    private Long id;

    abstract void atacarA(Lugar unLugar);
}
