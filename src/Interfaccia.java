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
    Biblioteca bib = new Biblioteca();
    

    public void start(){
        primo();
    }

    public void primo(){

        System.out.println(""" 
            1) servizio
            2) cliente
        """);

        int q = scanner.nextInt();

        switch (q) {
            case 1 -> {bib.servizio();}
            case 2 -> {startCliente();}
            default -> throw new AssertionError();
        }



    }


    public void startCliente(){
        while (true){
            Cliente clienteNow = log.singUpIn(scanner);
            menuCliente(clienteNow);
        }
    }

    public void menuCliente(Cliente clienteNow){

    }

        
}
