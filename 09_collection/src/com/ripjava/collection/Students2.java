package com.ripjava.collection;

import java.util.HashSet;
import java.util.Set;

class Student2 {
	private String name;
	private String number;

	Student2(String name, String number) {
		this.name = name;
		this.number = number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
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
		Student2 other = (Student2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("(%s, %s)", name, number);
	}
}

public class Students2 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(new Student2("Justin", "B835031"));
		set.add(new Student2("Monica", "B835032"));
		set.add(new Student2("Justin", "B835031"));
		System.out.println(set);
	}
}
