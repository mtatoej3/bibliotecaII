package funz;

import java.util.*;

import dbs.DbCliente;
import dbs.DbTessera;
import java.time.LocalDate;
import models.Cliente;
import models.Tessera;
import models.opera.Opera;

public class Accreg {
    

    public Cliente singUpIn(Scanner scanner){
        boolean a = true;

        Cliente clienteNow = null;

        while(a){
            System.out.println("""
                    ### MENU ### 
                    1) registrazione
                    2) accedi
                    3) exit
                    """);
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1 -> signUp(scanner) ;

                case 2 -> {
                clienteNow =  signIn(scanner);
                if (clienteNow!= null ) {
                    a = false;
                    }
                }

                case 3 -> a = false ;

                
                default -> throw new AssertionError();
            }

        }
        return clienteNow;
    }

    public void signUp(Scanner scanner){
        System.out.println("### REGISTRAZIONE###");
        scanner.nextLine();
        System.out.println("inserire nome: ");
        String nome = scanner.nextLine();
        
        
        Cliente cliente = newCliente(nome);
        Tessera tessera = newTessera(); 
        clientTessera(tessera, cliente);

        System.out.println("Registrazione completata!");
        System.out.println("Cliente: " + cliente.getNome() + ", ID: " + cliente.getId());
        System.out.println("tessera ID: " + tessera.getId() + ", proprietario: " + tessera.getPossessore() + "data validita: " + tessera.getDataValidita());
        
    }

    public Cliente signIn(Scanner scanner){

        System.out.println("### ACCEDI ###");
        scanner.nextLine();
        System.out.println("inserire nome:");
        String nome = scanner.nextLine();
        System.out.println("inserire id tessera :");
        String id = scanner.nextLine();     
        
        
        Cliente clienteNow = checkSignIn(nome, id);

        return clienteNow;

    }


    public Cliente checkSignIn(String nome, String id){

        for (Cliente c : cliList.getListCliente()){
            if(c.getNome().equals(nome) && c.getId().equals(id)){
                System.out.println("utente trovato" + c.getNome());
                return c;
            }   else{
                System.out.println("utente non trovato");
            }

        
        }
        return null;
    
    }

    DbTessera tesList = new DbTessera();
    DbCliente cliList = new DbCliente();

    public Cliente newCliente(String nome){
        String id = "" + cliList.getListCliente().size() +1 ;
        List<Opera> listPrestito = null;

        Cliente cli = new Cliente(id, nome, listPrestito);
        cliList.getListCliente().add(cli);

        return cli;
    }

    public Tessera newTessera(){
        String id = "" + tesList.getTesseraList().size() +1;
        LocalDate dataValidita = LocalDate.now().plusDays(1);

        Tessera tes = new Tessera(id, dataValidita);
        tesList.getTesseraList().add(tes);

        return  tes;



    }


    public void clientTessera(Tessera tessera, Cliente cliente){
        cliente.setPossessoreTes(tessera);
        tessera.setPossessoreTes(cliente);

    }


}
