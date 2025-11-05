import java.sql.Date;

public class pokemon {

    private int id;
    private String nome;
    private Date nacemento;
    private int pokedexEntry;
    private int adestrador;

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

    public int getPokedexEntry() {
        return pokedexEntry;
    }

    public void setPokedexEntry(int pokedexEntry) {
        this.pokedexEntry = pokedexEntry;
    }

    public int getAdestrador() {
        return adestrador;
    }

    public void setAdestrador(int adestrador) {
        this.adestrador = adestrador;
    }


    public pokemon(int id, String nome, Date nacemento, int pokedexEntry, int adestrador) {
        this.id = id;
        this.nome = nome;
        this.nacemento = nacemento;
        this.pokedexEntry = pokedexEntry;
        this.adestrador = adestrador;
    }


}
