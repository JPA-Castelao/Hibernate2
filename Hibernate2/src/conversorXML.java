import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.List;

public class conversorXML {

    public void conversorAdestrador(List<adestrador> listaAdestrador) {


        try {
            File file = new File("/home/dam/ad/Hibernate22/src/xml/adestrador.xml");
            JAXBContext context = JAXBContext.newInstance(adestrador.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            System.out.println("---Marshal to Console---");
            for (adestrador ade : listaAdestrador) {
                m.marshal(ade, System.out);
                m.marshal(ade, file);
            }


            System.out.println("\n Sucessfully marshaled to: " + file.getAbsolutePath());
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }


    public void() {

    }

    public static void main(String[] args) {


    }
}


