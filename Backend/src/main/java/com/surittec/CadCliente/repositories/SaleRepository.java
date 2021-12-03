package com.surittec.CadCliente.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.surittec.CadCliente.dto.SaleSuccessDTO;
import com.surittec.CadCliente.dto.SaleSumDTO;
import com.surittec.CadCliente.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	@Query("SELECT new com.surittec.CadCliente.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+"FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.surittec.CadCliente.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals) ) "
			+"FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();

}
