import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "adestrador")
public class adestrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nome", nullable = false, length = 100)
    private String nome;
    @Column(name = "nacemento")
    private LocalDate nacemento;

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

    public LocalDate getNacemento() {
        return nacemento;
    }

    public void setNacemento(String nacemento) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNacemento = LocalDate.parse(nacemento, dtf);
        this.nacemento = dataNacemento;
    }


    public adestrador(String nome, String nacemento) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNacemento = LocalDate.parse(nacemento, dtf);
        this.nome = nome;
        this.nacemento = dataNacemento;
    }

    public adestrador() {

    }


}
