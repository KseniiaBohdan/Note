package com.mycuteblog.dao;

import com.mycuteblog.model.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, Long> {

}
