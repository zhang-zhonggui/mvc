package com.zzg.mvc.service.impl;

import com.zzg.mvc.dao.GradeDAO;
import com.zzg.mvc.result.AJAXResult;
import com.zzg.mvc.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */
@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeDAO gradeDAO;

    @Override
    public AJAXResult list() {
        List<Map<String, Object>> list = gradeDAO.list();
        if (list.size() > 0) {
            return AJAXResult.success(list);
        }
        return null;
    }
}
