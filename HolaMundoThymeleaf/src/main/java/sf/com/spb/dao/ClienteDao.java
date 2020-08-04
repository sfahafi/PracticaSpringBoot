package sf.com.spb.dao;
import org.springframework.data.repository.CrudRepository;
import sf.com.spb.domain.Cliente;


public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
}
