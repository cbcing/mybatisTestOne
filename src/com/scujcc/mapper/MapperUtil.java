package com.scujcc.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by David on 16/11/30.
 */
public class MapperUtil {

    private static SqlSessionFactory sessionFactory;
    private static final String resource = "Configuration.xml";

    public static SqlSessionFactory getSessionFactory(){
        if (sessionFactory == null){
            try {
                Reader reader = Resources.getResourceAsReader(resource);
                sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
