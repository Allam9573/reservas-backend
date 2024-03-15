package com.app.reservas.services;

import java.util.List;

import com.app.reservas.models.ClienteEntity;

public interface ClienteService {

    public void crearCliente(ClienteEntity cliente);

    public List<ClienteEntity> listarClientes();

    public ClienteEntity buscarClienteCorreo(String correo);
}
