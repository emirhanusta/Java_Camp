

public class Employee {

	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax(double salary) {
		if (salary>1000) {
			return salary*0.03; 
		}
		return 0;
	}
	
	public double bonus(int workHours) {
		if(workHours>40) {
			return (workHours-40)*30;
		}
		return 0;
	}
	
	public double raiseSalary(double salary,int hireYear) {
		if (2021-hireYear<10) {
			return (salary/100)*5;
		}
		else if(2021-hireYear>19) {
			return (salary/100)*15;
		}else
			return (salary/100)*10;
	}
	
	public String toString(Employee employee) {
		double tax=employee.tax(employee.salary);
		double bonus =employee.bonus(employee.workHours);
		double raiseSalary =employee.raiseSalary(employee.salary,employee.hireYear);
		double salaryWithTaxAndBonus= employee.salary+bonus-tax;
		double totalSalary= salaryWithTaxAndBonus +raiseSalary;
		return  " Adı :" +employee.name+
				"\n Maaşı :" +employee.salary+
				"\n Çalışma Saati :" +employee.workHours+
				"\n Başlangıç Yılı :" +employee.hireYear+
				"\n Vergi :" + tax+
				"\n Bonus :" + bonus+
				"\n Maaş Artışı :" +raiseSalary+
				"\n Vergi ve Bonuslar ile birlikte maaş :" +salaryWithTaxAndBonus+
				"\n Toplam Maaş :" + totalSalary;
	}
}