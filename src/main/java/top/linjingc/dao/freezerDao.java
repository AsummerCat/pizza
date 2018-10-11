package top.linjingc.dao;

import org.apache.ibatis.annotations.Param;
import top.linjingc.vo.freezer;

import java.util.List;

public interface freezerDao {

    /**
     * 查询所有的解冻信息
     */
    List<freezer> list();

    /**
     * 模糊查询
     */
    List<freezer> findName(@Param("name") String name,@Param("type") Long type);
}