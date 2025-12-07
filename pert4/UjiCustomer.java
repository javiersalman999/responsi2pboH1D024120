package pert4;

public class UjiCustomer {
    public static void main(String[] args) {

        Customer cust1 = new Customer("Budi Santoso", "CST-001", 500000);

        Member memb1 = new Member("Siti Aminah", "MBR-110", 
                                  1250000, 240, "Gold");

        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        System.out.println("Status: Customer Biasa");
        cust1.tampilkanInfo();

        System.out.println("\nStatus: Member");
        memb1.tampilkanInfo();
    }
}
