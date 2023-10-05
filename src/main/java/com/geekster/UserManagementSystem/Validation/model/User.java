package com.geekster.UserManagementSystem.Validation.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotNull(message = "User ID cannot be null")
    @Positive(message = "User ID must be a positive integer")
    private Integer userId;
    @NotEmpty(message = "User Name cannot be empty")
    private String userName;
    @NotEmpty(message = "Date of birth cannot be empty")
    @Pattern(regexp = "\\d{2}-\\d{2}-\\d{4}", message = "Date of birth must be in dd-MM-yyyy format")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private String userDOB;
    @NotEmpty(message = "Email cannot be empty")
    @Email
    private String userEmail;
    @NotEmpty(message = "Phone number cannot be empty")
    @Pattern(regexp = "\\+\\d{10,12}", message = "Phone number must be in the format +123456789012")
    private String userNumber;
    @NotNull(message = "LocalDateTime cannot be null")
    private LocalDateTime userTime;
}
