package com.csi.dao;

import com.csi.model.TradeStore;
import com.csi.repo.TradeStoreRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TradeStoreDaoImpl {

    @Autowired
    TradeStoreRepositary tradeStoreRepositary;

    public TradeStore saveData(TradeStore tradeStore) {

        return tradeStoreRepositary.save(tradeStore);
    }

    public List<TradeStore> getAllData() {

       return tradeStoreRepositary.findAll();
    }

    public TradeStore updateData(TradeStore tradeStore1) {

        return tradeStoreRepositary.save(tradeStore1);
    }

    public void deleteDataByID(int tradeId) {

        tradeStoreRepositary.deleteById(tradeId);
    }
}
