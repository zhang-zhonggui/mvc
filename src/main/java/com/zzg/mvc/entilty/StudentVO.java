package com.zzg.mvc.entilty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentVO implements Serializable {

    private int id;
    private String name;
    private int age;
    private String address;
    private int grade;
}
