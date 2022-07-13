package pe.edu.sencico.publicmap.service;

import java.util.List;

import pe.edu.sencico.publicmap.model.MapasModel;

public interface MapasService {
	
public List<MapasModel> findAll();
    
    public MapasModel findById(Long id);
    
    public void save(MapasModel model);
    
    public void deleteById(Long id);
	
}
