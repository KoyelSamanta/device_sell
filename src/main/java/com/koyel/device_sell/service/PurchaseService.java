package com.koyel.device_sell.service;

import com.koyel.device_sell.model.purchase;
import com.koyel.device_sell.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService
{
   purchase savePurchase(purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
