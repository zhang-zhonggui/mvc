package com.zzg.mvc.dao.impl;

import com.zzg.mvc.dao.GradeDAO;
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
public class GradeDAOImpl implements GradeDAO {
    @Override
    public List<Map<String, Object>> list() {
        String sql = "select * from t_class";
        return DAOUtil.query(sql);
    }
}
