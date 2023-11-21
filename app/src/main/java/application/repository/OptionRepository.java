package application.repository;

import application.model.Option;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends JpaRepository<Option, Long> {
    // Adicione métodos adicionais conforme necessário
}