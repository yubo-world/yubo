package com.yubo.wechat.user.dao.pojo;

import java.util.Date;

public class UserPetFavor {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_pet_favor.favor_id
	 * @mbggenerated  Tue May 17 08:27:43 PDT 2016
	 */
	private Integer favorId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_pet_favor.user_id
	 * @mbggenerated  Tue May 17 08:27:43 PDT 2016
	 */
	private Integer userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_pet_favor.pet_id
	 * @mbggenerated  Tue May 17 08:27:43 PDT 2016
	 */
	private Integer petId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_pet_favor.favor_point
	 * @mbggenerated  Tue May 17 08:27:43 PDT 2016
	 */
	private Double favorPoint;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_pet_favor.valid
	 * @mbggenerated  Tue May 17 08:27:43 PDT 2016
	 */
	private Boolean valid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_pet_favor.last_modify
	 * @mbggenerated  Tue May 17 08:27:43 PDT 2016
	 */
	private Date lastModify;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_pet_favor.favor_id
	 * @return  the value of user_pet_favor.favor_id
	 * @mbggenerated  Tue May 17 08:27:43 PDT 2016
	 */
	public Integer getFavorId() {
		return favorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_pet_favor.favor_id
	 * @param favorId  the value for user_pet_favor.favor_id
	 * @mbggenerated  Tue May 17 08:27:43 PDT 2016
	 */
	public void setFavorId(Integer favorId) {
		this.favorId = favorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_pet_favor.user_id
	 * @return  the value of user_pet_favor.user_id
	 * @mbggenerated  Tue May 17 08:27:43 PDT 2016
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_pet_favor.user_id
	 * @param userId  the value for user_pet_favor.user_id
	 * @mbggenerated  Tue May 17 08:27:43 PDT 2016
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_pet_favor.pet_id
	 * @return  the value of user_pet_favor.pet_id
	 * @mbggenerated  Tue May 17 08:27:43 PDT 2016
	 */
	public Integer getPetId() {
		return petId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_pet_favor.pet_id
	 * @param petId  the value for user_pet_favor.pet_id
	 * @mbggenerated  Tue May 17 08:27:43 PDT 2016
	 */
	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_pet_favor.favor_point
	 * @return  the value of user_pet_favor.favor_point
	 * @mbggenerated  Tue May 17 08:27:43 PDT 2016
	 */
	public Double getFavorPoint() {
		return favorPoint;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_pet_favor.favor_point
	 * @param favorPoint  the value for user_pet_favor.favor_point
	 * @mbggenerated  Tue May 17 08:27:43 PDT 2016
	 */
	public void setFavorPoint(Double favorPoint) {
		this.favorPoint = favorPoint;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_pet_favor.valid
	 * @return  the value of user_pet_favor.valid
	 * @mbggenerated  Tue May 17 08:27:43 PDT 2016
	 */
	public Boolean getValid() {
		return valid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_pet_favor.valid
	 * @param valid  the value for user_pet_favor.valid
	 * @mbggenerated  Tue May 17 08:27:43 PDT 2016
	 */
	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_pet_favor.last_modify
	 * @return  the value of user_pet_favor.last_modify
	 * @mbggenerated  Tue May 17 08:27:43 PDT 2016
	 */
	public Date getLastModify() {
		return lastModify;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_pet_favor.last_modify
	 * @param lastModify  the value for user_pet_favor.last_modify
	 * @mbggenerated  Tue May 17 08:27:43 PDT 2016
	 */
	public void setLastModify(Date lastModify) {
		this.lastModify = lastModify;
	}
}