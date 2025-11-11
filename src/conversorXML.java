import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.List;

public class conversorXML {

    public void conversorAdestrador(List<adestrador> listaAdestrador) {


        try {
            File file = new File("E:\\DAM\\ad\\Hibernate2\\xml\\adestradores.xml");
            AdestradorListWrapper alw = new AdestradorListWrapper(listaAdestrador);
            JAXBContext context = JAXBContext.newInstance(AdestradorListWrapper.class, adestrador.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            m.marshal(alw, System.out);
            m.marshal(alw, file);

            System.out.println("\n Sucessfully marshaled to: " + file.getAbsolutePath());
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }


    public void conversorPokedex(List<pokedex> listaPokedex) {

        File file = new File("E:\\DAM\\ad\\Hibernate2\\xml\\pokedex.xml");
        PokedexListWrapper wrapper = new PokedexListWrapper(listaPokedex);
        try {
            JAXBContext context = JAXBContext.newInstance(PokedexListWrapper.class, pokedex.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            m.marshal(wrapper, System.out);
            m.marshal(wrapper, file);

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }


    }


}


