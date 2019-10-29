import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerCar {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("E:/CarSer/Object_Car.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			// 1st Object of Car
			Car m1 = new Car();

			m1.setName("Maruti 800");
			m1.setMaker("Mohamad Anns");
			m1.setModel(2002);
			m1.setType("Petrol");

			oos.writeObject(m1);
			// -----------------------------------------------
			// 2nd Object of Car
			Car m2 = new Car();

			m2.setName("Maruti 900");
			m2.setMaker("Kumar Sahab");
			m2.setModel(2003);
			m2.setType("Petrol");

			oos.writeObject(m2);
			// -----------------------------------------------
			// 3rd Object of Car
			Car m3 = new Car();

			m3.setName("Maruti 1000");
			m3.setMaker("Ram Kumar Rawani");
			m3.setModel(2004);
			m3.setType("Petrol+CNG");

			oos.writeObject(m3);
			// -----------------------------------------------
			// 4th Object of Car
			Car m4 = new Car();

			m4.setName("Maruti 1001");
			m4.setMaker("Mohan Sharma");
			m4.setModel(2005);
			m4.setType("Petrol+CNG");

			oos.writeObject(m4);
			// -----------------------------------------------
			// 5th Object of Car
			Car m5 = new Car();

			m5.setName("Toyta");
			m5.setMaker("Kumar Sonal");
			m5.setModel(2010);
			m5.setType("Disel");

			oos.writeObject(m5);
			// -----------------------------------------------
			// 5th Object of Car
			Car m6 = new Car();

			m6.setName("Bolero");
			m6.setMaker("Sonu Maloratara");
			m6.setModel(2012);
			m6.setType("Disel");

			oos.writeObject(m6);
			// -----------------------------------------------

			oos.close();

			System.out.println("Enter \n 1= Show All Cars \n 2=Show Cars Which run on Petrol \n 3=Show Car which are Maruti \n 4=Show Cars which are Maruti and Runs in Petrol");
			Scanner sc=new Scanner(System.in);
			int num = sc.nextInt();
			switch (num) {
			case 1:
				// fetch All CARS
				String m11 = m1.getName();
				String m12 = m1.getMaker();
				int m13 = m1.getModel();
				String m14 = m1.getType();
				System.out.println();
				System.out.println("CAR 1");
				System.out.println("Name of CAR is :" + m11);
				System.out.println("Maker of CAR is :" + m12);
				System.out.println("Model of CAR is :" + m13);
				System.out.println("Type of CAR is :" + m14);
				
				String m21 = m2.getName();
				String m22 = m2.getMaker();
				int m23 = m2.getModel();
				String m24 = m2.getType();
				System.out.println();
				System.out.println("CAR 2");
				System.out.println("Name of CAR is :" + m21);
				System.out.println("Maker of CAR is :" + m22);
				System.out.println("Model of CAR is :" + m23);
				System.out.println("Type of CAR is :" + m24);
				
				String m31 = m3.getName();
				String m32 = m3.getMaker();
				int m33 = m3.getModel();
				String m34 = m3.getType();
				System.out.println();
				System.out.println("CAR 3");
				System.out.println("Name of CAR is :" + m31);
				System.out.println("Maker of CAR is :" + m32);
				System.out.println("Model of CAR is :" + m33);
				System.out.println("Type of CAR is :" + m34);
				
				String m41 = m4.getName();
				String m42 = m4.getMaker();
				int m43 = m4.getModel();
				String m44 = m4.getType();
				System.out.println();
				System.out.println("CAR 4");
				System.out.println("Name of CAR is :" + m41);
				System.out.println("Maker of CAR is :" + m42);
				System.out.println("Model of CAR is :" + m43);
				System.out.println("Type of CAR is :" + m44);
				
				String m51 = m5.getName();
				String m52 = m5.getMaker();
				int m53 = m5.getModel();
				String m54 = m5.getType();
				System.out.println();
				System.out.println("CAR 5");
				System.out.println("Name of CAR is :" + m51);
				System.out.println("Maker of CAR is :" + m52);
				System.out.println("Model of CAR is :" + m53);
				System.out.println("Type of CAR is :" + m54);
				
				String m61 = m6.getName();
				String m62 = m6.getMaker();
				int m63 = m6.getModel();
				String m64 = m1.getType();
				System.out.println();
				System.out.println("CAR 6");
				System.out.println("Name of CAR is :" + m61);
				System.out.println("Maker of CAR is :" + m62);
				System.out.println("Model of CAR is :" + m63);
				System.out.println("Type of CAR is :" + m64);
				break;
			case 2:
				String m111 = m1.getName();
				String m112 = m1.getMaker();
				int m113 = m1.getModel();
				String m114 = m1.getType();
				System.out.println();
				System.out.println("CAR 1");
				System.out.println("Name of CAR is :" + m111);
				System.out.println("Maker of CAR is :" + m112);
				System.out.println("Model of CAR is :" + m113);
				System.out.println("Type of CAR is :" + m114);
				
				String m211 = m2.getName();
				String m212 = m2.getMaker();
				int m213 = m2.getModel();
				String m214 = m2.getType();
				System.out.println();
				System.out.println("CAR 2");
				System.out.println("Name of CAR is :" + m211);
				System.out.println("Maker of CAR is :" + m212);
				System.out.println("Model of CAR is :" + m213);
				System.out.println("Type of CAR is :" + m214);
				break;
			case 3:
				String m121 = m1.getName();
				String m122 = m1.getMaker();
				int m123 = m1.getModel();
				String m124 = m1.getType();
				System.out.println();
				System.out.println("CAR 1");
				System.out.println("Name of CAR is :" + m121);
				System.out.println("Maker of CAR is :" + m122);
				System.out.println("Model of CAR is :" + m123);
				System.out.println("Type of CAR is :" + m124);
				
				String m221 = m2.getName();
				String m222 = m2.getMaker();
				int m223 = m2.getModel();
				String m224 = m2.getType();
				System.out.println();
				System.out.println("CAR 2");
				System.out.println("Name of CAR is :" + m221);
				System.out.println("Maker of CAR is :" + m222);
				System.out.println("Model of CAR is :" + m223);
				System.out.println("Type of CAR is :" + m224);
				
				String m321 = m3.getName();
				String m322 = m3.getMaker();
				int m323 = m3.getModel();
				String m324 = m3.getType();
				System.out.println();
				System.out.println("CAR 3");
				System.out.println("Name of CAR is :" + m321);
				System.out.println("Maker of CAR is :" + m322);
				System.out.println("Model of CAR is :" + m323);
				System.out.println("Type of CAR is :" + m324);
				
				String m421 = m4.getName();
				String m422 = m4.getMaker();
				int m423 = m4.getModel();
				String m424 = m4.getType();
				System.out.println();
				System.out.println("CAR 4");
				System.out.println("Name of CAR is :" + m421);
				System.out.println("Maker of CAR is :" + m422);
				System.out.println("Model of CAR is :" + m423);
				System.out.println("Type of CAR is :" + m424);
				break;
			case 4:
				String m131 = m1.getName();
				String m132 = m1.getMaker();
				int m133 = m1.getModel();
				String m134 = m1.getType();
				System.out.println();
				System.out.println("CAR 1");
				System.out.println("Name of CAR is :" + m131);
				System.out.println("Maker of CAR is :" + m132);
				System.out.println("Model of CAR is :" + m133);
				System.out.println("Type of CAR is :" + m134);
				
				String m231 = m2.getName();
				String m232 = m2.getMaker();
				int m233 = m2.getModel();
				String m234 = m2.getType();
				System.out.println();
				System.out.println("CAR 2");
				System.out.println("Name of CAR is :" + m231);
				System.out.println("Maker of CAR is :" + m232);
				System.out.println("Model of CAR is :" + m233);
				System.out.println("Type of CAR is :" + m234);
				
				break;
				

			default:
				break;
			}
			

			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
