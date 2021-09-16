package co.com.tienda.repositoriogenerico;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import co.com.tienda.model.local.Local;
import co.com.tienda.model.local.gateways.LocalRepository;

@Service
public class LocalRepositoryImp implements LocalRepository{
	
	
	private List<Local> locales;
	
	@PostConstruct
	private void init() {
		
		locales = new ArrayList<Local>();
		
		Local local1 = new Local();
		local1.setSerial("01");
		local1.setNombre("local ciudad nueva");
		locales.add(local1);
		
		Local local2 = new Local();
		local2.setSerial("02");
		local2.setNombre("local barrio viejo");
		locales.add(local2);
		
	}

	@Override
	public boolean buscarLocal(String serial) {
		// TODO Auto-generated method stub
		
		for (Local local : locales) {
			if (serial.equalsIgnoreCase(local.getSerial())) {
				return true;
			}
		}
		
		
		return false;
	}

}
