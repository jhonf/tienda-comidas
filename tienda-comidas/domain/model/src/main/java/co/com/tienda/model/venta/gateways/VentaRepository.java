package co.com.tienda.model.venta.gateways;

import co.com.tienda.model.venta.Venta;

public interface VentaRepository {
	
	public Venta buscarVenta(String numFactura);
}
