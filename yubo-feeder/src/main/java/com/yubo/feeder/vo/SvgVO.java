package com.yubo.feeder.vo;

public class SvgVO {

	private Integer svgId;

	private String svgTag;

	private String svgContent;

	/**
	 * svg文件大小（kb）
	 */
	private Double svgLength;

	public Double getSvgLength() {
		return svgLength;
	}

	public void setSvgLength(Double svgLength) {
		this.svgLength = svgLength;
	}

	public Integer getSvgId() {
		return svgId;
	}

	public void setSvgId(Integer svgId) {
		this.svgId = svgId;
	}

	public String getSvgTag() {
		return svgTag;
	}

	public void setSvgTag(String svgTag) {
		this.svgTag = svgTag;
	}

	public String getSvgContent() {
		return svgContent;
	}

	public void setSvgContent(String svgContent) {
		this.svgContent = svgContent;
	}

}
