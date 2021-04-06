package com.xfk.eduservice.controller;


import com.xfk.eduservice.entity.EduTeacher;
import com.xfk.eduservice.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author xfk
 * @since 2021-04-06
 */
@RestController
@RequestMapping("/eduservice/edu-teacher")
public class EduTeacherController {
    @Autowired
    private EduTeacherService eduTeacherService;
    //查询所有数据
    @GetMapping("findAll")
    public List<EduTeacher> findAllTeacher()
    {
        List<EduTeacher> list =  eduTeacherService.list(null);
        return list;
    }
    //逻辑删除讲师方法
    @DeleteMapping("{id}")
    public boolean removeTeacher(@PathVariable String id){
        return eduTeacherService.removeById(id);
    }

}

