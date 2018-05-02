package com.stadio.model.repository;

import com.stadio.model.documents.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, String> {
        List<Comment> findByTconstOrderByCreateDate(String tconst);
}
