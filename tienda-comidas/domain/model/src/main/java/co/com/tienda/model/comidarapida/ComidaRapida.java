package co.com.tienda.model.comidarapida;
import co.com.tienda.model.producto.Producto;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Builder(toBuilder = true)
@RequiredArgsConstructor
public class ComidaRapida extends Producto {
	
	@NonNull
	private boolean combo;
	
	
}
