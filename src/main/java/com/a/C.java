package com.a;

import io.restassured.path.json.JsonPath;

public class C {
	public static void main(String[] args) {
		String fis = "{\"dashboard\":{\"purchaseAmount\":40000,\"website\":\"www.testingshastra.com\",\"studentId\":\"911\"},\"courses\":{\"webautomation\":[{\"title\":\"Selenium\",\"price\":4000},{\"title\":\"Cypress\",\"price\":6000},{\"title\":\"Protractor\",\"price\":7000}],\"api\":[{\"title\":\"Rest API\",\"price\":5000},{\"title\":\"Soap UI\",\"price\":6000}],\"MobileAutomation\":[{\"title\":\"C-Test\",\"price\":5000},{\"title\":\"Appium\",\"price\":6000}]}}";
		JsonPath ja = new JsonPath(fis);
		String coursesName[] = { "webautomation", "api", "MobileAutomation" };
		int sum = 0;
		for (int i = 0; i < ja.getInt("courses.size()"); i++) {
			for (int j = 0; j < ja.getInt("courses." + coursesName[i] + ".size()"); j++) {
				sum = sum + ja.getInt("courses." + coursesName[i] + "[" + j + "].price");
			}
			System.out.println("Addition of Courses price:" + sum);
			int getsum = ja.getInt("dashboard.purchaseAmount");
			if (sum == getsum) {
				System.out.println("Addition equals:True");
			} else {
				System.out.println("Addition is not equal");
			}
//			int gotsum = ja.getInt("dashboard.purchaseAmount");
//			if (sum == gotsum) {
//				System.out.println("addition equals :True ");
//			} else {
//				System.out.println("Addition is not equal to actual purchase amount : " + "it is: " + gotsum);
//			}

		}

	}
}
