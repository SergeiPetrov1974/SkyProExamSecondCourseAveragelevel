package pro.sky.courseworkaveragelevel.repository;

import pro.sky.courseworkaveragelevel.domain.Question;

import java.util.Collection;

public interface QuestionRepository {
    Question add(Question question);

    Question remove(Question question);

    Collection<Question> getAll();
}