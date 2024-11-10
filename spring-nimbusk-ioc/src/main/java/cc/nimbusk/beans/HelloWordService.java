package cc.nimbusk.beans;

import org.springframework.stereotype.Service;

@Service
public class HelloWordService {

	public void sayHello(String name) {
		System.out.println("Hello World:" + name);
	}

}
