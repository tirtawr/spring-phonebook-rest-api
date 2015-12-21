package phonebook;

/**
 * Created by ASUS on 12/21/2015.
 */
public class PhonebookEntry {


    private final long id;
    private final String name;
    private final String phone_no;
    private final String addr;

    public PhonebookEntry(long id, String name, String phone_no, String addr) {
        this.id = id;
        this.name = name;
        this.phone_no = phone_no;
        this.addr = addr;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public String getAddr() {
        return addr;
    }

}
