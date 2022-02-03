package pro.sky.courseworkaveragelevel.service;

import pro.sky.courseworkaveragelevel.domain.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}