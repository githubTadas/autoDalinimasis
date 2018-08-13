package tadas.carshare.projektas.Carshare.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddCar {

    @GetMapping("/addCar")
    public String getPage() {
        return "addCarForm";
    }
}
