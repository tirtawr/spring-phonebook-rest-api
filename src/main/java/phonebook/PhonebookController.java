package phonebook;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Tirta Wening Rachman on 12/21/2015.
 */
@RestController
public class PhonebookController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/phonebook")
    public PhonebookEntry getEntry(@RequestParam(value="id", defaultValue= "1") String id) {
        switch(id){
            case "1":
                return new PhonebookEntry(1,"Nama","08123123123","Tinggal di Bandung");
            case "2":
                return new PhonebookEntry(2,"Nama2","08123123123","Tinggal di Bandung");
            default:
                return new PhonebookEntry(1,"Nama","08123123123","Tinggal di Bandung");
        }
    }

    @RequestMapping(value="/phonebook",method = RequestMethod.POST)
    public PhonebookEntry postEntry(
            @RequestParam(value="name", defaultValue= "Nama") String name,
            @RequestParam(value="phone_no", defaultValue= "08123123123") String phone_no,
            @RequestParam(value="addr", defaultValue= "Tinggal di Bandung") String addr) {
        return new PhonebookEntry(counter.incrementAndGet(),name,phone_no,addr);
    }
}
