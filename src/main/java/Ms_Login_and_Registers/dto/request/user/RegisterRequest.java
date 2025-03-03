package Ms_Login_and_Registers.dto.request.user;

import Ms_Login_and_Registers.dto.response.user.RolesRequest;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {


    private String username;


    private String email;


    private String password;

    private boolean statut;



    private Long themeid;

     private String parc;

     private String roles;
    private Set<String> permissionNames;

}
