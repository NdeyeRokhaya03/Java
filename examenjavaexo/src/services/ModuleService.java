package services;
import java.util.List;

import entities.Module;
import repositories.ModuleRepository;


public class ModuleService {
    
        ModuleRepository moduleRepository=new ModuleRepository();
    
        public void ajouterModule(Module module){
            moduleRepository.insertModule(module);
        }
    
        public List<Module>ListerModule(){
            return moduleRepository.selectAll();
        }
    
        public Module findModuleById(int id){
          return moduleRepository.selectModuleById(id);
       }
        
    }
