//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        funcionesPokedex fp = new funcionesPokedex();
        funcionesAdestrador fad = new funcionesAdestrador();

        //Insertar 10 pokemons na pokedex

//        fp.insertarPokedexCampos("Venusaur", 100.00, "Sapo arbore");
//        fp.insertarPokedexCampos("Beedrill ", 29.5, "Avispa");
//        fp.insertarPokedexCampos("Nidoking ", 62.0, "Koalasaurio");
//        fp.insertarPokedexCampos("Vileplume  ", 18.6, "seta");
//        fp.insertarPokedexCampos("Meowth", 4.2, "Gato");
//
//        pokedex poke1 = new pokedex("Golbat", 55.0, "Murciegalo");
//        pokedex poke2 = new pokedex("Blastoise ", 85.5, "Tortuga");
//        pokedex poke3 = new pokedex("Charizard ", 90.5, "dragon");
//        pokedex poke4 = new pokedex("Mankey", 28.0, "Macaco");
//        pokedex poke5 = new pokedex("Psyduck ", 19.6, "pato");
//
//        fp.insertarPokedexobjeto(poke1);
//        fp.insertarPokedexobjeto(poke2);
//        fp.insertarPokedexobjeto(poke3);
//        fp.insertarPokedexobjeto(poke4);
//        fp.insertarPokedexobjeto(poke5);
//
//        //Insertar 2 adestradores
//        adestrador ad = new adestrador("Brock", "18/08/2000");
//        fad.insertarAdestradorCampos("Kyriakos Kapakoulak", "15/05/1962");
//        fad.insertarAdestradorObjeto(ad);

        //Listar pokemons na pokedex

        fp.leerPokedexToda();

        //Listar adestradores

        fad.lerAdestradores();

        //  Modificar dous adestradores

//        fad.modificarAdestradorID(9, "Kyriakos Grizzly", "15/05/1962");
//        fad.modificarAdestradorID(10, "Misty ", "04/07/2003");


        // Modificar duas entradas na pokedex
        //  fp.actualizarPokedex(12, "Nidoqueen", 52.0, "Koalasauria");

        pokedex pok = fp.leerPokedexPorNombre("Meowth");
        pok.setNome("Persian");
        pok.setPeso(20);
        pok.setMisc("Gato mais grande");
        fp.actualizarPokedexObjeto(pok);


    }
}
