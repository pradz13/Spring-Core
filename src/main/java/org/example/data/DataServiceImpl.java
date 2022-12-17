package org.example.data;

import org.example.model.Data;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class DataServiceImpl implements DataService {
    @Override
    public List<Data> getData() {
        return Arrays.asList(new Data(10), new Data(20));
    }
}
