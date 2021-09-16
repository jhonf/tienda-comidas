package co.com.tienda.model.local;
import java.util.List;

import co.com.tienda.model.factura.Factura;
import co.com.tienda.model.insumo.Insumo;
import co.com.tienda.model.producto.Producto;
import co.com.tienda.model.region.Region;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Local {
	
	private String serial;
	
	private String nombre;
	
	private Region region;
	
	List<Insumo> insumos;
	
	List<Producto> productos;
	
	List<Factura> facturas;
	
	
}
