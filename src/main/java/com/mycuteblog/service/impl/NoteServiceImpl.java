package com.mycuteblog.service.impl;

import com.mycuteblog.dao.NoteRepository;
import com.mycuteblog.model.Note;
import com.mycuteblog.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public void create() {
        Note note = getNote();
        noteRepository.save(note);
    }

    @Override
    public List<Note> getAllNotes() {
        return (List<Note>) noteRepository.findAll();
    }

    @Override
    public void removeAllNotes() {
        noteRepository.deleteAll();
    }

    private Note getNote() {
        Note note = new Note();
        note.setDataOfCreation(LocalDateTime.now());
        note.setName("Note Name");
        note.setContent("some content of this note");
        return note;
    }
}
