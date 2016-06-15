package com.yubo.feeder.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.yubo.feeder.dao.pojo.VoteBase;
import com.yubo.feeder.service.SvgService;
import com.yubo.feeder.service.VoteService;
import com.yubo.feeder.vo.DatagridResponse;
import com.yubo.feeder.vo.VoteAnswerViewEntry;
import com.yubo.feeder.vo.VoteVO;
import com.yubo.wechat.support.TimeUtil;

/**
 * 用户个人信息相关请求入口
 * 
 * @author young.jason
 *
 */
@Controller
@RequestMapping("/vote")
public class VoteController {

	@RequestMapping("/view")
	public ModelAndView view(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return new ModelAndView("vote-manage.html");
	}

	@RequestMapping("/load")
	@ResponseBody
	public DatagridResponse<VoteVO> load(HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam(required = false) Integer page,
			@RequestParam(required = false) Integer rows) throws Exception {
		
		DatagridResponse<VoteVO> dataResponse = new DatagridResponse<>();
		
		List<VoteBase> voteList = voteService.paging(page, rows);
		
		Set<Integer> svgIdSet = new HashSet<>();
		//构建VoteVO
		List<VoteVO> voList = new ArrayList<VoteVO>();
		for (int i = 0; i < voteList.size(); i++) {
					
			VoteBase vb = voteList.get(i);
			JSONObject lookJSON = JSONObject.parseObject(vb.getLookConfig());
			
			//构造基本数据
			voList.add(bulidSimpleVoteVO(vb,lookJSON));
			
			//收集lookjson中的svgId
			appendSvgId(svgIdSet,lookJSON);
		}
		
		dataResponse.setRows(voList);
		dataResponse.setTotal(voteService.getCountForAll());
		
		//对VoteVO中存储的svgId进行多线程去数据库查询
		Map<Integer,String> svgMapping = getSvgMapping(svgIdSet);
		for (int i = 0; i < voList.size(); i++) {
			VoteVO vo = voList.get(i);
			List<VoteAnswerViewEntry> entrys = vo.getVoteAnswer();
			for (VoteAnswerViewEntry voteAnswerViewEntry : entrys) {
				voteAnswerViewEntry.setSvg(svgMapping.get(voteAnswerViewEntry.getSvgId()));
			}
		}
		
		return dataResponse;
	}
	
	private Map<Integer, String> getSvgMapping(Set<Integer> svgIdSet) {
		Map<Integer, String> svgMap = svgService.getSvgDataList(svgIdSet);
		return svgMap;
	}

	private void appendSvgId(Set<Integer> svgIdSet, JSONObject lookJSON) {
		JSONObject answerIcon = lookJSON.getJSONObject("answer-icon");
		Set<Entry<String, Object>> set = answerIcon.entrySet();
		for (Entry<String, Object> entry : set) {
			svgIdSet.add(Integer.parseInt(entry.getValue().toString()));
		}
	}

	private VoteVO bulidSimpleVoteVO(VoteBase voteBase, JSONObject lookJSON) {

		VoteVO vo = new VoteVO();
		vo.setVoteId(voteBase.getVoteId());
		vo.setVoteQuestion(voteBase.getQuestion());
		vo.setVoteTitle(voteBase.getTitle());
		vo.setActiveDate(TimeUtil.formatTime(voteBase.getStartTime(),"yyyy-MM-dd"));
		vo.setVoteAnswer(buildAnswerSimpleView(voteBase,lookJSON.getJSONObject("answer-icon")));
		return vo;
	}

	private List<VoteAnswerViewEntry> buildAnswerSimpleView(VoteBase voteBase, JSONObject iconJSON) {
		JSONObject answerJSON = JSONObject.parseObject(voteBase.getAnswers());

		List<VoteAnswerViewEntry> allAnswer = new ArrayList<>();
		Set<Entry<String, Object>> answerSets = answerJSON.entrySet();
		for (Entry<String, Object> entry : answerSets) {
			VoteAnswerViewEntry answerViewItem = new VoteAnswerViewEntry();
			answerViewItem.setDiscription(entry.getKey());
			answerViewItem.setKey(entry.getValue().toString());
			answerViewItem.setSvgId(Integer.parseInt(iconJSON.getString(answerViewItem.getKey())));
			allAnswer.add(answerViewItem);
		}
		
		return allAnswer;
	}

	@Autowired
	VoteService voteService;
	
	@Autowired
	SvgService svgService;
	
}