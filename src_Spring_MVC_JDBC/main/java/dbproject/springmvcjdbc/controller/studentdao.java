package dbproject.springmvcjdbc.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

class student {
	String uname;
	String pwd;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "student [uname=" + uname + ", pwd=" + pwd + "]";
	}
}
interface studentdao{
	public void insertData(student s);
	public List<Map<String,Object>> displayData();
}
@Service
class studentDaoImp implements studentdao{
	@Autowired
	JdbcTemplate jdbcTemplate;
	public void insertData(student s) {
		String query = "insert into login values('"+s.uname+"','"+s.pwd+"')";
		int check = jdbcTemplate.update(query);
		if(check!=0) {
			System.out.println("Record added...");
		}
	}
	public List<Map<String,Object>> displayData() {
		String query = "select * from login"; 
	    jdbcTemplate.execute(query);
	    //List<student> lsList = new ArrayList<student>();
	    List<Map<String,Object>> lsRows = jdbcTemplate.queryForList(query);
	    return lsRows;
	}
}
