package pe.edu.sencico.publicmap.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.sencico.publicmap.converter.MapasConverter;
import pe.edu.sencico.publicmap.entity.Mapas;
import pe.edu.sencico.publicmap.model.MapasModel;
import pe.edu.sencico.publicmap.repository.MapasRepository;
import pe.edu.sencico.publicmap.service.MapasService;

@Service("mapasService")
public class MapasServiceImpl implements MapasService{

    @Autowired
    @Qualifier("mapasRepository")
    private MapasRepository mapasRepository;
    
    @Autowired
    @Qualifier("mapasConverter")
    private MapasConverter mapasConverter;
    
    @Override
    @Transactional(readOnly = true)
    public List<MapasModel> findAll() {
        List<Mapas> listEntity = mapasRepository.findAll();
        List<MapasModel> listModel = new LinkedList<>();
        for(Mapas entity:listEntity) {
            listModel.add(mapasConverter.aModel(entity));
        }
        return listModel;
    }

    @Override
    @Transactional(readOnly = true)
    public MapasModel findById(Long id) {
        return mapasConverter.aModel(mapasRepository.findById(id).orElse(null));
    }

    @Override
    @Transactional
    public void save(MapasModel model) {
        mapasRepository.save(mapasConverter.aEntity(model));
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        mapasRepository.deleteById(id);
    }

}
