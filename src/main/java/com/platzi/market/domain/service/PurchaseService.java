package com.platzi.market.domain.service;

import com.platzi.market.domain.Purchase;
import com.platzi.market.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    @Autowired
    PurchaseRepository purchaseRepository;

    public List<Purchase> getAll()
    {
        return purchaseRepository.getAll();
    }

    public Optional<Purchase> getPurchase(int purchaseId){
        return purchaseRepository.getPurchase(purchaseId);
    }

    public Purchase save(Purchase purchase)
    {
        return purchaseRepository.save(purchase);
    }

    public  Optional<List<Purchase>> getByClient(int clientId){
        return purchaseRepository.getByClient(clientId);
    }




}
