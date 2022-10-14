package lk.PosSystem.EmployeeManagement.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

@Data @NoArgsConstructor @AllArgsConstructor
public class EmployeeDTO implements Serializable {

    private long id;

    @NotNull(message = "First Name is required.")
    private String firstName;
    private String lastName;
    private String EmailId;
}
