package NguyenVuongNgocHai.thigk.service;

import java.util.List;

import NguyenVuongNgocHai.thigk.entity.Book;

public interface BookService {
	public Book saveBook(Book book);
	public List<Book> getBook();
}
