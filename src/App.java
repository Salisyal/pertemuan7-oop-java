import java.util.Scanner;

public class App {

    

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        karyawan newkaryawan = getkaryawanDetails();
        double pfPercentage = getPFPercentage();

        System.out.println();
        System.out.println("Confirm karyawan details: ");
        System.out.println("Id : " + newkaryawan.getkaryawan());
        System.out.println("Name : " + newkaryawan.getkaryawanName());
        System.out.println("Salary : " + newkaryawan.getSalary());

        newkaryawan.calculateNetSalary(pfPercentage);
        System.out.println("Net Salary : " + newkaryawan.getNetSalary());
    }

    public static karyawan getkaryawanDetails() {
        karyawan karyawan = new karyawan();
        System.out.println("Enter Id: ");
        karyawan.setkaryawan(scanner.nextInt());
        System.out.println("Enter Name: ");
        karyawan.setkaryawanName(scanner.next());
        System.out.println("Enter salary: ");
        karyawan.setSalary(scanner.nextDouble());
        return karyawan;
    }

    public static double getPFPercentage(){
        System.out.println("Enter PF percentage:");
        double pfPercentage = scanner.nextDouble();
        return pfPercentage;
    }

}
