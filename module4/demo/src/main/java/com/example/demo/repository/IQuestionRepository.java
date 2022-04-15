package com.example.demo.repository;

import com.example.demo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IQuestionRepository extends JpaRepository<Question,Integer> {
    @Query(value = "SELECT * FROM Question where id=?1",nativeQuery = true)
    public Question  findById(int id);

    @Query(value = "select * from Question where title like concat('%' , ?1 ,'%') and id_question_type= ?2" , nativeQuery=true)
    List<Question> getQuestionByTitleOrQuestionType(String title , int questionType);
}
