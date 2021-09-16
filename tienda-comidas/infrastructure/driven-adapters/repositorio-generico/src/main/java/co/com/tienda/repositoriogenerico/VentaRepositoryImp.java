package co.com.tienda.repositoriogenerico;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import co.com.tienda.model.producto.Producto;
import co.com.tienda.model.venta.Venta;
import co.com.tienda.model.venta.gateways.VentaRepository;

@Service
public class VentaRepositoryImp implements VentaRepository{
	
	List<Venta> ventas;
	
	@PostConstruct
	public void init() {
		
		ventas = new ArrayList<Venta>();
		
		Venta venta1 = new Venta("1234", "Venta a Domicilio");
		
		List<Producto>productos = new ArrayList<Producto>();
		
		Producto producto1 = new Producto("0012", "Hamburguesa mediana", 12500);
		productos.add(producto1);
		
		Producto producto2 = new Producto("0023", "Porcion Pizza", 5000);
		productos.add(producto2);
		
		venta1.setProductos(productos);
		ventas.add(venta1);
		
	}

	@Override
	public Venta buscarVenta(String numFactura) {
		// TODO Auto-generated method stub
		for (Venta venta : ventas) {
			if (numFactura.equalsIgnoreCase(venta.getSerial())) {
				return venta;
				
			}
		}
		
		
		return null;
	}

}
