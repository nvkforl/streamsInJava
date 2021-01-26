package com.demo.streams.person;

public class Department {

	private int dept_id;
	private String dept_name;
	private String location;

	public Department(int dept_id, String dept_name, String location) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.location = location;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dept_id;
		result = prime * result + ((dept_name == null) ? 0 : dept_name.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
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
		Department other = (Department) obj;
		if (dept_id != other.dept_id)
			return false;
		if (dept_name == null) {
			if (other.dept_name != null)
				return false;
		} else if (!dept_name.equals(other.dept_name))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + ", location=" + location + "]";
	}

}
