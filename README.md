# JavaFX Notebook

A simple desktop note-taking application built with **JavaFX**, **FXML**, and **Java**. The application allows users to create notes with a title and content, then display all saved notes in the notebook.

## Features

- Add notes with a title and content.
- Display all saved notes in the application.
- Keep previously added notes visible when adding new ones.
- Clear the input fields after adding a note.
- Simple graphical user interface built with SceneBuilder and FXML.
- Pink-themed interface.

## Technologies Used

- Java 17
- JavaFX
- FXML
- SceneBuilder
- Maven
- IntelliJ IDEA

## Project Structure

```text
src/
 └── main/
     ├── java/
     │   └── org/example/
     │       ├── Main.java
     │       ├── controller/
     │       │   └── NoteController.java
     │       └── model/
     │           ├── Note.java
     │           └── Notebook.java
     └── resources/
         └── notebook-view.fxml
```

## How to Run

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA.
3. Make sure Java 17 is configured.
4. Allow Maven to load the project dependencies.
5. Run the `Main.java` class or use the Maven JavaFX run configuration.

## How to Use

1. Enter a title for your note.
2. Write your note in the content area.
3. Click **Add**.
4. Your note will appear under **Saved Notes**.
5. Continue adding notes as needed.

## Architecture

The application follows the Model-View-Controller (MVC) design pattern:

- **Model:** `Note` stores individual note information, while `Notebook` manages the collection of notes.
- **View:** `notebook-view.fxml` defines the graphical interface.
- **Controller:** `NoteController` handles user interactions and connects the view to the model.

---

Created as part of a Java programming assignment.
