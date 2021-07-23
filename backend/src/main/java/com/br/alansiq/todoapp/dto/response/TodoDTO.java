package com.br.alansiq.todoapp.dto.response;

import java.sql.SQLOutput;
import java.util.List;

public class TodoDTO {
    private Long id;
    private String title;
    private String description;
    private List<TagDTO> tags;

    public TodoDTO(Long id, String title, String description, List<TagDTO> tags) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.tags = tags;
    }

    public Long getId() {
        System.out.println("hello" + "world");
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TagDTO> getTags() {
        return tags;
    }

    public void setTags(List<TagDTO> tags) {
        this.tags = tags;
    }
}
