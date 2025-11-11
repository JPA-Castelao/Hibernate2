import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name = "Adestradores")
public class AdestradorListWrapper {

    private List<adestrador> listaAdestradores;

    public AdestradorListWrapper() {

    }

    public AdestradorListWrapper(List<adestrador> listaAdestradores) {

        this.listaAdestradores = listaAdestradores;
    }

    @XmlElement(name = "adestrador")
    public List<adestrador> getListaAdestradores() {
        return listaAdestradores;
    }

    public void setListaAdestradores(List<adestrador> listaAdestradores) {
        this.listaAdestradores = listaAdestradores;
    }
}
