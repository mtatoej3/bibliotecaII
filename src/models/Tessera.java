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

    



}
