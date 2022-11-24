package 关联关系;

import java.util.List;

/**
 * 一个老师通过学生列表属性知道学生的存在，而学生通过班主任属性知道老师的存在，那么他们就存在双向关联的关系
 */
public class 老师 {
    public List<学生> 学生列表;
}
