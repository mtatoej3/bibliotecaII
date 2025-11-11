package models;

import java.util.ArrayList;
import java.util.List;
import models.opera.*;

public class Cliente {
    
    private String id;
    private String nome;
    private List<Opera> titoliPresi = new ArrayList<>();
    
    public Cliente(String id, String nome, List<Opera> titoliPresi) {
        this.id = id;
        this.nome = nome;
        this.titoliPresi = titoliPresi;
    }


    





    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Opera> getTitoliPresi() {
        return titoliPresi;
    }

    public void setTitoliPresi(List<Opera> titoliPresi) {
        this.titoliPresi = titoliPresi;
    }

    

    
    


}
