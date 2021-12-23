package com.zzg.mvc.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class DAOUtil {

    private static DataSource dataSource = null;

    static {
        try {
            Properties properties = new Properties();
            properties.load( DAOUtil.class.getClassLoader().getResourceAsStream("druid.properties") );
             // 创建数据库连接池
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection()throws Exception{
        // 从连接池中获取连接对象并且返回
        return   dataSource.getConnection();
    }

    public static int  update(String sql,Object... params){
        Connection conn = null;
        try {
            conn = DAOUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            for(int i=0;i<params.length;i++){
                ps.setObject(i+1,params[i]);
            }
            int i = ps.executeUpdate();
            return i;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(conn != null) { conn.close(); }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return 0;
    }

    public static List<Map<String,Object>> query(String sql,Object... params){
        Connection conn = null;
        try {
            conn = DAOUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            for(int i=0;i<params.length;i++){
                ps.setObject(i+1,params[i]);
            }
            ResultSet set = ps.executeQuery();
            int columnCount = set.getMetaData().getColumnCount();
            List<Map<String,Object>> data = new ArrayList<>();
            while (set.next()){
                Map<String,Object> map = new HashMap<>();
                for(int i=0;i<columnCount;i++){
                    map.put(set.getMetaData().getColumnLabel(i+1),set.getObject(i+1));
                }
                data.add(map);
            }
            return  data;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(conn != null) { conn.close(); }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }

}
