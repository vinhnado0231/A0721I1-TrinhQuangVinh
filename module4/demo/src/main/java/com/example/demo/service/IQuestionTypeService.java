package com.example.demo.service;

import com.example.demo.model.Question;
import com.example.demo.model.QuestionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IQuestionTypeService {
    Page<QuestionType> findAll(Pageable pageable);

    List<QuestionType> findAll();

    QuestionType findById(int id);

    void save(QuestionType questionType);

    void remove(int id);
}
