package com.m2m.mapper;

import com.m2m.domain.TopicNews;
import com.m2m.domain.TopicNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TopicNewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_news
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    long countByExample(TopicNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_news
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    int deleteByExample(TopicNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_news
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    @Delete({
        "delete from topic_news",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_news
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    @Insert({
        "insert into topic_news (id, topic_id, ",
        "content, type, create_time)",
        "values (#{id,jdbcType=BIGINT}, #{topicId,jdbcType=BIGINT}, ",
        "#{content,jdbcType=VARCHAR}, #{type,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(TopicNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_news
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    int insertSelective(TopicNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_news
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    List<TopicNews> selectByExample(TopicNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_news
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    @Select({
        "select",
        "id, topic_id, content, type, create_time",
        "from topic_news",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.m2m.mapper.TopicNewsMapper.BaseResultMap")
    TopicNews selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_news
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    int updateByExampleSelective(@Param("record") TopicNews record, @Param("example") TopicNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_news
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    int updateByExample(@Param("record") TopicNews record, @Param("example") TopicNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_news
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    int updateByPrimaryKeySelective(TopicNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_news
     *
     * @mbg.generated Thu Jan 18 10:54:32 CST 2018
     */
    @Update({
        "update topic_news",
        "set topic_id = #{topicId,jdbcType=BIGINT},",
          "content = #{content,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TopicNews record);
}