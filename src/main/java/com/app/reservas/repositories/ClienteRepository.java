package com.app.reservas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.reservas.models.ClienteEntity;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {
    @Query(value = "SELECT * FROM clientes WHERE correo = ?", nativeQuery = true)
    public ClienteEntity findByCorreo(String correo);
}
