import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@Entity
@Table(name = "pokedex")
@XmlRootElement(name = "pokedex")
@XmlAccessorType(XmlAccessType.FIELD)
public class pokedex implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlTransient
    private int id;
    @Column(name = "nome", nullable = false, length = 100)
    @XmlElement(name = "nome")
    private String nome;
    @Column(name = "peso", precision = 5, scale = 2)
    private double peso;
    @Column(name = "misc", length = 100)
    private String misc;

    public  pokedex() {


    }

    public pokedex(String nome, double peso, String misc) {
        this.nome = nome;
        this.peso = peso;
        this.misc = misc;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMisc() {
        return misc;
    }

    public void setMisc(String misc) {
        this.misc = misc;
    }


}
