package MavenBuild.MavenProject;

public class AgeValidator {
	public String ageVerify(int age) {
		
		if(age>=18) {
			return "right to vote";
		}
		else{
			return "no right to vote";
		}
	}

}
