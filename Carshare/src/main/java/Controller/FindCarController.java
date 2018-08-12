package Controller;
import org.springframework.ui.Model;
import Model.vo.FindVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FindCarController {
    @GetMapping("/find")
    public String getPage() {

        return "find";
    }

    @PostMapping("/find")

    public String getCar(@ModelAttribute FindVO query, Model pslDuomenys) {


        return "find";
    }
}
