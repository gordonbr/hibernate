package com.hibernate.caveat.emptor.repository;

import com.hibernate.caveat.emptor.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
