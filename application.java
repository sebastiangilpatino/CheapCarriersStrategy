package Lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class application {

	public static void main(String[] args) throws CloneNotSupportedException {

		String descript, zone;
		double weight;
		int numbPackage = 0;

		ICompany ups = new Ups("UPS");
		ICompany usMail = new USMail("USMail");
		ICompany fedEx = new Fedex("Fedex");

		List<ICompany> companies = new ArrayList<ICompany>();
		List<Double> cost = new ArrayList<Double>();
		List<ICompany> cheapCompa = new ArrayList<ICompany>();

		companies.add(fedEx);
		companies.add(usMail);
		companies.add(ups);

		System.out.print("Number of Package: ");
		Scanner sc = new Scanner(System.in);

		try {
			String s = sc.nextLine();
			numbPackage = Integer.valueOf(s);
		} catch (NumberFormatException e) {
			System.err.println("wrong input");
		}

		for (int i = 0; i < numbPackage; i++) {
			System.out.println("");
			System.out.print("Input Description: ");
			descript = sc.nextLine();
			System.out.print("Input the weight: ");
			weight = Double.valueOf(sc.nextLine());
			System.out.print("Input the zone: ");
			zone = sc.nextLine();

			for (int j = 0; j < companies.size(); j++) {
				companies.get(j).setDescript(descript);
				companies.get(j).setWeight(weight);
				companies.get(j).setZone(zone);
				cost.add(companies.get(j).calculateCost());
			}

			ICompany companyTemp = companies.get(cost.indexOf(Collections.min(cost)));
			cheapCompa.add((ICompany) companyTemp.clone());
			cost.clear();
			System.out.println("");
		}

		for (int i = 0; i < cheapCompa.size(); i++) {
			System.out.println(cheapCompa.get(i).getDescript() + " $" + cheapCompa.get(i).calculateCost() + " "
					+ cheapCompa.get(i).getName());
		}

	}

}
