import java.util.*;
public class ParkTest 
{
	
	private String name;
	private String location;
	private int noOfRides;
	private float price;
	
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	
	void setLocation(String location) {
		this.location = location;
	}
	String getLocation() {
		return location;
	}
	
	void setNoOfRides(int noOfRides) {
		this.noOfRides = noOfRides;
	}
	int getNoOfRides() {
		return noOfRides;
	}
	
	void setPrice(float price) {
		this.price = price;
	}
	float getPrice() {
		return price;
	}


	static Scanner sc = new Scanner(System.in);
	static Set<ParkTest> guns = new TreeSet();
	int id;
	
	void save(ParkTest park) {
		guns.add(park);
	}
	
	void saveAll(Set<ParkTest> al) {
		guns.addAll(al);
	}
	
	void getAll() {
	
		for(ParkTest park : guns) {
			System.out.println("Name: "+park.getName()+"\nLocation: "+park.getLocation()+"\nNo Of Rides: "+park.getNoOfRides()+"\nPrice: "+park.getPrice());
			
		}	
	}
	void getByName(String name) {
		
		for(ParkTest park : guns) {
			if(park.getName().equalsIgnoreCase(name)) {
				System.out.println("Name: "+park.getName()+"\nLocation: "+park.getLocation()+"\nNo Of Rides: "+park.getNoOfRides()+"\nPrice: "+park.getPrice());
				
				return;
			}
		}
		System.out.println("Data not found");
	}
	
	void getByLocation(String loc) {
		
		for(ParkTest park : guns) {
			if(park.getLocation().equalsIgnoreCase(loc)) {
				System.out.println("Name: "+park.getName()+"\nLocation: "+park.getLocation()+"\nNo Of Rides: "+park.getNoOfRides()+"\nPrice: "+park.getPrice());
				
				return;
			}
		}	
		System.out.println("Data not found");
	}
	
	boolean updateByName(String name) {
		for(ParkTest park : guns) {
			if(park.getName().equalsIgnoreCase(name)) {
				guns.remove(park);
				System.out.println("Enter Name: ");
				name = sc.nextLine();
				System.out.println("Enter Location: ");
				String loc = sc.nextLine();
				System.out.println("Enter no of rides: ");
				int noOfRides = sc.nextInt();
				System.out.println("Enter Price: ");
				float price = sc.nextFloat();
				
				park.setName(name);
				park.setLocation(loc);
				park.setNoOfRides(noOfRides);
				park.setPrice(price);
				guns.add(park);
				return true;
			}
		}
		return false;
	}
	
	boolean updateByLocation(String loc) {
		for(ParkTest park : guns) {
			if(park.getLocation().equalsIgnoreCase(loc)) {
				guns.remove(park);
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				System.out.println("Enter Location: ");
				loc = sc.nextLine();
				System.out.println("Enter no of rides: ");
				int noOfRides = sc.nextInt();
				System.out.println("Enter Price: ");
				float price = sc.nextFloat();
				
				park.setName(name);
				park.setLocation(loc);
				park.setNoOfRides(noOfRides);
				park.setPrice(price);
				guns.add(park);
				return true;
			}
		}
		return false;
	}
	
	boolean delete(String name) {
		for(ParkTest park : guns) {
			if(park.getName().equalsIgnoreCase(name)) {
				guns.remove(park);
				return true;
			}
		}
		return false;
	}

	public static void main(String args[])
	{
		ParkTest test = new ParkTest();
		while(true) {
			System.out.println("Enter your choice: ");
			System.out.println("1. Insert One");
			System.out.println("2. Insert Many");
			System.out.println("3. Display By Name");
			System.out.println("4. Display By Location");
			System.out.println("5. Display All");
			System.out.println("6. Update By Name");
			System.out.println("7. Update By Location");
			System.out.println("8. Delete");
			System.out.println("Any Other Number to Quit");
			int choice = sc.nextInt();
			
			if(choice==1) {
				ParkTest park = new ParkTest();
					sc.nextLine();
					System.out.println("Enter Name: ");
					String name = sc.nextLine();
					System.out.println("Enter Location: ");
					String loc = sc.nextLine();
					System.out.println("Enter no of rides: ");
					int noOfRides = sc.nextInt();
					System.out.println("Enter Price: ");
					float price = sc.nextFloat();
					
					park.setName(name);
					park.setLocation(loc);
					park.setNoOfRides(noOfRides);
					park.setPrice(price);
					test.save(park);
			}
			else if(choice == 2) {
				Set<ParkTest> ll = new TreeSet<>();
				System.out.println("Enter number of elements:");
				int n = sc.nextInt();
				for(int i=0;i<n;i++) {
					ParkTest park = new ParkTest();
					sc.nextLine();
					System.out.println("Enter Name: ");
					String name = sc.nextLine();
					System.out.println("Enter Location: ");
					String loc = sc.nextLine();
					System.out.println("Enter no of rides: ");
					int noOfRides = sc.nextInt();
					System.out.println("Enter Price: ");
					float price = sc.nextFloat();
					
					park.setName(name);
					park.setLocation(loc);
					park.setNoOfRides(noOfRides);
					park.setPrice(price);
					ll.add(park);
				}
				test.saveAll(ll);
			}
				
			else if (choice == 3) {
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				test.getByName(name);
			}
			
			else if (choice == 4) {
				System.out.println("Enter Location: ");
				String loc = sc.nextLine();
				test.getByLocation(loc);	
			}
			
			else if(choice == 5) {
				test.getAll();
			}
			
			else if (choice == 6) {
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				boolean flag = test.updateByName(name);
				if(flag)
					System.out.println("Updated Successfully");
				else
					System.out.println("Update Failed");
			}
			else if(choice == 7) {
				sc.nextLine();
				System.out.println("Enter Location: ");
				String loc = sc.nextLine();
				boolean flag = test.updateByLocation(loc);
				if(flag)
					System.out.println("Updated Successfully");
				else
					System.out.println("Update Failed");
			}
			else if(choice == 8) {
				sc.nextLine();
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				boolean flag = test.delete(name);
				if(flag)
					System.out.println("Deleted Successfully");
				else
					System.out.println("Delete Failed");
			}
			else {
				break;
			}
		}
	}
}
