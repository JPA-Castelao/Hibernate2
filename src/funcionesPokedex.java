import config.HibernateConfig;
import org.hibernate.*;

import java.util.ArrayList;
import java.util.List;

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

    public void insertarPokedexobjeto(pokedex entradaPokedex) {
        try (
                Session ses = HibernateConfig.getSessionFactory().openSession();
        ) {

            Transaction transaction = ses.beginTransaction();
            ses.save(entradaPokedex);
            transaction.commit();
        } catch (Exception e) {
            System.err.println("ERROR AO INSERTAR A ENTRADA " + e.getMessage());
        }


    }


    public pokedex leerPokedex(int id) {

        try (
                Session ses = HibernateConfig.getSessionFactory().openSession();
        ) {
            return ses.get(pokedex.class, id);
        } catch (Exception e) {
            System.err.println("ERROR TIPO:" + e.getMessage());
            return null;
        }
    }

    public pokedex leerPokedexPorNombre(String nomePokedex) {
        pokedex poke = null;
        try (
                Session ses = HibernateConfig.getSessionFactory().openSession()
        ) {
            Transaction transaction = ses.beginTransaction();

            List<pokedex> listaPokedex = ses.createQuery("from pokedex where nome = :nome", pokedex.class)
                    .setParameter("nome", nomePokedex)
                    .getResultList();
            if (!listaPokedex.isEmpty()) {
                poke = listaPokedex.get(0);
            } else {
                System.err.println("Entrada non atopada");
            }
            ses.getTransaction().commit();


        } catch (Exception e) {
            System.err.println("Error ao buscar o pokemon");

        }
        return poke;

    }

    public void actualizarPokedex(int id, String nome, double peso, String misc) {

        try (
                Session ses = HibernateConfig.getSessionFactory().openSession();
        ) {
            Transaction transaction = ses.getTransaction();

            pokedex entradaPokedex = ses.get(pokedex.class, id);

            if (entradaPokedex != null) {
                entradaPokedex.setNome(nome);
                entradaPokedex.setPeso(peso);
                entradaPokedex.setMisc(misc);
                ses.update(entradaPokedex);
            } else {
                System.err.println("ENTRADA NON ATOPADA");
            }
            transaction.commit();

        } catch (Exception e) {
            System.err.println("Error ao actualizar a pokedex: " + e.getMessage());

        }


    }

    public void actualizarPokedexObjeto(pokedex entradaPokedex) {
        try (Session ses = HibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction = ses.getTransaction();
            ses.update(entradaPokedex);
            transaction.commit();
        } catch (Exception e) {
            System.err.println("Error ao actualizar a pokedex: " + e.getMessage());

        }
    }

    public void eliminarPokedex(int id) {

        try (Session ses = HibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction = ses.beginTransaction();

            pokedex entradaPokedex = ses.get(pokedex.class, id);
            if (entradaPokedex != null) {
                ses.delete(entradaPokedex);
            } else {
                System.err.println("Non se atopou a entrada");
            }
            transaction.commit();


        } catch (Exception e) {
            System.err.println("ERROR AO ELIMINAR A ENTRADA: " + e.getMessage());
        }


    }

    public void eliminarPokedexNombre(String nome) {
        try (Session ses = HibernateConfig.getSessionFactory().openSession()) {

            Transaction transaction = ses.beginTransaction();
            List<pokedex> listaPokedex = ses.createQuery(" from pokedex where nome = :nome", pokedex.class)
                    .setParameter("nome", nome)
                    .getResultList();


            if (!listaPokedex.isEmpty()) {
                pokedex entradaPokedex = listaPokedex.get(0);
                ses.delete(entradaPokedex);
                System.out.println(entradaPokedex.getNome() + "eliminado con exito");
            } else {
                System.err.println(nome + "non atopado");

            }

            transaction.commit();

        } catch (Exception e) {

            System.err.println("Imposible borrar: " + e.getMessage());


        }


    }

}