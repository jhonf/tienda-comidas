package co.com.tienda.repositoriogenerico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import co.com.tienda.model.factura.Factura;
import co.com.tienda.model.factura.gateways.FacturaRepository;
import co.com.tienda.model.venta.Venta;

@Service
public class FacturaRepositoryImp implements FacturaRepository {

	private List<Factura> facturas;

	@PostConstruct
	public void init() {

		try {

			SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");

			facturas = new ArrayList<Factura>();
			
		
			Date date = sdformat.parse("2021-09-02");

			Factura factura1 = new Factura(1, date);
			factura1.setCedulaCliente("109435678");
			factura1.setTotal(23600);
			facturas.add(factura1);

			

			Factura factura2 = new Factura(2, new Date());
			factura2.setCedulaCliente("4556789");
			factura2.setTotal(80000);
			facturas.add(factura2);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Factura> buscarFacturasFecha(Date init, Date end) {
		// TODO Auto-generated method stub
		List<Factura> encontradas = new ArrayList<Factura>();

		for (Factura factura : facturas) {

			if (init.before(factura.getFecha()) && end.after(factura.getFecha())) {
				encontradas.add(factura);
			}

		}

		return encontradas;
	}

}
