package co.com.tienda.api;

import lombok.AllArgsConstructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.tienda.model.factura.Factura;
import co.com.tienda.model.venta.Venta;
import co.com.tienda.usecase.ventaslocal.VentasLocalUseCase;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {

	private final VentasLocalUseCase ventasLocalUseCase;

	@GetMapping(path = "/facturas/{localId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Factura> consultarFactura(@PathVariable String localId, @RequestParam String fechaIni,
			@RequestParam String fechaFin) {

		try {

			SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");

			Date inicio = sdformat.parse(fechaIni);

			Date fin = sdformat.parse(fechaFin);

			return ventasLocalUseCase.buscarFacturasFecha(localId, inicio, fin);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}
	
	@GetMapping(path = "/ventas/{numFactura}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Venta buscarVenta(@PathVariable String numFactura) {
		
		return ventasLocalUseCase.buscarVentaFactura(numFactura);
		
	}
	
	
	
	
}
