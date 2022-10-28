package NguyenVuongNgocHai.thigk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import NguyenVuongNgocHai.thigk.model.Book;

@Service
public class BookServiceImpl implements BookSerivce{
	
	private RestTemplate restTemplate;
//    private String crmRestUrl = "http://host.docker.internal:8080/";
    private String crmRestUrl = "http://localhost:8080/";
//    http://localhost:8080/api/customers
    public  BookServiceImpl() {
		// TODO Auto-generated constructor stub 
        this.restTemplate = new RestTemplate();
    }
    
	@Override
	public void saveBook(Book book) {
		 int subId = book.getSubId();
	        if (subId == 0) {
	            restTemplate.postForObject(crmRestUrl + "book", book, String.class);
	        } else {
	            restTemplate.put(crmRestUrl + "book", book);
	        }
	}
	@Override
	public List<Book> getBook() {
		ResponseEntity<List<Book>> responseEntity =
                restTemplate.exchange(crmRestUrl + "books", HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<Book>>() {});
        List<Book> books = responseEntity.getBody();
        return books;
	}

}
