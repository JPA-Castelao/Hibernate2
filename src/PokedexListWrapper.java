import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Entrada")
public class PokedexListWrapper {


    private List<pokedex> lista;

    public PokedexListWrapper() {

    }

    public PokedexListWrapper(List<pokedex> lista) {
        this.lista = lista;
    }


    @XmlElement(name = "pokedex")
    public List<pokedex> getEntrie() {
        return lista;
    }

    public void setLista(List<pokedex> lista) {
        this.lista = lista;
    }


}
