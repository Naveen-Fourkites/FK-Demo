package org.example.repository;

import org.example.DTO.PODataDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PO_OrderRepository extends JpaRepository<PODataDTO, Long> {


}
