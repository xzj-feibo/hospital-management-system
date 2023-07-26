package com.szo.hospital.service;

import com.szo.hospital.entity.Ban;
import com.szo.hospital.entity.Paiban;

import java.util.List;

public interface PaibanService {
    List<Paiban> findAllPaiban(Paiban paiban);
    int editPaiban(Paiban paiban);
    List<Ban> findAllBan();
    int insertPaiban(Paiban paiban);
    int count(Integer Id);
}
