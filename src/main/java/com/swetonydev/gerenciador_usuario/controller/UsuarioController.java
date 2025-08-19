package com.swetonydev.gerenciador_usuario.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.swetonydev.gerenciador_usuario.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    private final ObjectMapper objectMapper;
    private final List<Usuario> usuarios = new ArrayList<>();
    private int nextId = 1;

    public UsuarioController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @GetMapping("/users")
    public ResponseEntity<String> getUsers() throws JsonProcessingException{
        return ResponseEntity.ok(objectMapper.writeValueAsString(usuarios));
    }

    @PostMapping("/users")
    public ResponseEntity<Void> createUser(@RequestBody Usuario usuario){
        usuario.setId(nextId++);
        usuarios.add(usuario);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable int id){
        boolean removed = usuarios.removeIf(usuario -> usuario.getId() == id);
        return removed ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
