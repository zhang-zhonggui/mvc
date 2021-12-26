package com.zzg.mvc.dao.impl;

import com.zzg.mvc.dao.StudentDAO;
import com.zzg.mvc.entilty.StudentVO;
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
public class StudentDAOImpl implements StudentDAO {
    @Override
    public List<Map<String, Object>> list() {
        String sql = "select s.id,s.name,s.age, s.address ,g.grade from student s inner join t_class g where s.grade = g.id";
        return DAOUtil.query(sql);
    }

    @Override
    public int deleteStu(int id) {
        String sql = "delete from student where id =?";
        return DAOUtil.update(sql, id);
    }

    @Override
    public int addStudent(StudentVO stu) {
        String sql = "insert into student values(null,?,?,?,?)";
        return DAOUtil.update(sql, stu.getName(), stu.getAge(), stu.getAddress(), stu.getGrade());
    }

    @Override
    public Map<String, Object> getStu(int id) {
        String sql = "select * from student where id=?";
        List<Map<String, Object>> query = DAOUtil.query(sql, id);
        if (query.size() > 0) {
           return query.get(0);
        }
        return null;
    }

    @Override
    public int updateStu(StudentVO stu) {
        String sql = "update student set name = ? ,age = ? ,address = ?,grade = ? where id = ? ";
        int update = DAOUtil.update(sql, stu.getName(), stu.getAge(), stu.getAddress(), stu.getGrade(), stu.getId());
        return update;
    }
}
