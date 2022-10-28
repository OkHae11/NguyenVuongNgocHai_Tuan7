package NguyenVuongNgocHai.thigk.service;




import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import NguyenVuongNgocHai.thigk.model.Book;



@Component
public class ListenService {
	
	Book book = null;
	 	
	@JmsListener(destination = "NgocHai")
	public void receive(Book book) {
		this.book = book;
		System.out.println(book);
	}
	public Book receiveProduct() {
		// TODO Auto-generated method stub
		return book;
	}
} 
