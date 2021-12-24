package com.zzg.mvc.service;

import com.zzg.mvc.entilty.StudentVO;
import com.zzg.mvc.result.AJAXResult;


/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */
public interface StudentService {
    AJAXResult list();

    AJAXResult delete(int id);

    AJAXResult addStudent(StudentVO student);
}
