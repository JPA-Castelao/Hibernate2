import config.HibernateConfig;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class funcionesAdestrador {


    public void insertarAdestradorCampos(String nome, String dataNacemento) {


        try (Session ses = HibernateConfig.getSessionFactory().openSession()) {
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
        try (Session ses = HibernateConfig.getSessionFactory().openSession()) {
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


    public List<adestrador> lerAdestradores() {
        List<adestrador> listaAdestradores;

        try (Session ses = HibernateConfig.getSessionFactory().openSession()) {

            Transaction transaction = ses.beginTransaction();


            Query<adestrador> o = ses.createQuery("FROM adestrador a order by a.id ASC");

            String q = "from adestrador";
            Query<adestrador> query = ses.createQuery(q, adestrador.class);

            listaAdestradores = query.list();

            return listaAdestradores;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void modificarAdestradorID(int id, String novoNome, String novaData) {
        adestrador ad;
        try (Session ses = HibernateConfig.getSessionFactory().openSession();) {
            Transaction trans = ses.beginTransaction();


            ad = ses.get(adestrador.class, id);
            ad.setNome(novoNome);
            ad.setNacemento(novaData);

            ses.save(ad);
            trans.commit();


        }
    }

    public void eliminarTaboa() {
        try (
                Session ses = HibernateConfig.getSessionFactory().openSession();
        ) {



        }
    }


}
