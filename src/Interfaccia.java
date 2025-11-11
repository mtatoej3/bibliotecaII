import java.util.*;
import models.Cliente;
import funz.Accreg;

public class Interfaccia {
    
    @SuppressWarnings("FieldMayBeFinal")
    private Scanner scanner;

    public Interfaccia(Scanner scanner) {
        this.scanner = scanner;
    }

    Accreg log = new Accreg();
    
    public void start(){
        while (true){
            Cliente clienteNow = log.singUpIn(scanner);
            menuCliente(clienteNow);
        }
    }




}
