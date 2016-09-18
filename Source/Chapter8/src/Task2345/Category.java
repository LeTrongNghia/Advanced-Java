package Task2345;

/* Author: Lê Trọng Nghia
 * Date: 16/9/2016
 * Version: V1.0
 * Description: define for category
 */
public class Category {

	int id;
	String name;
	String description;
	
	public Category() {
		super();
	}

	
	public Category(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}


	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * Get information of category
	 * Return result as a String
	 */
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
}
