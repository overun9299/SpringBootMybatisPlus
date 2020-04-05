package soap.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author gf
 * @since 2020-04-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Course extends Model<Course> {

    private static final long serialVersionUID = 1L;

    /**
     * 课程id
     */
    private Integer cid;

    /**
     * 课程名称
     */
    private String cname;

    /**
     * 老师id
     */
    private Integer tid;

    /**
     * 用户id
     */
    private String uid;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
