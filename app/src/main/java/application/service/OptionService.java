package application.service;

import application.model.Option;
import application.repository.OptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionService {

    @Autowired
    private OptionRepository optionRepository;

    public List<Option> getAllOptions() {
        return optionRepository.findAll();
    }

    public Option saveOption(Option option) {
        return optionRepository.save(option);
    }

    // Adicione outros métodos conforme necessário
}
