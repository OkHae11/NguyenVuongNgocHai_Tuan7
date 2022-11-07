package com.example.UserApp.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter @Getter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;
    private int id_department;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId_department() {
		return id_department;
	}
	public void setId_department(int id_department) {
		this.id_department = id_department;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", id_department=" + id_department + "]";
	}
	public User(int id, String name, int age, int id_department) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.id_department = id_department;
	}
	public User() {
		super();
	}


}
