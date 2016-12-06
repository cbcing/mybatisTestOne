package com.scujcc.dao;

import com.scujcc.domain.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 16/11/30.
 */
public class CustomerDAO {
    public List selectCustomers(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List list = new ArrayList();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                String url = "jdbc:mysql://localhost:3306/Northwind";
                String user = "root";
                String password = "cbc903205927";
                conn = DriverManager.getConnection(url, user, password);
                String sql = "select * from Customers";
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()){
                    if (rs == null){
                        continue;
                    }
                    Customer customer = new Customer();
                    customer.setCustomerID(rs.getString("CustomerID"));
                    customer.setCompanyName(rs.getString("CompanyName"));
                    customer.setContactTitle(rs.getString("ContactTitle"));
                    customer.setContactName(rs.getString("ContactName"));
                    list.add(customer);
                }
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return list;
    }
}
