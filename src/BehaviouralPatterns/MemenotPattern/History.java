package BehaviouralPatterns.MemenotPattern;

import java.util.Stack;

// Caretaker - manages saved states
class History {
    private Stack<TextMemento> history = new Stack<>();

    public void save(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            editor.restore(history.pop());
        }
    }
}
