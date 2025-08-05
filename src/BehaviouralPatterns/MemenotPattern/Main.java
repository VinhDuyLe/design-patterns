package BehaviouralPatterns.MemenotPattern;

// Client
public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Hello ");
        history.save(editor);

        editor.write("World!");
        history.save(editor);

        editor.write(" This is wrong.");
        System.out.println("Current text: " + editor.getText()); // Hello World! This is wrong.

        history.undo(editor);
        System.out.println("After 1 undo: " + editor.getText()); // Hello World!

        history.undo(editor);
        System.out.println("After 2 undo: " + editor.getText()); // Hello
    }
}

