package com.yubo.feeder.dao.pojo;

public class ResourceSvg {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_svg.svg_id
     *
     * @mbggenerated Sun Jun 12 18:01:10 CST 2016
     */
    private Integer svgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_svg.svg_tag
     *
     * @mbggenerated Sun Jun 12 18:01:10 CST 2016
     */
    private String svgTag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_svg.svg_content
     *
     * @mbggenerated Sun Jun 12 18:01:10 CST 2016
     */
    private String svgContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_svg.svg_id
     *
     * @return the value of resource_svg.svg_id
     *
     * @mbggenerated Sun Jun 12 18:01:10 CST 2016
     */
    public Integer getSvgId() {
        return svgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_svg.svg_id
     *
     * @param svgId the value for resource_svg.svg_id
     *
     * @mbggenerated Sun Jun 12 18:01:10 CST 2016
     */
    public void setSvgId(Integer svgId) {
        this.svgId = svgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_svg.svg_tag
     *
     * @return the value of resource_svg.svg_tag
     *
     * @mbggenerated Sun Jun 12 18:01:10 CST 2016
     */
    public String getSvgTag() {
        return svgTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_svg.svg_tag
     *
     * @param svgTag the value for resource_svg.svg_tag
     *
     * @mbggenerated Sun Jun 12 18:01:10 CST 2016
     */
    public void setSvgTag(String svgTag) {
        this.svgTag = svgTag == null ? null : svgTag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_svg.svg_content
     *
     * @return the value of resource_svg.svg_content
     *
     * @mbggenerated Sun Jun 12 18:01:10 CST 2016
     */
    public String getSvgContent() {
        return svgContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_svg.svg_content
     *
     * @param svgContent the value for resource_svg.svg_content
     *
     * @mbggenerated Sun Jun 12 18:01:10 CST 2016
     */
    public void setSvgContent(String svgContent) {
        this.svgContent = svgContent == null ? null : svgContent.trim();
    }

	@Override
	public String toString() {
		return "ResourceSvg [svgId=" + svgId + ", svgTag=" + svgTag
				+ ", svgContent=" + svgContent + "]";
	}
    
    
}