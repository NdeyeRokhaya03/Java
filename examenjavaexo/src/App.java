import java.util.List;
import java.util.Scanner;

import entities.Module;
import repositories.ModuleRepository;
import services.ModuleService;



public class App {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc = new Scanner(System.in);
        ModuleService moduleService=new ModuleService() ;
      ModuleRepository moduleRepository = new ModuleRepository();
        ;
        do{
            System.out.println("1-Ajouter une module");
            System.out.println("2-Lister les modules");
            System.out.println("3-Créer un cours");
            System.out.println("4-Lister les cours");
            System.out.println("5-Lister les modules d'un cours et d'un professeur");
            System.out.println("6-Quitter");
            choix=sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                System.out.println("Entrez le nom du Module");
                String nomModule=sc.nextLine();
               
                Module ml= new Module();
                ml.setNomModule(nomModule);
                
               moduleService.ajouterModule(ml);
                System.out.println("module ajouté avec succés");


                    break;
                case 2: 
                    System.out.println("Les modules sont les suivants:");
                    List<Module> modules= moduleService.ListerModule();
                        for (Module m: modules) {
                            System.out.println(m.getNomModule());    
                        }
                    break;

                
            }
        }while(choix!=5);
    
    }

}


