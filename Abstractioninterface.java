class Employee {
		private String name;
		private int id;
		private double salary;
		private String department;

		static int employeeCount = 0;
		final String companyName = "Tech Solutions";

		Employee(String name, int id, double salary, String department) {
			this.name = name;
			this.id = id;
			this.salary = salary;
			this.department = department;
			employeeCount++;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public static int getEmployeeCount() {
			return employeeCount;
		}

		public String getCompanyName() {
			return companyName;
		}
	}