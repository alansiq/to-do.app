package com.br.alansiq.todoapp.model;

import com.br.alansiq.todoapp.dto.response.AddressDTO;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

public class Pessoa {
    @Id
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "idade")
    private int idade;


    private Address address;
    private List<String> hobbies;

    public Pessoa(Long id, String nome, String cpf, int idade, Address address, List<String> hobbies) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.address = address;
        this.hobbies = hobbies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
