package com.csi.repo;


import com.csi.model.TradeStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeStoreRepositary extends JpaRepository<TradeStore, Integer> {
}
