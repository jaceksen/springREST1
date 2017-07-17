package pl.com.erkin.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopisc() {
		return Arrays.asList(
				
				new Topic("spirng","Spring Framework","Spring Framework Description"),
				new Topic("java","Core Java","Core Java Description"),
				new Topic("javascript","JavaScript","JavaScript Description")
				
				);
	}
	
}
