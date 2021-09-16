package co.com.tienda.model.insumo;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder(toBuilder = true)
@RequiredArgsConstructor
public class Insumo {
	
	private String serial;
	
	private String nombre;
	
	private String descripcion;
}
