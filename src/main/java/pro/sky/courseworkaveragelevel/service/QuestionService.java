package pro.sky.courseworkaveragelevel.service;

import pro.sky.courseworkaveragelevel.domain.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(Question question);

    Question remove(Question question);

    Collection<Question> getAll();

    Question getRandomQuestion();
}
