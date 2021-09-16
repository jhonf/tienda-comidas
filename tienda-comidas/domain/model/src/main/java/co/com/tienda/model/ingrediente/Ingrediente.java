package co.com.tienda.model.ingrediente;
import co.com.tienda.model.producto.Producto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder(toBuilder = true)
@RequiredArgsConstructor
public class Ingrediente extends Producto {
	
	private String serial;
	
	private String nombre;
	
	private String descripcion;
}
