//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        funcionesPokedex fp = new funcionesPokedex();
        funcionesAdestrador fad = new funcionesAdestrador();
        // adestrador ad2 = new adestrador("Kyriakos Grizzly", "01/01/0001");
        // fad.insertarAdestradorObjeto(ad2);
        //fad.insertarAdestradorCampos("Brock", "12/05/2002");


        fad.modificarAdestradorID(2,"Bruck","01/02/2003");
        fad.modificarAdestradorID(1,"Kyriakos Kapakoulak ","01/02/2003");

        fad.lerAdestradores();

        fp.actualizarPokedex(2,"Pikachu",40,"Electroroedor");
        fp.actualizarPokedex(3,"Torterra",4000,"Sapoconcho");
        fp.leerPokedexToda();


    }
}
