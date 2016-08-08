package com.yubo.wechat.user.dao.pojo;

public class ArgQuestion {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column arg_question.arg_question_id
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	private Integer argQuestionId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column arg_question.arg_topic_id
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	private Integer argTopicId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column arg_question.question
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	private String question;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column arg_question.answser
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	private String answser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column arg_question.reply_for_wrong
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	private String replyForWrong;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column arg_question.valid
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	private Boolean valid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column arg_question.arg_step
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	private Integer argStep;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column arg_question.arg_question_id
	 * @return  the value of arg_question.arg_question_id
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	public Integer getArgQuestionId() {
		return argQuestionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column arg_question.arg_question_id
	 * @param argQuestionId  the value for arg_question.arg_question_id
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	public void setArgQuestionId(Integer argQuestionId) {
		this.argQuestionId = argQuestionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column arg_question.arg_topic_id
	 * @return  the value of arg_question.arg_topic_id
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	public Integer getArgTopicId() {
		return argTopicId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column arg_question.arg_topic_id
	 * @param argTopicId  the value for arg_question.arg_topic_id
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	public void setArgTopicId(Integer argTopicId) {
		this.argTopicId = argTopicId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column arg_question.question
	 * @return  the value of arg_question.question
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column arg_question.question
	 * @param question  the value for arg_question.question
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	public void setQuestion(String question) {
		this.question = question == null ? null : question.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column arg_question.answser
	 * @return  the value of arg_question.answser
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	public String getAnswser() {
		return answser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column arg_question.answser
	 * @param answser  the value for arg_question.answser
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	public void setAnswser(String answser) {
		this.answser = answser == null ? null : answser.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column arg_question.reply_for_wrong
	 * @return  the value of arg_question.reply_for_wrong
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	public String getReplyForWrong() {
		return replyForWrong;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column arg_question.reply_for_wrong
	 * @param replyForWrong  the value for arg_question.reply_for_wrong
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	public void setReplyForWrong(String replyForWrong) {
		this.replyForWrong = replyForWrong == null ? null : replyForWrong
				.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column arg_question.valid
	 * @return  the value of arg_question.valid
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	public Boolean getValid() {
		return valid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column arg_question.valid
	 * @param valid  the value for arg_question.valid
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column arg_question.arg_step
	 * @return  the value of arg_question.arg_step
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	public Integer getArgStep() {
		return argStep;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column arg_question.arg_step
	 * @param argStep  the value for arg_question.arg_step
	 * @mbggenerated  Sun Aug 07 09:02:57 CST 2016
	 */
	public void setArgStep(Integer argStep) {
		this.argStep = argStep;
	}
}