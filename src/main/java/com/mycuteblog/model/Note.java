package com.mycuteblog.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String content;
    private LocalDateTime dateOfCreation;

    public Note() {
    }

    public Note(Long id, String name, String content, LocalDateTime dateOfCreation) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.dateOfCreation = dateOfCreation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDataOfCreation(LocalDateTime dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
}
