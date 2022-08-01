package com.booktask.books_task.Controllers;
import com.booktask.books_task.Models.Book_list;
import com.booktask.books_task.Service.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookServices bookServices;
    public BookController( BookServices bookServices) {
        this.bookServices = bookServices;
    }
    @PostMapping
    public ResponseEntity<Book_list> savebook_list(@RequestBody Book_list book_list)
    {
        return new ResponseEntity<Book_list>(bookServices.savebook_list(book_list), HttpStatus.CREATED);
    }
    @GetMapping

    public List<Book_list> getAllBook_lists()
    {
        return bookServices.getAllBook_lists();
    }
    @GetMapping("{ISMB_NUMBER}")
    public ResponseEntity<Book_list> getBook_listById(@PathVariable("ISMB_NUMBER")int ISMB_NUMBER)
    {
        return new ResponseEntity<Book_list>(bookServices.getBook_listById(ISMB_NUMBER),HttpStatus.OK);
    }
    @PutMapping("{ISMB_NUMBER}")
    public ResponseEntity<Book_list> updateBook_list(@PathVariable("ISMB_NUMBER")int ISMB_NUMBER,@RequestBody Book_list book_list)
    {
        return new ResponseEntity<Book_list>(bookServices.updateBook_list(book_list,ISMB_NUMBER), HttpStatus.OK);
    }
    @DeleteMapping("{ISMB_NUMBER}")
    public ResponseEntity<String> deleteBook_list(@PathVariable("ISMB_NUMBER")int ISMB_NUMBER)
    {
        bookServices.deleteBook_list(ISMB_NUMBER);
        return new ResponseEntity<String>("Book deleted successfully",HttpStatus.OK);
    }

}
