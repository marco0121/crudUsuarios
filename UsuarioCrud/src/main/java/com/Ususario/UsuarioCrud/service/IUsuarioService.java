package com.Ususario.UsuarioCrud.service;

import com.Ususario.UsuarioCrud.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    public List<Usuario>readAll();
    public Optional<Usuario>readById(Long id);
    public Usuario create (Usuario usuario);

    Usuario update (Usuario usuario);

    public void deleteById(Long id);
    public Usuario save(Usuario usuario);
}
