package com.zzg.mvc.dao;

import java.util.List;
import java.util.Map;

/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */
public interface AdminDAO {
   Map<String, Object> list(String username, String password);
}
