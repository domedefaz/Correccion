package ec.edu.uce.pa.paquete;
 
import jakarta.inject.Singleton;
 
@Singleton
public class NotificacionMailService {
 
   
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación por correo: " + mensaje);
    }
}