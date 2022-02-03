package pro.sky.courseworkaveragelevel.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.courseworkaveragelevel.repository.QuestionRepository;
import pro.sky.courseworkaveragelevel.serviceimpl.QuestionServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static pro.sky.courseworkaveragelevel.constant.Constants.*;

@ExtendWith(MockitoExtension.class)
class QuestionServiceImplTest {

    @Mock
    private QuestionRepository questionRepository;

    @InjectMocks
    private QuestionServiceImpl out;

    @Test
    void shouldCorrectAddQuestion() {
        when(questionRepository.add(J_QUEST1)).thenReturn(J_QUEST1);
        assertEquals(J_QUEST1, out.add(J_QUEST1));
    }

    @Test
    void shouldCorrectRemoveQuestion() {
        when(questionRepository.remove(J_QUEST2)).thenReturn(J_QUEST2);
        assertEquals(J_QUEST2, out.remove(J_QUEST2));
    }

    @Test
    void shouldReturnEqualCollection() {
        when(questionRepository.getAll()).thenReturn(JAVA_QUESTIONS_SET);
        assertEquals(JAVA_QUESTIONS_SET, out.getAll());
    }

}
