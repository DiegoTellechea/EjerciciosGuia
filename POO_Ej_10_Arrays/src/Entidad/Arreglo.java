
package entidad;
/**
 *
 * @author Diego T.
 */
public class Arreglo {
    private double[] elementos;

    public Arreglo(int tamano) {
        elementos = new double[tamano];
    }

    public double[] getElementos() {
        return elementos;
    }

    public void setElementos(double[] elementos) {
        this.elementos = elementos;
    }
}