package com.Ususario.UsuarioCrud.service.impl;


import com.Ususario.UsuarioCrud.entity.Usuario;
import com.Ususario.UsuarioCrud.repository.UsuarioRepository;
import com.Ususario.UsuarioCrud.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;


    @Override
    public List<Usuario> readAll () {
        return usuarioRepository.findAll ();
    }

    @Override
    public Optional<Usuario> readById (Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById (id);
        return usuario;
    }

    @Override
    public Usuario create (Usuario usuario) {
        usuarioRepository.save (usuario);
        return usuario;
    }

    @Override
    public Usuario update (Usuario usuario) {
        usuarioRepository.save(usuario);
        return usuario;
    }


    @Override
    public void deleteById (Long id) {
        usuarioRepository.deleteById (id);
    }

    @Override
    public Usuario save (Usuario usuario) {
        return usuarioRepository.save (usuario);
    }

}





