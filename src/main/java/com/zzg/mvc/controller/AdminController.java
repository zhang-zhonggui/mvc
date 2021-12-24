package com.zzg.mvc.controller;

import com.zzg.mvc.result.AJAXResult;
import com.zzg.mvc.service.AdminService;
import com.zzg.mvc.sysconst.AJAXResultSysconst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */
@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("login")
    public AJAXResult login(String username, String password) {
        return adminService.list(username, password);
    }

    @RequestMapping("getname")
    public AJAXResult getName() {
        return adminService.getName();
    }
}
