
import java.io.*;
import java.util.*;

// Bank Account class (represents one account)
class Account {

    int accNo;
    String name;
    double balance;

    // constructor to initialize account details
    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    // convert object to string (for storing in file)
    public String toString() {
        return accNo + "," + name + "," + balance;
    }
}

public class BankApp {

    // file where data is stored
    static final String FILE_NAME = "accounts.txt";

    // ================= CREATE ACCOUNT =================
    static void createAccount() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Account No: ");
            int accNo = sc.nextInt();

            sc.nextLine(); // clear buffer

            System.out.print("Enter Name: ");
            String name = sc.nextLine(); // full name allowed

            System.out.print("Enter Initial Balance: ");
            double balance = sc.nextDouble();

            Account acc = new Account(accNo, name, balance);

            // append data to file
            FileWriter fw = new FileWriter(FILE_NAME, true);
            fw.write(acc.toString() + "\n");
            fw.close();

            System.out.println("Account created successfully");

        } catch (IOException e) {
            System.out.println("Error creating account");
        }
    }

    // ================= VIEW ACCOUNTS =================
    static void viewAccounts() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

            String line;
            System.out.println("\n--- Accounts ---");

            // read file line by line
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length == 3) {
                    System.out.println("AccNo: " + data[0]
                            + " Name: " + data[1]
                            + " Balance: " + data[2]);
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }

    // ================= DEPOSIT =================
    static void deposit() throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account No: ");
        int accNo = sc.nextInt();

        System.out.print("Enter amount to deposit: ");
        double amt = sc.nextDouble();

        File file = new File(FILE_NAME);
        List<String> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        boolean found = false;

        // read all records
        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            if (Integer.parseInt(data[0]) == accNo) {

                double newBal = Double.parseDouble(data[2]) + amt;

                // update balance
                line = data[0] + "," + data[1] + "," + newBal;

                System.out.println("New Balance: " + newBal);
                found = true;
            }

            list.add(line);
        }

        br.close();

        // rewrite file
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (String l : list) {
            bw.write(l);
            bw.newLine();
        }
        bw.close();

        if (!found) {
            System.out.println("Account not found");
        } else {
            System.out.println("Deposit successful");
        }
    }

    // ================= WITHDRAW =================
    static void withdraw() throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account No: ");
        int accNo = sc.nextInt();

        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();

        File file = new File(FILE_NAME);
        List<String> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        boolean found = false;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            if (Integer.parseInt(data[0]) == accNo) {

                double balance = Double.parseDouble(data[2]);

                // check balance
                if (balance >= amt) {

                    double newBal = balance - amt;

                    line = data[0] + "," + data[1] + "," + newBal;

                    System.out.println("New Balance: " + newBal);
                    System.out.println("Withdraw successful");

                } else {
                    System.out.println("Insufficient Balance");
                }

                found = true;
            }

            list.add(line);
        }

        br.close();

        // rewrite file
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (String l : list) {
            bw.write(l);
            bw.newLine();
        }
        bw.close();

        if (!found) {
            System.out.println("Account not found");
        }
    }

    // ================= SEARCH =================
    static void searchAccount() throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account No to search: ");
        int accNo = sc.nextInt();

        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
        String line;
        boolean found = false;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            if (Integer.parseInt(data[0]) == accNo) {

                System.out.println("\nAccount Found:");
                System.out.println("AccNo: " + data[0]
                        + " Name: " + data[1]
                        + " Balance: " + data[2]);

                found = true;
                break;
            }
        }

        br.close();

        if (!found) {
            System.out.println("Account not found");
        }
    }

    // ================= MAIN MENU =================
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Create Account");
            System.out.println("2. View Accounts");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Search Account");
            System.out.println("6. Exit");

            System.out.print("Choose option: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    createAccount();
                    break;

                case 2:
                    viewAccounts();
                    break;

                case 3:
                    deposit();
                    break;

                case 4:
                    withdraw();
                    break;

                case 5:
                    searchAccount();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
