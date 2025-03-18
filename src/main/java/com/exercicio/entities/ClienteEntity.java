package com.exercicio.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String documento;

    @Column(nullable=false)
    private String nome;

    @Column(nullable=false)
    private String sobrenome;

    @Column(nullable=false)
    private String email;

    private int idade;

    private String sexo;

    private LocalDate dataNascimento;

    private int ddd;

    private int telefone;

    public ClienteEntity (){
    }

    public ClienteEntity (Long id, String documento, String nome, String sobrenome, String email, int idade, String sexo, LocalDate dataNascimento, int ddd, int telefone){
        this.id=id;
        this.documento=documento;
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.email=email;
        this.idade=idade;
        this.sexo=sexo;
        this.dataNascimento=dataNascimento;
        this.ddd=ddd;
        this.telefone=telefone;
    }

    public Long getId (){
        return id;
    }

    public void setId (Long id){
        this.id=id;
    }

    public String getDocumento (){
        return documento;
    }

    public void setDocumento (String documento){
        this.documento=documento;
    }

    public String getNome (){
        return nome;
    }

    public void setNome (String nome){
        this.nome=nome;
    }

    public String getSobrenome (){
        return sobrenome;
    }

    public void setSobrenome (String sobrenome){
        this.sobrenome=sobrenome;
    }

    public String getEmail (){
        return email;
    }

    public void setEmail (String email){
        this.email=email;
    }

    public int getIdade (){
        return idade;
    }

    public void setIdade (int idade){
        this.idade=idade;
    }

    public String getSexo (){
        return sexo;
    }

    public void setSexo (String sexo){
        this.sexo=sexo;
    }

    public LocalDate getDataNascimento (){
        return dataNascimento;
    }

    public void setDataNascimento (LocalDate dataNascimento){
        this.dataNascimento=dataNascimento;
    }

    public int getDdd (){
        return ddd;
    }

    public void setDdd (int ddd){
        this.ddd=ddd;
    }

    public int getTelefone (){
        return telefone;
    }

    public void setTelefone (int telefone){
        this.telefone=telefone;
    }
}
