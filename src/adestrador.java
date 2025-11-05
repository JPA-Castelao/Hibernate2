import java.sql.Date;

public class adestrador {

    private int id;
    private String nome;
    private Date nacemento;

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

    public Date getNacemento() {
        return nacemento;
    }

    public void setNacemento(Date nacemento) {
        this.nacemento = nacemento;
    }


    public adestrador(int id, String nome, Date nacemento) {
        this.id = id;
        this.nome = nome;
        this.nacemento = nacemento;
    }



}
