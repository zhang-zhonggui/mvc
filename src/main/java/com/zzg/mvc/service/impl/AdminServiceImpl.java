package com.zzg.mvc.service.impl;

import com.zzg.mvc.dao.AdminDAO;
import com.zzg.mvc.result.AJAXResult;
import com.zzg.mvc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDAO admin;
    @Autowired
    private HttpSession httpSession;


    @Override
    public AJAXResult list(String username, String password) {
        List<Map<String, Object>> list = admin.list(username, password);
        if (list == null) {
            return AJAXResult.error();
        }
        httpSession.setAttribute("admin", admin);
        return AJAXResult.success();
    }
}
