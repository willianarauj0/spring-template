package application.controller;

import application.service.OptionService;
import application.model.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/options")
public class OptionController {

    @Autowired
    private OptionService optionService;

    @GetMapping
    public List<Option> getAllOptions() {
        return optionService.getAllOptions();
    }

    @PostMapping
    public Option saveOption(@RequestBody Option option) {
        return optionService.saveOption(option);
    }

    // Adicione outros métodos conforme necessário
}