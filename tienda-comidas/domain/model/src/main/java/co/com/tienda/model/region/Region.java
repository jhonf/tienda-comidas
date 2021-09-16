package co.com.tienda.model.region;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Builder(toBuilder = true)
@RequiredArgsConstructor
public class Region {
	
	@NonNull
	private  String serial;
	@NonNull
	private String nombre;
	@NonNull
	private String ciudad;
	@NonNull
	private String descripcion;
}
