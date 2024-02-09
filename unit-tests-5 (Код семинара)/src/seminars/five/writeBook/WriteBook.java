package seminars.five.writeBook;

import java.util.ArrayList;
import java.util.List;

public class WriteBook {
    public static ArrayList<UserData> allUsers = new ArrayList<>();
    {
        allUsers.add(new UserData("A", "127903562"));
        allUsers.add(new UserData("B", "937252748"));
        allUsers.add(new UserData("C", "873391157"));
    }

    public List<String> addContact(String name, String phone) {
        allUsers.add(new UserData(name, phone));
        return List.of(name, phone);
    }

    public List<String> deleteContact(String name, String phone){
        allUsers.remove(new UserData(name, phone));
        return List.of(name, phone);
    }

    public List<String> refactorContact(String name, String phone, String newName, String newPhone){
        allUsers.remove(new UserData(name, phone));
        allUsers.add(new UserData(newName, newPhone));
        return List.of(name, phone, newName, newPhone);
    }


}
