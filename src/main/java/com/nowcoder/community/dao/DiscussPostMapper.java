package com.nowcoder.community.dao;


import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //param注解用于给参数取别名的，如果只有一个参数，并且在<IF>里使用，必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);


}
