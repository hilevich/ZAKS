/*
 * This program helps people to schedule date of wedding and change surname for women
 * 
 * @author Oleksandr Semochko
 * @version 0.0.1
 * 
 * */
package edu.cursor.zaxs.pojo;

import java.io.Serializable;

public class Person implements Serializable{

	/**
	   * This constructor requires all fields to be passed as parameters.
	   *
	   * @param name contains only letters.
	   * @param surname contains only letters.
	   * @param age contains only numbers.
	   * @param sex contains only letters.
	   * @param weddingDate contains numbers, but using String.
	   * @param wantOrNotChangeSurname is a boolean, only true or false allowed.
	   */
	private static final long serialVersionUID = 4982351596053472538L;
	private String name;
	private String surname;
	private int age;
	private String sex;
	private String weddingDate;
	private boolean wantOrNotChangeSurname;

	public Person(String name, String surname, int age, String sex, String weddingDate,
			boolean wantOrNotChangeSurname) {

		this.name = name;
		this.surname = surname;
		this.age = age;
		this.sex = sex;
		this.weddingDate = weddingDate;
		this.wantOrNotChangeSurname = wantOrNotChangeSurname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getWeddingDate() {
		return weddingDate;
	}

	public void setWeddingDate(String weddingDate) {
		this.weddingDate = weddingDate;
	}

	public boolean isWantOrNotChangeSurname() {
		return wantOrNotChangeSurname;
	}

	public void setWantOrNotChangeSurname(boolean wantOrNotChangeSurname) {
		this.wantOrNotChangeSurname = wantOrNotChangeSurname;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", age=" + age + ", sex=" + sex + ", weddingDate="
				+ weddingDate + ", wantOrNotChangeSurname=" + wantOrNotChangeSurname + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result + (wantOrNotChangeSurname ? 1231 : 1237);
		result = prime * result + ((weddingDate == null) ? 0 : weddingDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (wantOrNotChangeSurname != other.wantOrNotChangeSurname)
			return false;
		if (weddingDate == null) {
			if (other.weddingDate != null)
				return false;
		} else if (!weddingDate.equals(other.weddingDate))
			return false;
		return true;
	}

}
