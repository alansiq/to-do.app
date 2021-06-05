package com.br.alansiq.todoapp.controller;

import com.br.alansiq.todoapp.dto.response.AddressDTO;
import com.br.alansiq.todoapp.dto.response.PessoaDTO;
import com.br.alansiq.todoapp.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("hello")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/{id}")
    public PessoaDTO hello(@PathVariable int id) {
        return this.helloService.hello(id);
    }


}
