package cc.nimbusk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nimbusk
 */
@Service
public class CycleTestB {

	@Autowired
	private CycleTestA cycleTestA;

	public CycleTestA getCycleTestA() {
		return cycleTestA;
	}

	public void setCycleTestA(CycleTestA cycleTestA) {
		this.cycleTestA = cycleTestA;
	}
}
