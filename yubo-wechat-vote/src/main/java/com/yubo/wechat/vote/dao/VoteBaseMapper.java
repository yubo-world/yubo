package com.yubo.wechat.vote.dao;

import java.util.List;
import java.util.Map;

import com.yubo.wechat.vote.dao.pojo.VoteBase;

public interface VoteBaseMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table vote_base
	 * @mbggenerated  Tue May 24 22:54:20 CST 2016
	 */
	int deleteByPrimaryKey(Long voteId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table vote_base
	 * @mbggenerated  Tue May 24 22:54:20 CST 2016
	 */
	int insert(VoteBase record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table vote_base
	 * @mbggenerated  Tue May 24 22:54:20 CST 2016
	 */
	int insertSelective(VoteBase record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table vote_base
	 * @mbggenerated  Tue May 24 22:54:20 CST 2016
	 */
	VoteBase selectByPrimaryKey(Long voteId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table vote_base
	 * @mbggenerated  Tue May 24 22:54:20 CST 2016
	 */
	int updateByPrimaryKeySelective(VoteBase record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table vote_base
	 * @mbggenerated  Tue May 24 22:54:20 CST 2016
	 */
	int updateByPrimaryKey(VoteBase record);

	int countByParam(VoteBase record);
	
	List<VoteBase> selectByParam(Map<String,Object> param);
}