package ec.edu.uce.pa.paquete;
 
import ec.edu.uce.pa.paquete.extensiones.DescuentoNormal;
import ec.edu.uce.pa.paquete.extensiones.DescuentoTerceraEdad;
import ec.edu.uce.pa.paquete.extensiones.DescuentoVIP;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
 
@QuarkusMain
public class Main implements QuarkusApplication {
    @Inject
    private PedidoService pedidoService;
 
    @Inject
    DescuentoNormal descuentoNormal;
 
    @Inject
    DescuentoVIP descuentoVIP;
    @Inject
    DescuentoTerceraEdad descuentoTerceraEdad;
 
    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }
 
    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello, Quarkus!");
        Pedido p1 = new Pedido("P001", "Laptop", 1000.0);
        Pedido p2 = new Pedido("P002", "Mouse", 100.0);
        Pedido p3 = new Pedido("P003", "Teclado", 200.0);
 
        pedidoService.procesarPedido(p1,new DescuentoVIP());
        pedidoService.procesarPedido(p2,new DescuentoNormal());
        pedidoService.procesarPedido(p3,new DescuentoTerceraEdad());
 
        System.out.println("Codigo proporcionado por el docente");
        return 0;
    }
 
}