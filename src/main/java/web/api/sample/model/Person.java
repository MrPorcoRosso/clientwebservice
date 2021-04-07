package web.api.sample.model;
import java.io.Serializable;


public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	 /**
	 * POJO  
	 */
	
	private int id;
	
	
	private String name;
	private String lastName;
	private String address;
	
	//getter-setter SHIFT+ALT+S
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
