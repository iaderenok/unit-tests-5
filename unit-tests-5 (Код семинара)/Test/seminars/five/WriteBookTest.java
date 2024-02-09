package seminars.five;

import org.junit.jupiter.api.Test;
import seminars.five.writeBook.WriteBook;
import seminars.five.writeBook.WriteBookService;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WriteBookTest {
    WriteBook writeBook = new WriteBook();
    WriteBookService writeBookService = new WriteBookService(writeBook);

    @Test
    public void addContactTest(){
        //writeBookService.getAddContact("A", "9993882838");
        List<String> result = writeBookService.getAddContact("A", "9993882838");

        assertEquals(writeBook.addContact("A", "9993882838"), result);
    }

    @Test
    public void deleteContactTest() {
        List<String> result = writeBookService.getDeleteContact("A", "9993882838");

        assertEquals(writeBook.deleteContact("A", "9993882838"), result);
    }

    @Test
    public void refactorContactTest() {
        List<String> result = writeBookService.getRefactorContact("A", "9993882838","B", "1773828178");

        assertEquals(writeBook.refactorContact("A", "9993882838","B", "1773828178"), result);
    }
}