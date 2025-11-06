//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        funcionesPokedex fp = new funcionesPokedex();
        //fp.insertarPokedexCampos("Slowpoke",300.00,"Pokemon moi tranquilo");
//        fp.insertarPokedexCampos("Probopass", 340.00, "Pokemon parecido a Stalin");
//        fp.insertarPokedexCampos("Mr.Mime", 100.00, "Pokemon moi paxaso");
        //fp.insertarPokedexCampos("Psyduck", 40.00, "e literalmente un pato");

        fp.leerPokedex(1);
        fp.leerPokedexPorNombre("Psyduck");
      //  fp.eliminarPokedex(1);
        fp.eliminarPokedexNombre("Psyduck");


    }
}
