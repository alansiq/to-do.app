package com.br.alansiq.todoapp.dto.response;
// lombok (gets and setters automáticos)


import java.util.List;

public class PessoaDTO {
    private String nome;
    private String cpf;
    private int idade;
    private AddressDTO address;
    private List<String> hobbies;

    public PessoaDTO(String nome, String cpf, int idade, AddressDTO address, List<String> hobbies) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.address = address;
        this.hobbies = hobbies;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public String getNome() {
        return this.nome;
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

}