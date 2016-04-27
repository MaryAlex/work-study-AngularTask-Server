package hello;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        return "ZI don't know do I need this... I'm butterfly, anyway *fly away*";
    }

    @RequestMapping(value = {"/bookmark"}, method = RequestMethod.GET)
    public Obj bookmark(@RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
                           @RequestParam(value = "size", required = false, defaultValue = "20") Integer size) {
        Obj obj = new Obj();
        for (int i = size*page+1; i < page*size + size + 1; i++) {
            obj.items.add(new Item(i));
        }
        obj.more = (size*page + size) < 400;
        return obj;
    }
}
