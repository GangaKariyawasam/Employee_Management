package lk.PosSystem.EmployeeManagement.business.custom.implementation;

import lk.PosSystem.EmployeeManagement.business.custom.EmployeeBO;
import lk.PosSystem.EmployeeManagement.business.util.EntityDTOMapper;
import lk.PosSystem.EmployeeManagement.dto.EmployeeDTO;
import lk.PosSystem.EmployeeManagement.repository.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeBOImpl implements EmployeeBO {

    @Autowired
    private EmployeeDAO EmployeeDAO;

    @Autowired
    private EntityDTOMapper mapper;

    @Override
    public List<EmployeeDTO> findAllEmployees() throws Exception {
        return EmployeeDAO.findAll().stream().map(employee -> mapper.getEmployeeDTO(employee)).collect(Collectors.toList());
    }
}
