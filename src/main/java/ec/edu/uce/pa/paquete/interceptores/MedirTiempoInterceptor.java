package ec.edu.uce.pa.paquete.interceptores;
 
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
 
@MedirTiempo
@Interceptor
@Priority(1)
public class MedirTiempoInterceptor {
 
    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {
        long inicio = System.currentTimeMillis();
        Object resultado = context.proceed();
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo de ejecución: " + (fin - inicio) + " ms");
 
        return resultado;
    }
}