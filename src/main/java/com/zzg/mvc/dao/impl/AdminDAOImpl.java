package com.zzg.mvc.dao.impl;

import com.zzg.mvc.dao.AdminDAO;
import com.zzg.mvc.util.DAOUtil;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */
@Repository
public class AdminDAOImpl implements AdminDAO {
    @Override
    public Map<String, Object> list(String username, String password) {
        String sql = "SELECT * from t_login where username = ? and password = ?";
        List<Map<String, Object>> query = DAOUtil.query(sql, username, password);
        if (query.size() > 0) {
            return query.get(0);
        }
        return null;
    }
}
