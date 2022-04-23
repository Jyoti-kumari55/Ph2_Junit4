package MavenBuild.MavenProject;
import static org.junit.Assert.*;
import org.junit.Test;

public class AgeValidTest {
	
	//expectedoutput = actual output     assertEquals(EO,AO);
	@Test
	public void test1() {
		AgeValidator valid=new AgeValidator();
		assertEquals("right to vote",valid.ageVerify(19));
	}
	
	@Test
	public void test2() {
		AgeValidator valid=new AgeValidator();
		assertEquals("no right to vote",valid.ageVerify(9));
	}

}
