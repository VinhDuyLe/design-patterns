package BehaviouralPatterns.MemenotPattern;
// Originator - the main object whose state changes
class TextEditor {
    private StringBuilder content = new StringBuilder();

    public void write(String text) {
        content.append(text);
    }

    public String getText() {
        return content.toString();
    }

    public TextMemento save() {
        return new TextMemento(content.toString());
    }

    public void restore(TextMemento memento) {
        content = new StringBuilder(memento.getSavedText());
    }
}