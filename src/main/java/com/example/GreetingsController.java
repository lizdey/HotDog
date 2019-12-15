package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingsController {
    @Autowired
    private InfoRepository infoRepository;
    @GetMapping("/")
    public String greeting(Map<String, Object> model) {

        return "greeting";
    }
    @GetMapping("/main")
    public String main(Map<String, Object> model) {
    Iterable<Info> info = infoRepository.findAll();
    model.put("info", info);
    return "main";
    }

    @PostMapping("/main")
    public String add(@RequestParam String name, @RequestParam String email, Map<String, Object> model)
    {
        Info info = new Info(name, email);

        infoRepository.save(info);

        infoRepository.findAll();
        model.put("info", info);
        return "main";
    }

}
