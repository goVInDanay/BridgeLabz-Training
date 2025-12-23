import java.util.*;
public class CheckCanVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age[] = new int[10];
		for(int i = 0; i < 10; i++) {
			age[i] = sc.nextInt();
		}
		String validate[][] = canVote(age);
		display(validate);
	}	
	private static String[][] canVote(int age[]){
		String validate[][] = new String[age.length][2];
		for(int i = 0; i < age.length; i++) {
			if(age[i] < 0) {
				validate[i][0] = String.valueOf(age[i]);
				validate[i][1] = "invalid number. cannot vote";
			}
			else {
				if(age[i] >= 18) {
					validate[i][0] = String.valueOf(age[i]);
					validate[i][1] = "can vote";
				}
				else {
					validate[i][0] = String.valueOf(age[i]);
					validate[i][1] = "cannot vote";
				}
			}
		}
		return validate;
	}
	private static void display(String validate[][]) {
		for(int i = 0; i < validate.length; i++) {
			System.out.println(validate[i][0] + " " + validate[i][1]);
		}
		
	}
}
