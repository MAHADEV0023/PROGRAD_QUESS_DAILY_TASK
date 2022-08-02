package com.booktask.books_task.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.booktask.books_task.Repository.BookRepo;
import com.booktask.books_task.Models.Book_list;
import java.util.List;

@Service
public class BookServiceImpl  implements BookServices {
    @Autowired
    private BookRepo bookRepo;
    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
    @Override
    public Book_list savebook_list(Book_list book_list)
    {
        return bookRepo.save(book_list);
    }

    @Override
    public List<Book_list> getAllBook_lists() {
        return null;
    }

    @Override
    public Book_list getBook_listById(int ISMB_NUMBER) {
        return null;
    }

    @Override
    public Book_list updateBook_list(Book_list book_list, int ISMB_NUMBER) {
        Book_list existingBook_list=bookRepo.findById(ISMB_NUMBER).orElseThrow();
        existingBook_list.setBook_name(book_list.getBook_name());
        existingBook_list.setBook_price(book_list.getBook_price());
        existingBook_list.setAuthor_name(book_list.getAuthor_name());
        bookRepo.save(existingBook_list);
        return existingBook_list;
    }

    @Override
    public void deleteBook_list(int ISMB_NUMBER) {
        bookRepo.findById(ISMB_NUMBER).orElseThrow();
        bookRepo.deleteById(ISMB_NUMBER);
    }


}
