package NguyenVuongNgocHai.thigk.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import NguyenVuongNgocHai.thigk.entity.Book;
import NguyenVuongNgocHai.thigk.repository.BookRepository;
import NguyenVuongNgocHai.thigk.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	
	
	@PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }
	@GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getBook();
    }
}
