package org.example.controller;
import org.example.model.Note;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.example.model.Notebook;

public class NoteController {
    private Notebook notebook = new Notebook();
    @FXML
    private TextField titleField;
    @FXML
    private TextArea contentArea;
    @FXML
    private TextArea savedNotesArea;

   @FXML public void handleAddNote(){
       String title =   titleField.getText();
       String  content = contentArea.getText();
       Note note = new Note(title, content);
       notebook.addNote(note);
       String displayText = "";
       for(Note currentNote : notebook.getNotes()){
         displayText += currentNote.getTitle()+ "\n" + currentNote.getContent() + "\n\n";
       }
       savedNotesArea.setText(displayText);
       titleField.clear();
       contentArea.clear();
   }

}
