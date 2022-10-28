package NguyenVuongNgocHai.thigk.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import NguyenVuongNgocHai.thigk.model.Book;


@Service
public class SendService {

	@Autowired
	private JmsTemplate jTemplate;
	
	String topic = "jpa-topic";
	
	public String SendProduct(Book book) {
		jTemplate.convertAndSend("NgocHai", book);
		return "Send successfull : " + book.toString();
	}
}
