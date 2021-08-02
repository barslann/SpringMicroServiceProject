package com.coderman.photoapp.api.users.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequestModel {

    @NotNull(message = "Firstname cannot be null")
    @Size(min = 2,message = "Firstname must not be less than two characters")
    private String firstName;

    @NotNull(message = "Lastname cannot be null")
    @Size(min = 2,message = "Lastname must not be less than two characters")
    private String lastName;

    @NotNull(message = "Password cannot be null")
    @Size(min = 8,max = 16,message = "Password must be between 8 chacters and 16 chatacters")
    private String password;

    @NotNull(message = "Email cannot be null")
    @Email
    private String email;
}
