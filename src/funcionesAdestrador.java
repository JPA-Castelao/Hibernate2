import config.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.util.Date;

public class funcionesAdestrador {


    public void insertarAdestradorCampos(String nome, String dataNacemento) {


        try (
                Session ses = HibernateConfig.getSessionFactory().openSession()
        ) {
            Transaction transaction = ses.beginTransaction();

            adestrador ad = new adestrador();

            ad.setNome(nome);
            ad.setNacemento(dataNacemento);

            ses.save(ad);
            transaction.commit();

        } catch (Exception e) {
            System.err.println("ERROR AO INSERTAR ADESTRADOR: " + e.getMessage());
            throw new RuntimeException();
        }


    }

    public void insertarAdestradorObjeto(adestrador ad) {
        try (
                Session ses = HibernateConfig.getSessionFactory().openSession()
        ) {
            Transaction transaction = ses.beginTransaction();

            if (ad != null) {
                ses.save(ad);

            } else {
                System.err.println("ERRO AO INSERTAR ADESTRADOR: ");
            }
            transaction.commit();

        } catch (Exception e) {
            System.err.println("ERRO AO INSERTAR ADESTRADOR: " + e.getMessage());
        }


    }

}
