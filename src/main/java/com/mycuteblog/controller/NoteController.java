package com.mycuteblog.controller;

import com.mycuteblog.model.Note;
import com.mycuteblog.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class NoteController {

    @Autowired
    private NoteService noteService;

    @RequestMapping(value = "/note", method = RequestMethod.GET)
    public String getNote(Model model) {
        noteService.removeAllNotes();
        noteService.create();
        List<Note> notes = noteService.getAllNotes();
        model.addAttribute("notes", notes);
        return "note";
    }
}
