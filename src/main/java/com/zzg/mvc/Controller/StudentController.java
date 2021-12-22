package com.zzg.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */
@Controller
@RequestMapping("/stu")
public class StudentController {
    @RequestMapping("/a")
    public void test1() {
        System.out.println(1);
    }
    @RequestMapping("/b")
    public void test2() {
        System.out.println(8);
    }
}
