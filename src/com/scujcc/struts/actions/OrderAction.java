package com.scujcc.struts.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scujcc.mapper.MapperUtil;
import com.scujcc.mapper.OrderMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by David on 16/11/30.
 */
public class OrderAction extends ActionSupport {
    SqlSession session = MapperUtil.getSessionFactory().openSession();

    @Override
    public String execute() throws Exception{
        OrderMapper mapper = session.getMapper(OrderMapper.class);
        List list = mapper.selectOrders();
        ActionContext.getContext().getSession().put("order", list);
        return SUCCESS;
    }
}
