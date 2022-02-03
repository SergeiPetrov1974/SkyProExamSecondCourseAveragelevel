package pro.sky.courseworkaveragelevel.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pro.sky.courseworkaveragelevel.domain.Question;
import pro.sky.courseworkaveragelevel.repository.QuestionRepository;
import pro.sky.courseworkaveragelevel.serviceimpl.QuestionServiceImpl;

@Configuration
public class ServiceConfigurator {
    @Bean
    public QuestionServiceImpl javaQuestionService(QuestionRepository javaQuestionRepository) {
        initJavaQuestions(javaQuestionRepository);
        return new QuestionServiceImpl(javaQuestionRepository);
    }

    private void initJavaQuestions(QuestionRepository javaQuestionRepository) {
        for (int i = 0; i < 6; i++) {
            javaQuestionRepository.add(new Question("javaQuestion" + i, "javaAnswer" + i));
        }
    }

    @Bean
    public QuestionServiceImpl mathQuestionService(QuestionRepository mathQuestionRepository) {
        initMathQuestions(mathQuestionRepository);
        return new QuestionServiceImpl(mathQuestionRepository);
    }

    private void initMathQuestions(QuestionRepository mathQuestionRepository) {
        for (int i = 0; i < 6; i++) {
            mathQuestionRepository.add(new Question("mathQuestion" + i, "mathAnswer" + i));
        }
    }
}