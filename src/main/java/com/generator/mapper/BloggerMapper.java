package com.generator.mapper;

import com.generator.pojo.Blogger;
import com.generator.pojo.BloggerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BloggerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogger
     *
     * @mbggenerated
     */
    int countByExample(BloggerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogger
     *
     * @mbggenerated
     */
    int deleteByExample(BloggerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogger
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogger
     *
     * @mbggenerated
     */
    int insert(Blogger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogger
     *
     * @mbggenerated
     */
    int insertSelective(Blogger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogger
     *
     * @mbggenerated
     */
    List<Blogger> selectByExample(BloggerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogger
     *
     * @mbggenerated
     */
    Blogger selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogger
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Blogger record, @Param("example") BloggerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogger
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Blogger record, @Param("example") BloggerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogger
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Blogger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blogger
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Blogger record);
}