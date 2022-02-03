package pro.sky.courseworkaveragelevel.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pro.sky.courseworkaveragelevel.repositoryimpl.QuestionRepositoryImpl;

@Configuration
public class RepositoryConfiguration {

    @Bean()
    public QuestionRepository javaQuestionRepository() {
        return new QuestionRepositoryImpl();
    }

    @Bean
    public QuestionRepository mathQuestionRepository() {
        return new QuestionRepositoryImpl();
    }
}
