package mx.com.nokster.dao;

import mx.com.nokster.domain.Persona;
import org.springframework.data.repository.CrudRepository;


public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}
