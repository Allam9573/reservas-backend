package com.app.reservas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.reservas.models.ClienteEntity;
import com.app.reservas.services.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crear")
    public void clientes(@RequestBody ClienteEntity clienteEntity) {
        this.clienteServiceImpl.crearCliente(clienteEntity);
    }

    @GetMapping("/correo/{correo}")
    public ClienteEntity buscarClienteCorreo(@PathVariable String correo) {
        return this.buscarClienteCorreo(correo);
    }

}
