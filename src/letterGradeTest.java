import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class letterGradeTest {
	
	private letterGrade gradefunction;
	
	@Before
	public void setUp() throws Exception {
		gradefunction = new letterGrade();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void letterGradeXTC1() {
		Assert.assertEquals('X', gradefunction.letterGradeX(102));
	}
	
	@Test
	public void letterGradeXTC2() {
		Assert.assertEquals('A', gradefunction.letterGradeX(95));
	}
	
	@Test
	public void letterGradeXTC3() {
		Assert.assertEquals('B', gradefunction.letterGradeX(85));
	}
	
	@Test
	public void letterGradeXTC4() {
		Assert.assertEquals('C', gradefunction.letterGradeX(75));
	}
	
	@Test
	public void letterGradeXTC5() {
		Assert.assertEquals('D', gradefunction.letterGradeX(65));
	}
	
	@Test
	public void letterGradeXTC6() {
		Assert.assertEquals('F', gradefunction.letterGradeX(35));
	}
	
	@Test
	public void letterGradeXTC7() {
		Assert.assertEquals('X', gradefunction.letterGradeX(-2));
	}
}
