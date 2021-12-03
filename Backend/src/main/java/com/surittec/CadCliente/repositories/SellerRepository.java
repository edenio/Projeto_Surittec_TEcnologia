package com.surittec.CadCliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surittec.CadCliente.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
