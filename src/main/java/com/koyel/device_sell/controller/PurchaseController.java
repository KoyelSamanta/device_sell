package com.koyel.device_sell.controller;

import com.koyel.device_sell.model.purchase;
import com.koyel.device_sell.security.UserPrincipal;
import com.koyel.device_sell.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase")//pre path
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    /**
     * this method save the details of all purchase
     * @param purchase
     * @return http status
     */

    @PostMapping
    public ResponseEntity<?> savePurchase(@RequestBody purchase purchase){
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal){
        //@AuthenticationPrincipal helps to find the authenticated users
        return ResponseEntity.ok(purchaseService.findPurchaseItemsOfUser(userPrincipal.getId()));

    }
}
