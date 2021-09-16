package co.com.tienda.model.tienda;
import java.util.List;

import co.com.tienda.model.local.Local;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Tienda {
	
	private String serial;
	
	private String nombre;
	
	List<Local> locales;
	
	
}
