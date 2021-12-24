package com.zzg.mvc.result;

import com.zzg.mvc.sysconst.AJAXResultSysconst;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AJAXResult {
    private Integer code;
    private String msg;
    private Object data;

    public static AJAXResult success() {
        return new AJAXResult(AJAXResultSysconst.AJAXResult_CORRECT_CODE, AJAXResultSysconst.AJAXResult_CORRECT_MSG, null);
    }

    public static AJAXResult success(Object data) {
        return new AJAXResult(AJAXResultSysconst.AJAXResult_CORRECT_CODE, AJAXResultSysconst.AJAXResult_CORRECT_MSG, data);
    }

    public static AJAXResult error() {
        return new AJAXResult(AJAXResultSysconst.AJAXResult_WRONG_CODE, AJAXResultSysconst.AJAXResult_WRONG_MSG, null);
    }

    public static AJAXResult error(Object data) {
        return new AJAXResult(AJAXResultSysconst.AJAXResult_WRONG_CODE, AJAXResultSysconst.AJAXResult_WRONG_MSG, data);
    }
}
