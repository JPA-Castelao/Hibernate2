//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        funcionesPokedex fp = new funcionesPokedex();
        funcionesAdestrador fad = new funcionesAdestrador();
        adestrador ad2 = new adestrador("Kyriakos Grizzly", "01/01/0001");
       // fad.insertarAdestradorCampos("Paco Ibañez", "12/08/1947");
        fad.insertarAdestradorObjeto(ad2);
    }
}
