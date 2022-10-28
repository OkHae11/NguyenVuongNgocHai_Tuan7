package NguyenVuongNgocHai.thigk.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import NguyenVuongNgocHai.thigk.model.Book;
import NguyenVuongNgocHai.thigk.service.BookSerivce;
import NguyenVuongNgocHai.thigk.service.ListenService;
import NguyenVuongNgocHai.thigk.service.SendService;

@RestController
public class BookRestController {
	@Autowired
	private BookSerivce bookSerivce;
	@Autowired
    private SendService sendService;

    @Autowired
    private ListenService listenService;
	
	@PostMapping("/book")
    public Book addSubject(@RequestBody Book book) {
		bookSerivce.saveBook(book);
        return book;
    }
	@GetMapping("/books")
    public List<Book> getBook() {
        return bookSerivce.getBook();
    }
	@PostMapping("sendBook/{id}")
    public Book sendBook(@PathVariable int id) {
        Book subj = null;
        for (Book sub : bookSerivce.getBook() ) {
            if (sub.getSubId() == id) {
                subj = sub;
            }
        }
        if (subj != null)
        	sendService.SendProduct(subj);
        return subj;
    }

    @GetMapping("receiveBook")
    public Book receiveBook() {


        return listenService.receiveProduct();
    }
}
