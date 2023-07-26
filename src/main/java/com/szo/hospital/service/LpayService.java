package com.szo.hospital.service;

import com.szo.hospital.entity.Lrecord;
import com.szo.hospital.entity.Pay;
import com.szo.hospital.entity.Register;

import java.util.List;

public interface LpayService {

    int updPay(Register register);
    int addPay(Register register);
    List<Pay> selPays(Register register);
    List<Lrecord> selSurplus(Lrecord lrecord);
}
