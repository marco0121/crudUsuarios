package com.Ususario.UsuarioCrud.controller;


import com.Ususario.UsuarioCrud.entity.Usuario;
import com.Ususario.UsuarioCrud.service.impl.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> readAll(){
    return usuarioService.readAll ();
}

    @GetMapping("/usuarios/{id}")
    public ResponseEntity<Usuario> readById(@PathVariable Long id){
        return usuarioService.readById (id).map (ResponseEntity::ok)
                .orElse (ResponseEntity.notFound ().build ());
    }
    @PostMapping("/usuarios")
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioService.save (usuario);
    }
    @PutMapping("/usuarios/{id}")
    public Usuario update(@RequestBody Usuario usuario) {
        return usuarioService.update(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario>deleteById(@PathVariable Long id){
        usuarioService.deleteById (id);
        return ResponseEntity.ok ().build ();
    }
}
