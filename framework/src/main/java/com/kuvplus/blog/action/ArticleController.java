package com.kuvplus.blog.action;

import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kuvplus.blog.domain.Article;
import com.kuvplus.blog.service.ArticleService;



public class ArticleController {

	private static ApplicationContext app;
	private static ArticleService articleService;

	/*@Test
	public void listArticle() {
		Pagination<Article> page = articleService.getPageArticle(2, 10);
		System.out.println(page);
	}
*/
	@Test
	public void save() {
		for (int i = 1; i < 21; i++) {
			Article a = new Article();
			a.setTitle("mongodb开始实战" + i);
			a.setContent("mongodb开始实战..内容" + i);
			articleService.save(a);
			System.out.println(a);
		}
	}

	@Test
	public void findArticle() {
		Map<String, String> params= new HashMap<String, String>();
		
		//Article a = articleService.findtitle(params);
		//System.out.println(a);
		//Map<String, String> params= new HashMap<String, String>();
		
	}

	@Test
	public void update() {
		Map<String, String> params = new HashMap<String, String>();
		params.put("title", "修改内容...");
		articleService.update("50fe23e6bc402ee4051f90b8", params);
	}

	@BeforeClass
	public static void initSpring() {
		app = new ClassPathXmlApplicationContext(new String[] { "classpath:spring/framework-context.xml",
				"classpath:spring/mongodb.xml" });
		articleService = (ArticleService) app.getBean("articleService");
	}
	
public static void main(String[] args) {

			app = new ClassPathXmlApplicationContext(new String[] { "classpath:spring/framework-context.xml",
					"classpath:spring/mongodb.xml" });
			articleService = (ArticleService) app.getBean("articleService");
			//Article a = articleService.findByid("");
			for (int i = 1; i < 21; i++) {
				Article a = new Article();
				a.setTitle("mongo成功dd了weww " + i);
				a.setContent("mongodbdd数据库ww..内容" + i);
				articleService.save(a);
			}
	}
	
}
