package com.zzg.mvc.service.impl;

import com.zzg.mvc.dao.StudentDAO;
import com.zzg.mvc.entilty.StudentVO;
import com.zzg.mvc.result.AJAXResult;
import com.zzg.mvc.service.StudentService;
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
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;

    @Override
    public AJAXResult list() {
        List<Map<String, Object>> list = studentDAO.list();
        return AJAXResult.success(list);
    }

    @Override
    public AJAXResult delete(int id) {
        int i = studentDAO.deleteStu(id);
        if (i > 0) {
            return AJAXResult.success();
        }
        return AJAXResult.error();
    }

    @Override
    public AJAXResult addStudent(StudentVO student) {
        return null;
    }
}
