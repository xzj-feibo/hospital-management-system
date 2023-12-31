package com.szo.hospital.service.Impl;

import com.szo.hospital.entity.Drugdictionary;
import com.szo.hospital.entity.Drugstore;
import com.szo.hospital.mapper.PutinMapper;
import com.szo.hospital.service.PutinService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PutinServiceImpl implements PutinService {

    @Resource
    private PutinMapper sm;
       @Override
    public List<Drugdictionary> seldcy(Drugdictionary drugdictionary) {
        return sm.seldcy(drugdictionary);
    }



   @Override
    public int adddrugstore(Drugstore drugstoreName) {
        return sm.adddrugstore(drugstoreName);
    }

    @Override
    public int seldrugname(Drugstore drugstore) {
        return sm.seldrugname(drugstore);
    }

    @Override
    public int updrugnumber(Drugstore drugstore) {
        return sm.updrugnumber(drugstore);
    }

    @Override
    public int selnumber(Drugstore drugstore) {
        return sm.selnumber(drugstore);
    }

}
