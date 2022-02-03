package pro.sky.courseworkaveragelevel.repositoryimpl;

import pro.sky.courseworkaveragelevel.domain.Question;
import pro.sky.courseworkaveragelevel.exceptions.DuplicateQuestionException;
import pro.sky.courseworkaveragelevel.exceptions.QuestionNotFoundException;
import pro.sky.courseworkaveragelevel.repository.QuestionRepository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class QuestionRepositoryImpl implements QuestionRepository {
    private Set<Question> questions = new HashSet<>();

    @Override
    public Question add(Question question) {
        if (questions.add(question)) {
            return question;
        }
        throw new DuplicateQuestionException();
    }

    @Override
    public Question remove(Question question) {
        if (questions.remove(question)) {
            return question;
        }
        throw new QuestionNotFoundException();
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableSet(questions);
    }
}