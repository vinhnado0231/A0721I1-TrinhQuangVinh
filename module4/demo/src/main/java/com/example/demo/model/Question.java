package com.example.demo.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty(message = "Tiêu đề không được để trống")
    @Length(min = 5,max = 100,message = "Tiêu đề phải từ 5 đến 100 kí tự")
    private String title;
    @NotEmpty(message = "Nội dung không được để trống")
    @Length(min = 10,max = 500,message = "Nội dung phải từ 10 đến 500 kí tự")
    private String question;
    private String answer;
    private LocalDate dateCreate;
    private Boolean status;

    @ManyToOne(targetEntity = QuestionType.class)
    @JoinColumn(name = "id_question_type", nullable = false)
    private QuestionType questionType;

    public Question() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }
}
