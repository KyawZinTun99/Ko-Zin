import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number students");
		int length = s.nextInt();
		String[] name = new String[length];
		String[] gender = new String[length];
		int[] Myan = new int[length];
		int[] Math = new int[length];
		int[] Eng = new int[length];
		int[] totalMark = new int[length];
		boolean[] Result = new boolean [length];
		String genderDisplay = "";
		int passedCount = 0;
		int totalMyan = 0;
		int totalMath = 0;
		int totalEng = 0;
		double totalAveraAllSubMarks = 0;
		int highestMark = 0;
		String topStudent = "";
		String MgMa[];
		// for loop
		for (int i = 0; i < length; i++) {
			String time;

			switch (i + 1) {
			case 1:
				time = "st";
				break;
			case 2:
				time = "nd";
				break;
			case 3:
				time = "rd";
				break;
			default:
				time = "th";
			}

			System.out.println("Enter" + (i + 1) + time + "Student Name:");
			name[i] = s.next();
			System.out.println("Male or Female:");
			gender[i] = s.next();
			if (gender[i].equals("Male")) {genderDisplay="Mg";}
			if (gender[i].equals("Female")) {genderDisplay="Ma";}
			System.out.println("Enter " + genderDisplay+ name[i] + "'s " + "Myan mark:");
			Myan[i] = s.nextInt();
			System.out.println("Enter " + genderDisplay + name[i] + "'s " + "Math mark:");
			Math[i] = s.nextInt();
			System.out.println("Enter " + genderDisplay + name[i] + "'s " + "Eng mark:");
			Eng[i] = s.nextInt();
	
			// total mark
			totalMark[i] = Myan[i] + Math[i] + Eng[i];
			System.out.println(totalMark[i]);
			Result[i] = (Myan[i] >= 40 && Math[i] >= 40 && Eng[i] >= 40);
			if ((Myan[i] >= 40 && Math[i] >= 40 && Eng[i] >= 40))
				Result[i]=true;
			else {
				Result[i]=false;
				 }
			
			// passed check
			Result[i] = (Myan[i] >= 40 && Math[i] >= 40 && Eng[i] >= 40);

			if (Result[i]) {
				passedCount++;
			}
			// highest mark
			totalMyan += Myan[i];
			totalMath += Math[i];
			totalEng += Eng[i];

			if (totalMark[i] > highestMark) {
				highestMark = totalMark[i];
				topStudent = name[i];
			}

		} // for end

		double passRate = ((double) passedCount / length) * 100;
		System.out.println("passRate :" + (double) passRate + "%");// passRate
		// checkAvaAllMark
		double totalavageAllSubMarks = (totalMyan + totalMath + totalEng) / (3 * length);
		System.out.println("Average Mark(All Subjects):" + (double) totalavageAllSubMarks);
		// check ava each sub
		double avgMyan = (double) totalMyan / 3;
		System.out.println("Avage Myanmar Mark:" + (double) avgMyan);
		double avgMath = (double) totalMath / 3;
		System.out.println("Avage Math Mark:" + (double) avgMath);
		double avgEng = (double) totalEng / 3;
		System.out.println("Avage English Mark:" + (double) avgEng);
		// highest mark result
		System.out.println(topStudent + " got highest mark with " + highestMark + ".");

		// Student Summary
		System.out.println("Student Summary");
		System.out.println("Name\tGender\tMyanmar\tMath\tEnglish\tTotal\tPassed/Failed");
		System.out.println("====\t======\t=======\t====\t=======\t=====\t=============");

		for (int j = 0; j < length; j++) 
		{
			System.out.println(name[j]+"\t"+ gender[j]+"\t"+ Myan[j]+"\t"+ Math[j]+"\t"+ Eng[j]+"\t"+ totalMark[j]+"\t"+ Result[j]);
		}
		
	}// p end
}// class end