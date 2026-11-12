package ec.edu.uce.pa.paquete.extensiones;


public class NotificacionExtensionMail implements NotificacionExtension {

    @Override
    public void enviar(String mensaje, String destinatario) {
        // TODO Auto-generated method stub
        System.out.println(mensaje);
    }

}
