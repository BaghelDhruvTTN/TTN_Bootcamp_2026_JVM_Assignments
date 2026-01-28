package solution_6;
class Bank {

    private String name;
    private String headOfficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;

    // Constructor
    public Bank(String name, String headOfficeAddress, String chairmanName,
                int branchCount, double fdInterestRate,
                double personalLoanInterestRate, double homeLoanInterestRate) {
        this.name = name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getHeadOfficeAddress() { return headOfficeAddress; }
    public void setHeadOfficeAddress(String headOfficeAddress) { this.headOfficeAddress = headOfficeAddress; }

    public String getChairmanName() { return chairmanName; }
    public void setChairmanName(String chairmanName) { this.chairmanName = chairmanName; }

    public int getBranchCount() { return branchCount; }
    public void setBranchCount(int branchCount) { this.branchCount = branchCount; }

    public double getFdInterestRate() { return fdInterestRate; }
    public void setFdInterestRate(double fdInterestRate) { this.fdInterestRate = fdInterestRate; }

    public double getPersonalLoanInterestRate() { return personalLoanInterestRate; }
    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() { return homeLoanInterestRate; }
    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    // toString override
    @Override
    public String toString() {
        return "Bank Name: " + name +
                "\nHead Office: " + headOfficeAddress +
                "\nChairman: " + chairmanName +
                "\nBranches: " + branchCount +
                "\nFD Interest Rate: " + fdInterestRate + "%" +
                "\nPersonal Loan Interest Rate: " + personalLoanInterestRate + "%" +
                "\nHome Loan Interest Rate: " + homeLoanInterestRate + "%";
    }
}

class SBI extends Bank {
    public SBI() {
        super("SBI", "Mumbai", "Dinesh Kumar Khara",
              22000, 6.5, 10.5, 8.4);
    }
}
class BOI extends Bank {
    public BOI() {
        super("BOI", "Mumbai", "A. K. Das",
              5100, 6.25, 11.0, 8.6);
    }
}
class ICICI extends Bank {
    public ICICI() {
        super("ICICI", "Mumbai", "Sandeep Bakhshi",
              6000, 7.0, 10.75, 8.75);
    }
}

public class Solution_6 {
    public static void main(String[] args) {

        Bank sbi = new SBI();
        Bank boi = new BOI();
        Bank icici = new ICICI();

        System.out.println(sbi);
        System.out.println("\n-------------------\n");
        System.out.println(boi);
        System.out.println("\n-------------------\n");
        System.out.println(icici);
    }
}