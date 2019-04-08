package payroll.employeeservice;

@SuppressWarnings("serial")
class EmployeeNotFoundException extends RuntimeException {

	EmployeeNotFoundException(Long id) {
		//
		super("Could not find employee " + id);
	}
}