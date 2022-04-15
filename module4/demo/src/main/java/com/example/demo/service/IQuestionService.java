package com.example.demo.service;

import com.example.demo.model.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface IQuestionService {
    Page<Question> findAll(Pageable pageable);

    List<Question> findAll();

    Question findById(int id);

    void save(Question question);

    void remove(int id);

    List<Question> searchByTitleAndType(String title,String type);

}
