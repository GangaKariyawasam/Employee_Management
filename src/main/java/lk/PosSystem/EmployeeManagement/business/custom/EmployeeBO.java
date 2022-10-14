package lk.PosSystem.EmployeeManagement.business.custom;

import lk.PosSystem.EmployeeManagement.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeBO {

    public List<EmployeeDTO> findAllEmployees() throws Exception;

}
