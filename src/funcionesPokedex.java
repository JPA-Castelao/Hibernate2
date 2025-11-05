import config.HibernateConfig;
import org.hibernate.*;

import java.util.ArrayList;

public class funcionesPokedex {


    public void insertarPokedexCampos(String nome, double peso, String misc) {

        try (Session ses = HibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction = ses.beginTransaction();
            pokedex poke = new pokedex(nome, peso, misc);
            poke.setNome(nome);
            poke.setPeso(peso);
            poke.setMisc(misc);
            ses.save(poke);
            transaction.commit();

        } catch (Exception e) {
            System.err.println("ERROR TIPO: " + e.getMessage());
        }

    }


    public void insertarPokedexObxecto(pokedex poke) {

        try (Session ses = HibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction = ses.beginTransaction();

        }

    }


}