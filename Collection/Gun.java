
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gun {
    String name;
    String materialtype;
    int gunweight;
    String brand;
    long serialNumber;

    static Scanner scanner = new Scanner(System.in);
    static LinkedList<Gun> linkedlist = new LinkedList<>();

    public static void main(String[] args) {
        byte choice;
        char temp;
        do {
            System.out.println(" 1 : To add details of a gun \n  2 : To display details of all guns \n 3: To update gun name \n 4 : To delete details of a gun\n");
            choice = scanner.nextByte();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("Details of how many guns you want to enter??");
                    byte n = scanner.nextByte();
                    scanner.nextLine();
                    if (n == 1) {
                        Gun gun = new Gun();
                        System.out.println("Enter name of the gun");
                        gun.name = scanner.nextLine();
                        System.out.println("Enter materialtype of the gun");
                        gun.materialtype = scanner.nextLine();
                        System.out.println("Enter gunweight of the gun");
                        gun.gunweight = scanner.nextInt();
                        System.out.println("Enter brand of the gun");
                        gun.brand = scanner.nextLine();
                        System.out.println("Enter serial number of the gun");
                        gun.serialNumber = scanner.nextLong();
                        scanner.nextLine();
                        save(gun);
                    } 
                }
                case 2: 
                    getAll();
                case 3:  {
                    System.out.println("Enter To update gun name");
                    updateGunPowder(scanner.nextLine());
                }
                case 4:  {
                    System.out.println("Enter To delete details of a gun");
                    deleteGun(scanner.nextLine());
                }                  
            }

            System.out.println("Enter Y/y to continue or any other character to exit");
            temp = scanner.nextLine().charAt(0);
        } while (temp == 'Y' || temp == 'y');
    }

    static void save(Gun gun) {
    	linkedlist.add(gun);
    }

    static void saveAll(List<Gun> allGuns) {
    	linkedlist.addAll(allGuns);
    }

    static void getAll() {
    	linkedlist.forEach(gun -> System.out.println("Name : " + gun.name + "\tmaterialtype : " + gun.materialtype + "\tgunweight : " + gun.gunweight + "\tbrand : " + gun.brand + "\tSerial number : " + gun.serialNumber
        ));
    }

    static void deleteGun(String name) {
        Gun gun = new Gun();
        for (Gun gun1 : linkedlist) {
            if (gun1.name.equalsIgnoreCase(name)) {
                gun = gun1;
                break;
            }
        }
        linkedlist.remove(gun);
    }

    static void updateGunPowder(String name) {
        Gun gun = new Gun();
        for (Gun gun1 : linkedlist) {
            if (gun1.name.equalsIgnoreCase(name)) {
                gun = gun1;
                break;
            }
        }

      
    }

  
}