package com.m2m.mapper;

import com.m2m.domain.CmsRole;
import com.m2m.domain.CmsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface CmsRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    long countByExample(CmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    int deleteByExample(CmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    @Delete({
        "delete from cms_role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    @Insert({
        "insert into cms_role (id, name, ",
        "created_at)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(CmsRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    int insertSelective(CmsRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    List<CmsRole> selectByExample(CmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    @Select({
        "select",
        "id, name, created_at",
        "from cms_role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.m2m.mapper.CmsRoleMapper.BaseResultMap")
    CmsRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    int updateByExampleSelective(@Param("record") CmsRole record, @Param("example") CmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    int updateByExample(@Param("record") CmsRole record, @Param("example") CmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    int updateByPrimaryKeySelective(CmsRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    @Update({
        "update cms_role",
        "set name = #{name,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CmsRole record);
}