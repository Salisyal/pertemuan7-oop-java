public class karyawan{
    private int karyawan;
    private String karyawanName;
    private double salary;
    private double netSalary;

    public void setkaryawan(int karyawan){
        this.karyawan = karyawan;
    }

    public void setkaryawanName(String karyawanName){
        this.karyawanName = karyawanName;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    private void setNetSalary(double netSalary){
        this.netSalary = netSalary;
    }

    public int getkaryawan(){
        return karyawan;
    }

    public String getkaryawanName(){
        return karyawanName;
    }

    public double getSalary(){
        return salary;
    }

    public double getNetSalary(){
        return netSalary;
    }

    public void calculateNetSalary (double pfPercentage){
        double pfAmount = salary * (pfPercentage / 100);
        double netSalary = salary - pfAmount;
        this.setNetSalary(netSalary);
    }
}