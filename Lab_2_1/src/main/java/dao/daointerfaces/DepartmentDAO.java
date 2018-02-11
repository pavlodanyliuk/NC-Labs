package dao.daointerfaces;

import offices.Department;
import java.util.List;

public interface DepartmentDAO {

    List<Department> getAllDepartments();

    Department getDepartment(String id);

    void updateDepartment(Department department);

    void deleteDepartment(Department department);

    void addDepartment(Department department);

}
