package com.br.alansiq.todoapp.model;

import com.br.alansiq.todoapp.dto.response.TagDTO;

import java.util.List;

public class Todo {
    private Long id;
    private String title;
    private String description;
    private List<TagDTO> tags;

}
