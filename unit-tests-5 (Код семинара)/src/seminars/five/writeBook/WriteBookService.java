package seminars.five.writeBook;

import java.util.List;

public class WriteBookService{
    private final WriteBook writeBook;
    public WriteBookService(WriteBook writeBook) {
        this.writeBook = writeBook;
    }
    public List<String> getAddContact (String name, String phone){
        return writeBook.addContact(name, phone);
    }

    public List<String> getDeleteContact (String name, String phone){
        return writeBook.deleteContact(name, phone);
    }

    public List<String> getRefactorContact (String name, String phone, String newName, String newPhone){
        return writeBook.refactorContact(name, phone, newName, newPhone);
    }
}
