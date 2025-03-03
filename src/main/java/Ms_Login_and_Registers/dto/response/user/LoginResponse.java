package Ms_Login_and_Registers.dto.response.user;

import Ms_Login_and_Registers.models.Permissions;
import Ms_Login_and_Registers.models.Roles;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class LoginResponse {
    private String message;
    private boolean success;
    private  Long id;
    private String token;
    private String type;
    private String username;
    private String email;
    private String parc;


    private boolean statut;
    private Long themeid;
    private Roles userrole;

    private String roles;
    private Set<Permissions> permissions;
    private String password;
    public LoginResponse() {
    }

    public LoginResponse(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public LoginResponse(String token) {
    }


}


