/**
 * 
 */
package edu.springweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import edu.springweb.dao.EmployeeDao;
import edu.springweb.entity.Employee;
import edu.springweb.service.EmployeeService;

/**
 * @author Praveen
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	public static final Logger logger = Logger.getLogger(EmployeeServiceImpl.class);

	@Inject
	private EmployeeDao employeeDao;

	public List<Employee> getAll() {

		logger.debug("Entered getAll()");
		List<Employee> empList = employeeDao.getEmployees();

		return empList;
	}

	public void save(Employee emp) {

		employeeDao.save(emp);
	}

	public Employee getEmpById(Long id) {

		if(id==null || id==0) {
			return null;
		} else {
			return employeeDao.getById(id);
		}
	}

	public Long getNextEmpId() {

		return employeeDao.getNextEmpId();
	}

	public Employee deleteById(Long empId) {

		return employeeDao.deleteById(empId);
	}
}
