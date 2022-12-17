package org.example.service;

import org.example.data.DataService;
import org.example.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private DataService dataService;

    @Override
    public List<Data> getData() {
        return dataService.getData();
    }
}
