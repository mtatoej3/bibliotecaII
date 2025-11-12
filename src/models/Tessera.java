package models;
import java.time.LocalDate;


public class Tessera {
    
    private String id;
    private Cliente possessore;
    private LocalDate dataValidita;
    
    
    public Tessera(String id, Cliente possessore, LocalDate dataValidita) {
        this.id = id;
        this.possessore = possessore;
        this.dataValidita = dataValidita;
    }


    

    
    public Tessera(String id, LocalDate dataValidita) {
        this.id = id;
        this.dataValidita = dataValidita;
    }





    public void newTessera(){

    }

    public void ricTessPerPossesore(){
        
    }

    public void setPossessoreTes(Cliente possessore){
        this.possessore = possessore;
    }





    public String getId() {
        return id;
    }





    public Cliente getPossessore() {
        return possessore;
    }





    public LocalDate getDataValidita() {
        return dataValidita;
    }



    
}

