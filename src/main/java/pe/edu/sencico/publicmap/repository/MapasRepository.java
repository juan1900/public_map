package pe.edu.sencico.publicmap.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.sencico.publicmap.entity.Mapas;

@Repository("mapasRepository")
public interface MapasRepository extends JpaRepository<Mapas, Serializable> {

}
