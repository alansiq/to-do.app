package com.br.alansiq.todoapp.service;

import com.br.alansiq.todoapp.dto.response.AddressDTO;
import com.br.alansiq.todoapp.dto.response.PessoaDTO;
import com.br.alansiq.todoapp.model.Pessoa;
import com.br.alansiq.todoapp.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HelloService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaDTO hello(Long id) {
//        AddressDTO novoEndereco = new AddressDTO("Jose Timoteo da Silva", "06172220", 120);
//        List<String> hobbies = new ArrayList<>();
//        hobbies.add("CODAR UM JAVA MEU PARSA");
//        hobbies.add("JOGAR UM CS");
//        hobbies.add("cair de moto");
//        PessoaDTO novaPessoa = new PessoaDTO("Alan", "433", 23, novoEndereco, hobbies);

        Optional<Pessoa> novaPessoa = this.pessoaRepository.findById(id);

        if (novaPessoa.isPresent()) {
            Pessoa p = novaPessoa.get();
            // parsear Pessoa (model) em PessoaDTO
            //
        }


//        return PessoaDTOParseada;

    }
}
