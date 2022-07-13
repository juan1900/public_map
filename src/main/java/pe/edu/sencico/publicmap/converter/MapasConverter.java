package pe.edu.sencico.publicmap.converter;

import pe.edu.sencico.publicmap.entity.Mapas;
import pe.edu.sencico.publicmap.model.MapasModel;

public interface MapasConverter {
	
	public Mapas aEntity(MapasModel model);
	public MapasModel aModel(Mapas entity);
	
}
