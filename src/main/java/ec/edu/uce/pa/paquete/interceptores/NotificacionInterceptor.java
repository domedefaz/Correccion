package ec.edu.uce.pa.paquete.interceptores;
 
import ec.edu.uce.pa.paquete.NotificacionMailService;
import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
 
@Notificacion
@Interceptor
@Priority(2)
public class NotificacionInterceptor {
    @Inject
    private NotificacionMailService notificacionMailService;
   
    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {
        Object resultado = context.proceed();
        this.notificacionMailService.enviarNotificacion("Se ha ejecutado el método: " + context.getMethod().getName());
        return resultado;
    }
}