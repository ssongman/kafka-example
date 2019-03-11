package com.ssongman.kafka.producer.resource;

//import org.apache.kafka.clients.producer.ProducerRecord;
//import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.ssongman.kafka.producer.model.User;

@RestController
@RequestMapping("/kafka")
public class UserResource {
	
	@Autowired
	private KafkaTemplate<String, String> kafkatemplate;
//	private KafkaTemplate<String, User> kafkatemplate2;
	
	private static final String TOPIC = "MyFirstTopic3";

	@GetMapping("/publish1/{message}")
	public String post1(@PathVariable("message") final String message) {
		System.out.println("message : " + message);
		
		kafkatemplate.send(TOPIC, message);
		return  "published seccussfully";
	}

	
//	@GetMapping("/publish2/{name}")
//	public String post2(@PathVariable("name") final String name) {
//		System.out.println("message : " + name);
//		
//		/*
//		String jsonString = JsonHelper.objectToJsonstring(svcHitHist);
//		RecordMetadata  metadata = kafkatemplate.send(new ProducerRecord<String, String>("mvp1", jsonString)).get();
//        System.out.println("Record sent with key to partition " + metadata.partition()
//       + " with offset " + metadata.offset());
//*/
//		
//		kafkatemplate2.send(TOPIC, new User(name, "HR", 30000L));
//		return  "published seccussfully";
//	}
	
}
