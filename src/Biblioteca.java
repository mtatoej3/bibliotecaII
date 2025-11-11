
import models.Cliente;
import models.Tessera;
import dbs.DbCliente;
import dbs.DbTessera;

public class Biblioteca {
    
    DbTessera tesList = new DbTessera();
    DbCliente cliList = new DbCliente();

    public Cliente newCliente(){
        int id = cliList.getListCliente().size() +1 ;
        


    }

    public Tessera newTessera(){

    }


    public void clientTessera(Tessera tessera, Cliente cliente){
        cliente.setPossessoreTes(tessera);
        tessera.setPossessoreTes(cliente);

    }
}
