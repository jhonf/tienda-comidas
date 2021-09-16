package co.com.tienda.usecase.ventaslocal;

import java.util.Date;
import java.util.List;

import co.com.tienda.model.factura.Factura;
import co.com.tienda.model.factura.gateways.FacturaRepository;
import co.com.tienda.model.local.gateways.LocalRepository;
import co.com.tienda.model.venta.Venta;
import co.com.tienda.model.venta.gateways.VentaRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class VentasLocalUseCase {

	private final FacturaRepository factura;

	private final LocalRepository local;
	
	private final VentaRepository venta;

	public List<Factura> buscarFacturasFecha(String serialLocal, Date inicio, Date fin) {

		if (local.buscarLocal(serialLocal)) {
			return factura.buscarFacturasFecha(inicio, fin);
		}

		return null;

	}

	public Venta buscarVentaFactura(String numeroFactura) {
		
		return venta.buscarVenta(numeroFactura);
		
		

	}

}
