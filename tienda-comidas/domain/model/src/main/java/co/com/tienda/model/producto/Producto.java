package co.com.tienda.model.producto;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Builder(toBuilder = true)
@RequiredArgsConstructor
public class Producto {
	
	@NonNull
	private String serial;
	
	@NonNull
	private String nombre;
	
	@NonNull
	private double precio;
}
