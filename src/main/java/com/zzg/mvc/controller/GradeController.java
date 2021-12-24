package com.zzg.mvc.controller;

import com.zzg.mvc.result.AJAXResult;
import com.zzg.mvc.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */
@RestController
@RequestMapping("grade")
public class GradeController {
    @Autowired
    private GradeService gradeService;

    @RequestMapping("list")
    public AJAXResult list() {
       return gradeService.list();
    }
}
