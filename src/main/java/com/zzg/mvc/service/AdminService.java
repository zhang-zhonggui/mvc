package com.zzg.mvc.service;

import com.zzg.mvc.result.AJAXResult;

public interface AdminService {
    AJAXResult list(String username, String password);
}
