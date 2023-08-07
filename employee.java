import lombok.Data; 

import javax.persistence.*;

@Data
@Entity
@Table
public class employee {
    @id
    @GeneratedValue(strategy= GenerationType.IDENTITY) 
    private int EmployeeId;
    private String firstname
    private String lastname;
    private String email ;

}
