package com.scujcc.struts.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scujcc.dao.CustomerDAO;
import com.scujcc.mapper.CustomerMapper;
import com.scujcc.mapper.MapperUtil;
import com.scujcc.service.CustomerService;
import com.scujcc.service.CustomerServiceImpl;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by David on 16/11/30.
 */
public class CustomerAction extends ActionSupport {
    private String customerID;

    private CustomerService customerService;

    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    //CustomerDAO dao = new CustomerDAO();

    @Override
    public String execute() throws Exception{
        //getMapper返回一个映射器接口
        CustomerServiceImpl impl = new CustomerServiceImpl();
        List list = impl.queryCustomers();
        ActionContext.getContext().getSession().put("customer", list);

        return SUCCESS;
    }

    public String queryCustomerById() throws Exception{
        CustomerServiceImpl impl = new CustomerServiceImpl();
        List list = impl.queryCustomresById(customerID);
        ActionContext.getContext().getSession().put("customer", list);

        return SUCCESS;
    }
}
