package sf.com.spb.web;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sf.com.spb.dao.ClienteDao;
import sf.com.spb.domain.Cliente;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model){
        
        var clientes = clienteDao.findAll();
        
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("clientes", clientes);
        return "index"; 
    }
}
