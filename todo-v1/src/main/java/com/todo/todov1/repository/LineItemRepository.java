package com.todo.todov1.repository;

import com.todo.todov1.model.LineItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineItemRepository extends MongoRepository<LineItem, String> {
}
