package com.m2m.mapper;

import com.m2m.domain.CmsRoleFeature;
import com.m2m.domain.CmsRoleFeatureExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface CmsRoleFeatureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_feature
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    long countByExample(CmsRoleFeatureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_feature
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    int deleteByExample(CmsRoleFeatureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_feature
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    @Delete({
        "delete from cms_role_feature",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_feature
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    @Insert({
        "insert into cms_role_feature (id, role_id, ",
        "feature_id, created_at)",
        "values (#{id,jdbcType=INTEGER}, #{roleId,jdbcType=INTEGER}, ",
        "#{featureId,jdbcType=INTEGER}, #{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(CmsRoleFeature record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_feature
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    int insertSelective(CmsRoleFeature record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_feature
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    List<CmsRoleFeature> selectByExample(CmsRoleFeatureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_feature
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    @Select({
        "select",
        "id, role_id, feature_id, created_at",
        "from cms_role_feature",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.m2m.mapper.CmsRoleFeatureMapper.BaseResultMap")
    CmsRoleFeature selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_feature
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    int updateByExampleSelective(@Param("record") CmsRoleFeature record, @Param("example") CmsRoleFeatureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_feature
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    int updateByExample(@Param("record") CmsRoleFeature record, @Param("example") CmsRoleFeatureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_feature
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    int updateByPrimaryKeySelective(CmsRoleFeature record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_feature
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    @Update({
        "update cms_role_feature",
        "set role_id = #{roleId,jdbcType=INTEGER},",
          "feature_id = #{featureId,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CmsRoleFeature record);
}