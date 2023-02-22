package entities;

public class Employee {

	public Integer id;
	public String name;
	public Double salary;

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void increaseSalary(double percentege) {
		salary += salary * percentege / 100.0;
	}

	public Integer getId() {
		return id;
	}

	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}
