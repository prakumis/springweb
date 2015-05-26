/**
 * 
 */
package edu.springweb.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import edu.springweb.entity.Employee;

/**
 * @author Praveen
 *
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private static Long empId = 100L;
	private static Map<Long, Employee> empMap = new HashMap<Long, Employee>(5);
	static {
		Employee emp = null;
		emp = new Employee();
		emp.setId(getIncrementedEmpId());
		emp.setFirstName("Praveen Kumar");
		emp.setLastName("Mishra");
		empMap.put(emp.getId(), emp);

		emp = new Employee();
		emp.setId(getIncrementedEmpId());
		emp.setFirstName("Yash");
		emp.setLastName("Mishra");
		empMap.put(emp.getId(), emp);
	}

	public Long getNextEmpId() {
		return ++empId;
	}

	public static Long getIncrementedEmpId() {
		return ++empId;
	}

	/** (non-Javadoc)
	 * @see edu.springweb.dao.EmployeeDao#getEmployees()
	 */
	public List<Employee> getEmployees() {

		List<Employee> empList = new ArrayList<Employee>(empMap.values());
		//return (List<Employee>) empMap.values();
		return empList;
	}

	public void save(Employee emp) {

		empMap.put(emp.getId(), emp);
	}

	public Employee getById(Long id) {

		System.out.println(empMap.get(100L));
		System.out.println(empMap.get(101L));
		System.out.println(empMap.get(id));
		return empMap.get(id);
	}

	public Employee deleteById(Long empId) {

		Employee emp = empMap.get(empId);
		empMap.remove(empId);
		return emp;
	}

}
