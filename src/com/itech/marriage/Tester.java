package com.itech.marriage;

public class Tester {
		public static void main(String arg[]) {
			MarriageBookingSystem mbs = new MarriageBookingSystem();
			Applicant p1 = new Applicant(3261, "Simren", 24, "female", 2,null);
			mbs.addApplicant(p1);
			Applicant p2 = new Applicant(3262, "Jack", 27, "male", 3,null);
			mbs.addApplicant(p2);
			Applicant p3 = new Applicant(3454, "Pikachu", 26, "male", 4,null);
			mbs.addApplicant(p3);
			Applicant p4 = new Applicant(4509, "Tweety", 23, "female", 5,null);
			mbs.addApplicant(p4);
			Applicant p5 = new Applicant(2243, "Pookie", 25, "male", 6,null);
			mbs.addApplicant(p5);
			System.out.println("Matches found : ");
			try {
				System.out.println(mbs.findMatch(p1));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Assigning applicant!");

			mbs.assignApplicant(2, p2);

			mbs.assignApplicant(5, p3);

			mbs.dropProposal(3);

			System.out.println(mbs.findApplicantSummary());
		}
	}

}
