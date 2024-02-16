package com.myjavalife.bookendpointsms.repository;

import com.myjavalife.bookendpointsms.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
