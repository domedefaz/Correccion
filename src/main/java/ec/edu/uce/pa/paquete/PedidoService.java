package ec.edu.uce.pa.paquete;
 
import ec.edu.uce.pa.paquete.extensiones.Descuento;
import ec.edu.uce.pa.paquete.interceptores.MedirTiempo;
import ec.edu.uce.pa.paquete.interceptores.Notificacion;
import jakarta.enterprise.context.ApplicationScoped;
 
@ApplicationScoped
public class PedidoService {
   
   
    @MedirTiempo
    @Notificacion
    public void procesarPedido(Pedido pedido,Descuento descuento) {
        System.out.println("Procesando pedido: " + pedido.getCodigo() + ", Producto: " + pedido.getProducto() + ", Precio: " + pedido.getPrecio());
        double totalFinal=descuento.calcularDescuento(pedido.getPrecio());
        System.out.println("Total final" + totalFinal);
    }
}