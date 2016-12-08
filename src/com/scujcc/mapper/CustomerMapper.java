package com.scujcc.mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by David on 16/11/30.
 */
public interface CustomerMapper {
    public List selectCustomers();

    public List selectCustomersById(String customerID);

    public Map selectCustomersMap();
}
