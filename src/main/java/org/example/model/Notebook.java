package org.example.model;

import java.util.ArrayList;

public class Notebook {

    private ArrayList<Note> notebook = new ArrayList<Note>();

    public void addNote(Note note){
        notebook.add(note);
    }
    public ArrayList<Note> getNotes(){
        return notebook;
    }
}
