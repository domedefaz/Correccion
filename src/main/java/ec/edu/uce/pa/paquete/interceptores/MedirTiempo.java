package ec.edu.uce.pa.paquete.interceptores;
 
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jakarta.interceptor.Interceptor;
 
@Interceptor
@Retention(RetentionPolicy.RUNTIME)
@Target ({ElementType.METHOD, ElementType.TYPE})
public @interface MedirTiempo {
 
}