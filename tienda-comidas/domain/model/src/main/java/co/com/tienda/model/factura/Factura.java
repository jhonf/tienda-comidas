package co.com.tienda.model.factura;
import java.util.Date;
import co.com.tienda.model.venta.Venta;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Factura {
	
	
    @NonNull
	private int id;
	
	private String cedulaCliente;
	
	@NonNull
	private Date fecha;
	
	private Venta venta;
	
	private double total;
}
