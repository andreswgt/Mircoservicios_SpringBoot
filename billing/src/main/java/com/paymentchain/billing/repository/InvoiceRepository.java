/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.paymentchain.billing.repository;

import com.paymentchain.billing.entities.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andre
 */
public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
    
}
