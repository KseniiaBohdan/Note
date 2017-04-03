package com.mycuteblog.service;

import com.mycuteblog.model.Note;

import java.util.List;

public interface NoteService {

    void create();

    List<Note> getAllNotes();

    void removeAllNotes();

}
