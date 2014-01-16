package com.kuvplus.jest.action;

import java.util.List;

import org.junit.Test;

import com.kuvplus.jest.domain.News;
import com.kuvplus.jest.service.SearchService;

/**
 * 简单搜索控制器,暂时用junit去代替...(大家可以想想,怎么实现成web),下一篇会结合spring springmvc jest做成web方式...
 * 
 * @author hk
 * 
 *         2013-1-12 下午11:49:02
 */
public class SearchAction {

 SearchService searchService = new SearchService();

	/**
	 * 创建news索引
	 */
	@Test
	public void buildSearchIndex() {
		searchService.builderSearchIndex();
	}

	/**
	 * 搜索新闻
	 */
	@Test
	public void searchNews() {
		String param = "个人";
		List<News> news = searchService.searchsNews(param);
		System.out.println("id   标题                                           内容");
		for (int i = 0; i < news.size(); i++) {
			News article = news.get(i);
			System.out.println(article.getId() + "   " + article.getTitle() + "   " + article.getContent());
		}
	}
public static void main(String[] args) {
	SearchService searchService = new SearchService();
	searchService.builderSearchIndex();
}
	
}
