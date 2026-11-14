package ec.edu.uce.pa.paquete.extensiones;
 
public class DescuentoVIP implements Descuento {
 
    @Override
    public double calcularDescuento(double precio) {
 
        double descuento = (precio * 10) / 100;
 
        return precio - descuento;
    }
 
}