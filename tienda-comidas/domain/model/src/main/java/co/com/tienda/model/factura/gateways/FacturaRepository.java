package co.com.tienda.model.factura.gateways;

import java.util.Date;
import java.util.List;

import co.com.tienda.model.factura.Factura;

public interface FacturaRepository {
	
	List<Factura>buscarFacturasFecha(Date init, Date end);
}
