package auth.payload;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
public class MobileSignupRequest {

    @Pattern(regexp = "^[A-Za-zА-Яа-я -.']+$")
    @NotBlank
    private String firstName;

    @Pattern(regexp = "^[A-Za-zА-Яа-я -.']+$")
    @NotBlank
    private String lastName;

    @NotBlank
    private String idToken;
}
