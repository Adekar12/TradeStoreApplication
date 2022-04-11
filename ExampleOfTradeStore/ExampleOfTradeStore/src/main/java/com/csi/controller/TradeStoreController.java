package com.csi.controller;

import com.csi.exception.RecordNotFoundException;
import com.csi.model.TradeStore;
import com.csi.repo.TradeStoreRepositary;
import com.csi.service.TradeStoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TradeStoreController {

    @Autowired
    TradeStoreServiceImpl tradeStoreService;

    @Autowired
    TradeStoreRepositary tradeStoreRepositary;


    @PostMapping("/")

    public ResponseEntity<TradeStore> saveData(@RequestBody TradeStore tradeStore){

        return ResponseEntity.ok(tradeStoreService.saveData(tradeStore));
    }


    @GetMapping("/getAllData")

    public ResponseEntity<List<TradeStore>> getAllData(){

        return ResponseEntity.ok(tradeStoreService.getAllData());
    }


    @PutMapping("/{tradeId}")

    public ResponseEntity<TradeStore> updateData(@RequestBody TradeStore tradeStore, @PathVariable int tradeId) throws RecordNotFoundException {
        TradeStore tradeStore1=tradeStoreRepositary.findById(tradeId).orElseThrow(()->new RecordNotFoundException("Trade Id is not found"));
        tradeStore1.setTradeVersion(tradeStore.getTradeVersion());
        tradeStore1.setCountryPartyId(tradeStore.getCountryPartyId());
        tradeStore1.setBookId(tradeStore.getBookId());
        tradeStore1.setMaturityDate(tradeStore.getMaturityDate());
        tradeStore1.setCreatedDate(tradeStore.getCreatedDate());
        tradeStore1.setExpiredFlag(tradeStore.getExpiredFlag());

         return ResponseEntity.ok(tradeStoreService.updateData(tradeStore1));
    }



    @DeleteMapping("/{tradeId}")

    public String deleteDataByID(@PathVariable int tradeId){

        tradeStoreService.deleteDataByID(tradeId);
        return "Data Deleted Successfully";
    }
}
