package com.csi.service;

import com.csi.dao.TradeStoreDaoImpl;
import com.csi.model.TradeStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeStoreServiceImpl {

    @Autowired
    TradeStoreDaoImpl tradeStoreDao;

    public TradeStore saveData(TradeStore tradeStore) {

        return  tradeStoreDao.saveData(tradeStore);
    }

    public List<TradeStore> getAllData() {

        return tradeStoreDao.getAllData();
    }

    public TradeStore updateData(TradeStore tradeStore1) {

        return tradeStoreDao.updateData(tradeStore1);
    }

    public void deleteDataByID(int tradeId) {

        tradeStoreDao.deleteDataByID(tradeId);
    }
}
