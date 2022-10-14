package lk.PosSystem.EmployeeManagement.business.util;


import lk.PosSystem.EmployeeManagement.dto.EmployeeDTO;
import lk.PosSystem.EmployeeManagement.model.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntityDTOMapper {

    EmployeeDTO getEmployeeDTO(Employee Employee);

    Employee getEmployee(EmployeeDTO EmployeeDTO);
}
