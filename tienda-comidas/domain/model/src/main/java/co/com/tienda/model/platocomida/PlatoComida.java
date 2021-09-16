package co.com.tienda.model.platocomida;
import java.util.List;

import co.com.tienda.model.ingrediente.Ingrediente;
import co.com.tienda.model.insumo.Insumo;
import co.com.tienda.model.producto.Producto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder(toBuilder = true)
@RequiredArgsConstructor
public class PlatoComida extends Producto {
	
	private List<Insumo> insumos;
	
	private List<Ingrediente> ingredientes;
	
	
}
