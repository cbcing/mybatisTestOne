package com.scujcc.struts.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scujcc.dao.CustomerDAO;
import com.scujcc.mapper.CustomerMapper;
import com.scujcc.mapper.MapperUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by David on 16/11/30.
 */
public class CustomerAction extends ActionSupport {

    //
    SqlSession session = MapperUtil.getSessionFactory().openSession();

    //CustomerDAO dao = new CustomerDAO();

    @Override
    public String execute() throws Exception{
        CustomerMapper mapper = session.getMapper(CustomerMapper.class); //这里做了一个向上转型
        List list = mapper.selectCustomers();
      //  List list = dao.selectCustomers();
        ActionContext.getContext().getSession().put("customer", list);

        return SUCCESS;
    }
}
