package com.app.reservas.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.reservas.models.ClienteEntity;
import com.app.reservas.repositories.ClienteRepository;
import com.app.reservas.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void crearCliente(ClienteEntity cliente) {
        this.clienteRepository.save(cliente);
    }

    @Override
    public List<ClienteEntity> listarClientes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarClientes'");
    }

    @Override
    public ClienteEntity buscarClienteCorreo(String correo) {
        return this.clienteRepository.findByCorreo(correo);
    }

}
