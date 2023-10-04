package yr.example.mapper;

import org.apache.ibatis.annotations.*;
import yr.example.poji.Emp;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
    @Delete("delete from emp where id = #{id}")
    public void delete(Integer id);

    @Insert("insert into emp (username, name, gender, image, job, entrydate, dept_id, create_time, update_time)" +
            "values (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    public void insert(Emp emp);


    public void update(Emp emp);

    @Select("select * from emp where id = #{id}")
    public Emp showInfo(Integer id);

    @Select("<script>" +
            "select * from emp " +
            "<where>" +
            "<if test='name != null'> and name like CONCAT('%', #{name}, '%') </if>" +
            "<if test='gender != null'> and gender = #{gender} </if>" +
            "<if test='begin != null and end != null'> and entryDate between #{begin} and #{end} </if>" +
            "</where>" +
            "</script>")
    public List<Emp>search(String name, Short gender, LocalDate begin, LocalDate end);

    public void deleteByIds(List<Integer> ids);


}
