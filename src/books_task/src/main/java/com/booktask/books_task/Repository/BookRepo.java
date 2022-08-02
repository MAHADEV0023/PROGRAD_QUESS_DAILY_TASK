package com.booktask.books_task.Repository;
import com.booktask.books_task.Models.Book_list;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book_list,Integer>{
}
