package com.pragademy.video;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoList {

	@RequestMapping("/praga")
	public List<Video>getAllVideos() {
		return Arrays.asList(
				new Video("1", "Selenium Series Part 1 - Introduction", "https://www.youtube.com/watch?v=VMvcedpFYqU"),
				new Video("2", "Git Introduction - Tamil", "https://www.youtube.com/watch?v=lQGkBeACKBM&t=2s"),
				new Video("3", "What is Github and Basic Commands - Tamil", "https://www.youtube.com/watch?v=Xwa12rVlw4g&t=6s")
				);
	}
	
	@RequestMapping("/prag")
	public String sayHello() {
		return "Hey Praga!!";
	}
}
