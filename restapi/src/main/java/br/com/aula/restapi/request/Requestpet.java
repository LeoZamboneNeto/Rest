package br.com.aula.restapi.request;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;



@Entity
@Table(name="PetS")

public class RequestPet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String nome;
    @Column
    private String Telefone;
    @Column
    private String c;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCPFDono() {
        return CPFDono;
    }

    public void setCPFDono(String CPFDono) {
        this.CPFDono = CPFDono;
    }

}
