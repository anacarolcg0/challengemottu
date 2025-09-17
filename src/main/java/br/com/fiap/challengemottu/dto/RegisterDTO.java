package br.com.fiap.challengemottu.dto;

import br.com.fiap.challengemottu.model.UserRole;

public record RegisterDTO(
        String username,
        String password,
        UserRole role
) {
}