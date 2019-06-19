/**
 * 
 */
package com.foodallert.dto;

/**
 * @author SPS15
 *
 */
public class Article {
	private String title;
	private String overview;
	private String imageURL;
	private String articleURL;
	
	public Article(String title, String overview, String imageURL, String articleURL) {
		this.title = title;
		this.overview = overview;
		this.imageURL = imageURL;
		this.articleURL = articleURL;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public String getArticleURL() {
		return articleURL;
	}
	public void setArticleURL(String articleURL) {
		this.articleURL = articleURL;
	}
}
