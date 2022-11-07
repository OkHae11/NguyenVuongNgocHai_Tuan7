package NguyenVuongNgocHai.thigk.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SubId;
	
	private String Name;
	private String Credit;
	public int getSubId() {
		return SubId;
	}
	public void setSubId(int subId) {
		SubId = subId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCredit() {
		return Credit;
	}
	public void setCredit(String credit) {
		Credit = credit;
	}
	public Book(int subId, String name, String credit) {
		super();
		SubId = subId;
		Name = name;
		Credit = credit;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [SubId=" + SubId + ", Name=" + Name + ", Credit=" + Credit + "]";
	}
	
}
