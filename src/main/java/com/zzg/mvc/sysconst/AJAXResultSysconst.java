package com.zzg.mvc.sysconst;

/**
 * 用于消除AJAXresult的魔法值
 */
public interface AJAXResultSysconst {
    //操作正确的code码与msg值
    Integer AJAXResult_CORRECT_CODE = 200;
    String AJAXResult_CORRECT_MSG = "操作成功";
    //操作错误的code码与msg值
    Integer AJAXResult_WRONG_CODE = 500;
    String AJAXResult_WRONG_MSG = "操作失败";
}
