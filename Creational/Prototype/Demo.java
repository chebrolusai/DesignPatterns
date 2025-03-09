public class Demo {
    public static void main(String[] args) {
        
        Note myNote = new Note("Sai Chebrolu","This is my first note");
        myNote.render();

        // Clone the created note object by calling the implemented method
        Note myClonesNote = myNote.clone();
        myClonesNote.renameAuthor("Sai Cheb cloned");
        myClonesNote.render();

    }
}
