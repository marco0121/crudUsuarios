package com.Ususario.UsuarioCrud.repository;

import com.Ususario.UsuarioCrud.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
