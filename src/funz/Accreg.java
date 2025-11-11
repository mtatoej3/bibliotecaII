package funz;

import java.util.Scanner;
import models.Cliente;

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
        
        
        Cliente cliente = banca.newClient(nome, password);   
        Conto conto = banca.newConto();
        banca.clientConto(cliente, conto);

        System.out.println("Registrazione completata!");
        System.out.println("Cliente: " + cliente.getName() + ", ID: " + cliente.getId());
        System.out.println("Conto ID: " + conto.getId() + ", Saldo: " + conto.getBalance());
        banca.stampaClientiEConti();
    }





}
