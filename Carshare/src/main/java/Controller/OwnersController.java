package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnersController {


    @RequestMapping("/ownerLogin")
    public String requestPage() {

        return "ownerLogin";
    }

}



