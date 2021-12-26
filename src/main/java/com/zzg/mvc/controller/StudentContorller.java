package com.zzg.mvc.controller;

import com.zzg.mvc.entilty.StudentVO;
import com.zzg.mvc.result.AJAXResult;
import com.zzg.mvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */
@RequestMapping("stu")
@RestController
public class StudentContorller {

    @Autowired
    private StudentService service;

    @RequestMapping("list")
    public AJAXResult list() {
        return service.list();
    }

    @RequestMapping("delete")
    public AJAXResult delete(int id) {
        return service.delete(id);
    }
    @RequestMapping("addStudent")
    public AJAXResult addStudent(StudentVO student) {
        return  service.addStudent(student);
    }
    @RequestMapping("getStu")
    public AJAXResult getStu(int id) {
      return service.getStu(id);
    }
    @RequestMapping("update")
    public  AJAXResult update(StudentVO stu){
        return service.updateStu(stu);
    }
}
