package com.br.alansiq.todoapp.service;

import com.br.alansiq.todoapp.dto.response.AddressDTO;
import com.br.alansiq.todoapp.dto.response.PessoaDTO;
import com.br.alansiq.todoapp.model.Pessoa;
import com.br.alansiq.todoapp.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HelloService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public ResponseEntity<PessoaDTO> hello(Long id) {

        Optional<Pessoa> novaPessoa = this.pessoaRepository.findById(id);

        if (novaPessoa.isPresent()) {
            Pessoa p = novaPessoa.get();
            // parse model Pessoa em PessoaDTO

            AddressDTO parsedAddress = new AddressDTO(
                    p.getAddress().getStreetName(),
                    p.getAddress().getZipCode(),
                    p.getAddress().getNumber()
            );

            PessoaDTO parsedPessoa = new PessoaDTO(
                    p.getNome(),
                    p.getCpf(),
                    p.getIdade(),
                    parsedAddress,
                    p.getHobbies()
            );

            return ResponseEntity.ok().body(parsedPessoa);
        }

        return ResponseEntity.notFound().build();

    }
}
