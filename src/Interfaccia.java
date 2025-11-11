import java.util.*;
import models.Cliente;

public class Interfaccia {
    
    private Scanner scanner;

    public Interfaccia(Scanner scanner) {
        this.scanner = scanner;
    }

    
    public void start(){
        while (true){
            Cliente clienteNow = signUpIn();
            menuCliente(clienteNow);
        }
    }


    public Cliente singUpIn(){
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
                case 1 -> signUp() ;

                case 2 -> {
                clienteNow =  signIn();
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

}
