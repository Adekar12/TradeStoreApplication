package com.csi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TradeStore {

    @Id
    @GeneratedValue

    private  int tradeId;

    private int tradeVersion;

    private String countryPartyId;

    private String bookId;

    private LocalDate maturityDate;

    private LocalDate createdDate;

    private String expiredFlag;

}
