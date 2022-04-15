package com.example.demo.service.impl;

import com.example.demo.model.Question;
import com.example.demo.repository.IQuestionRepository;
import com.example.demo.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService implements IQuestionService {

    @Autowired
    private IQuestionRepository questionRepository;
    @Override
    public Page<Question> findAll(Pageable pageable) {
        return questionRepository.findAll(pageable);
    }

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question findById(int id) {
        return questionRepository.findById(id);
    }

    @Override
    public void save(Question question) {
        questionRepository.save(question);
    }

    @Override
    public void remove(int id) {
        questionRepository.deleteById(id);
    }

    @Override
    public List<Question> searchByTitleAndType(String title, String type) {
        return questionRepository.getQuestionByTitleOrQuestionType(title, Integer.parseInt(type));
    }
}
