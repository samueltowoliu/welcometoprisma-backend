package id.ac.prisma.siapmobilebackend.controlers;

import id.ac.prisma.siapmobilebackend.models.LoginRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = {"/user"})
public class UserController {
    @RequestMapping(value = "/siswa", method = RequestMethod.GET, produces = "application/json")
    public Map siswa() {
        Map response = new HashMap();
        response.put("student_name", "Yura");
        return response;
    }
    @RequestMapping(value = "/hallo", method = RequestMethod.POST, produces = "application/json")
    public Map sayHallo(@RequestBody Map data) {
        String myName = (String) data.get("yourname");
        Map response = new HashMap();
        response.put("say", "Hallo");
        response.put("myname", myName);
        return response;
    }
}
