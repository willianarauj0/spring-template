package application.repository;



import application.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    // Adicione métodos personalizados, se necessário
}