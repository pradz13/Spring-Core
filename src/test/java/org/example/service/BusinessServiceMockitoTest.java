package org.example.service;

import org.example.data.DataService;
import org.example.model.Data;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class BusinessServiceMockitoTest {

    @Mock
    private DataService dataService;

    @InjectMocks
    private BusinessService businessService = new BusinessServiceImpl();

    @Test
    public void testBusinessService() {
        BDDMockito.given(dataService.getData()).willReturn(Arrays.asList(new Data(10), new Data(25)));
        List<Data> data = businessService.getData();
        assertEquals(2, data.size());
    }
}
