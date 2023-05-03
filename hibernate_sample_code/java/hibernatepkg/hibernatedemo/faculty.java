package hibernatepkg.hibernatedemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class faculty {
	@Id
	private int facultyId;
	private String facultyName;
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	@Override
	public String toString() {
		return "faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + "]";
	}
	public faculty(int facultyId, String facultyName) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
	}
	public faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
