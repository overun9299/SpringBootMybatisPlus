package soap.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import soap.entity.Course;
import soap.service.CourseService;

import java.sql.Wrapper;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gf
 * @since 2020-04-05
 */
@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping(value = "/getCourse")
    @ResponseBody
    public Course getCourse() {
        QueryWrapper<Course> wrapper = new QueryWrapper<>();
        wrapper.eq("cname" , "java");
        return courseService.getOne(wrapper);
    }


    @GetMapping(value = "/getCourse2")
    @ResponseBody
    public Course getCourse2() {

        return courseService.getCourse();
    }

}

