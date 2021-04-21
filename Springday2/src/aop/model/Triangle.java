package aop.model;

public class Triangle {
	String name;
	
	public Triangle() {System.out.println("in triangle constructor");}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getDia() {
		// TODO Auto-generated method stub
		return 20;
	}

}