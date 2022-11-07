package NguyenVuongNgocHai.thigk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import NguyenVuongNgocHai.thigk.entity.Book;
import NguyenVuongNgocHai.thigk.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	

	@Override
	public List<Book> getBook() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

}
