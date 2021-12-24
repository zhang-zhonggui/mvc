package com.zzg.mvc.dao;

import com.zzg.mvc.entilty.StudentVO;

import java.util.List;
import java.util.Map;

/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */
public interface StudentDAO {
    List<Map<String, Object>> list();
    int deleteStu(int id);
    int addStudent(StudentVO stu);
}
