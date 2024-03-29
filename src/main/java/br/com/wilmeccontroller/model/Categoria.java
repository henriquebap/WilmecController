package br.com.wilmeccontroller.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome_prod;
    private String descricao_prod;
    private String cat_prod;
    private String prateleira;
    private String qnt_prod;
}
