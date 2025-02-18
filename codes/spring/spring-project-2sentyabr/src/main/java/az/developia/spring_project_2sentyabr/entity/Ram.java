package az.developia.spring_project_2sentyabr.entity;

import org.springframework.stereotype.Component;

@Component(value = "myRam1")
public class Ram {
	
	private int id;
    private int size;
    private String type; 
    
    public Ram() {
		this.id = 12;
		this.size = 16;
		this.type = "DDR3";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Ram [id=" + id + ", size=" + size + ", type=" + type + "]";
	}
    
}
