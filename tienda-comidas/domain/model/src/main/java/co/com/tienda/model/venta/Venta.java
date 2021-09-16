package co.com.tienda.model.venta;
import java.util.List;

import co.com.tienda.model.producto.Producto;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Venta {
	
	@NonNull
	private String serial;
	
	@NonNull
	String tipoVenta;
	
	List<Producto> productos;
}
