import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class conversorXML {

    public static void main(String[] args) {

        adestrador ad = new adestrador();
        ad.setNome("Bruck");
        ad.setNacemento("01/02/2003");

        try {
            JAXBContext context = JAXBContext.newInstance(adestrador.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            System.out.println("---Marshal to Console---");
            m.marshal(ad, System.out);
            File file = new File("/home/dam/ad/Hibernate22/src/xml/adestrador.xml");
            m.marshal(ad, file);
            System.out.println("\n Sucessfully marshaled to: " + file.getAbsolutePath());
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

}
