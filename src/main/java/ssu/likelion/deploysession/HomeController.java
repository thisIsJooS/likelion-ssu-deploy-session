package ssu.likelion.deploysession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class HomeController {
    @GetMapping(value = {"/", "/{name}"})
    public String home(@PathVariable Optional<String> name, Model model){
        model.addAttribute("name", name.orElse("아기사자"));
        return "index";
    }

    @ResponseBody
    @GetMapping("/likelion/president")
    public ResponseEntity<PresidentInfoDto> getPresident(){
        return new ResponseEntity<>(PresidentInfoDto.builder()
                .name("서채연")
                .age(21)
                .major("Global Media")
                .build(), HttpStatus.OK);
    }

}
