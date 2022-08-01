package com.booktask.books_task.Service;
import com.booktask.books_task.Models.Book_list;
import java.util.List;
public interface BookServices {
    Book_list savebook_list(Book_list booklist);
    List< Book_list> getAllBook_lists();
    Book_list getBook_listById(int ISMB_NUMBER);
    Book_list updateBook_list( Book_list booklist,int ISMB_NUMBER);
    void deleteBook_list(int ISMB_NUMBER);
}
