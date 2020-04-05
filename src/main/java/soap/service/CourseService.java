package soap.service;

import soap.entity.Course;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gf
 * @since 2020-04-05
 */
public interface CourseService extends IService<Course> {

    Course getCourse();
}
