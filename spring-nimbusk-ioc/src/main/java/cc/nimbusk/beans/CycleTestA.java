package cc.nimbusk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nimbusk
 */
@Service
public class CycleTestA {

	@Autowired
	private CycleTestB cycleTestB;

	public CycleTestB getCycleTestB() {
		return cycleTestB;
	}

	public void setCycleTestB(CycleTestB cycleTestB) {
		this.cycleTestB = cycleTestB;
	}
}
