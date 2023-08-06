import java.util.Scanner;

/**
 * CurrencyConverter
 */
public class currency {

    public static void main(String[] args) {
        System.out.println("1 Ruppe");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        System.out.println("4 BritishPound");
        System.out.println("5 AustralianDollar");
        System.out.println("6 Canadian Dollar");
        System.out.println("7 Singapore Dollar");
        System.out.println("8 Swiss Francc");
        System.out.println("9 Malasian Currency");
        System.out.println("10 Japanese Currency");
        System.out.println("11 Chinese Currency");
        // take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the currency");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();
        // convert the amount
        switch (choice) {
            case 1:
                Ruppe_to_other(amount);
                break;
            case 2:
                Dollar_to_other(amount);
                break;
            case 3:
                Euro_to_other(amount);
                break;
            case 4:
                British_to_other(amount);
                break;
            case 5:
                AustralianDollar_to_other(amount);
                break;
            case 6:
                 Canadian_to_other(amount); 
                 break;
            case 7:
                 Singapore_to_other(amount);
                 break;
            case 8:
                 SwissFranc_to_other(amount);
                 break;
            case 9:
                 Malasian_to_other(amount);
                 break;
            case 10:
                 Japanese_to_other(amount);
                 break;
            case 11:
                 Chinese_to_other(amount);
                 break;                                     
            default:
                System.out.println("Invalid choice");
        }

    }

public static void Ruppe_to_other(double amt) {
    System.out.println("1: 1 Ruppe = " + 0.013 + " Dollar");
    System.out.println();

    System.out.println(amt+" Ruppe = " + (amt*0.013) + " Dollar");
    System.out.println();

    System.out.println("2: 1 Ruppe = " + 0.012 + " Euro");
    System.out.println();
    System.out.println(amt+" Ruppe = " + (amt*0.012) + " Euro");
    System.out.println();

    System.out.println("3:  Ruppe = " + 0.009 + " British pound");
    System.out.println();
    System.out.println(amt+" Ruppe = " + (amt*0.009) + " British pound");
    System.out.println();

    System.out.println("4: 1 Ruppe = " + 0.0018 + " Australia Dollar");
    System.out.println();
    System.out.println(amt+" Ruppe = " + (amt*0.0018) + " Australian Dollar");
    System.out.println();

    System.out.println("5: 1 Ruppe = " + 0.0161 + " Canadian Dollar");
    System.out.println();
    System.out.println(amt+" Ruppe = " + (amt*0.0161) + " Canadian Dollar");
    System.out.println();
     
    System.out.println("7: 1 Ruppe = " + 0.0162 + " Singapore Dollar");
    System.out.println();
    System.out.println(amt+" Ruppe = " + (amt*0.0162) + " Singapore Dollar");
    System.out.println();

    System.out.println("8: 1 Ruppe = " + 0.0105 + " Swiss Franc");
    System.out.println();
    System.out.println(amt+" Ruppe = " + (amt*0.0105) + " Swiss Franc");
    System.out.println();

    System.out.println("9: 1 Ruppe = " + 0.055 + " Malasian");
    System.out.println();
    System.out.println(amt+" Ruppe = " + (amt*0.055) + " Malasian");
    System.out.println();

    System.out.println("10: 1 Ruppe = " + 1.714 + " Japanese");
    System.out.println();
    System.out.println(amt+" Ruppe = " + (amt*0.055) + " Japanese");
    System.out.println();

    System.out.println("11: 1 Ruppe = " + 0.0866 + " Chinese");
    System.out.println();
    System.out.println(amt+" Ruppe = " + (amt*0.0866) + " Japanese");
    System.out.println();
    

}

    public static void Dollar_to_other(double amt) {
        System.out.println("1: 1 Dollar = " + 79.37 + " Ruppe");
        System.out.println();
        System.out.println(amt + " Dollar = " + (amt * 79.37) + " Ruppe");
        System.out.println();

        System.out.println("2: 1 Dollar= " + 0.98 + " Euro");
        System.out.println();
        System.out.println(amt + " Dollar = " + (amt * 0.98) + " Euro");
        System.out.println();

        System.out.println("3: 1 Dollar= " + 0.784 + " British Pound");
        System.out.println();
        System.out.println(amt + " Dollar = " + (amt * 0.784) + " British Pound");
        System.out.println();

        System.out.println("4: 1 Dollar= " + 0.1521 + " Australian Dollar");
        System.out.println();
        System.out.println(amt + " Dollar = " + (amt * 0.784) + " Australian Dollar");
        System.out.println();

        System.out.println("5: 1 Dollar= " + 1.337 + " Canadian Dollar");
        System.out.println();
        System.out.println(amt + " Dollar = " + (amt * 1.337) + " Canadian Dollar");
        System.out.println();

        System.out.println("6: 1 Dollar= " + 1.339 + " Singapore Dollar");
        System.out.println();
        System.out.println(amt + " Dollar = " + (amt * 1.339) + " Singapore Dollar");
        System.out.println();

        System.out.println("7: 1 Dollar= " + 0.872 + " Swiss Franc");
        System.out.println();
        System.out.println(amt + " Dollar = " + (amt * 0.872) + " Swiss Franc");
        System.out.println();

        System.out.println("8: 1 Dollar= " + 4.553 + " Malasian");
        System.out.println();
        System.out.println(amt + " Dollar = " + (amt * 4.553) + " Malasian ");
        System.out.println();

        System.out.println("9: 1 Dollar= " + 141.75 + " Japanese");
        System.out.println();
        System.out.println(amt + " Dollar = " + (amt * 141.75) + " japanese ");
        System.out.println();

        System.out.println("10: 1 Dollar= " + 7.169 + " Chinese");
        System.out.println();
        System.out.println(amt + " Dollar = " + (amt * 7.169) + " Chinese ");
        System.out.println();
 }

    public static void Euro_to_other(double amt) {
        System.out.println("1: 1 Euro = " + 80.85 + " Ruppe");
        System.out.println();
        System.out.println(amt + " Euro = " + (amt * 80.85) + " Ruppe");
        System.out.println();

        System.out.println("2: 1 Euro = " + 1.02 + " Dollar");
        System.out.println();
        System.out.println(amt + " Euro = " + (amt * 1.02) + " Dollar");
        System.out.println();

        System.out.println("3: 1 Euro= " + 0.863 + " British pound");
        System.out.println();
        System.out.println(amt + " Euro = " + (amt * 0.863) + " British Pound");
        System.out.println();

        System.out.println("4: 1 Euro= " + 1.675 + " Australian Dollar");
        System.out.println();
        System.out.println(amt + " Euro = " + (amt * 1.675) + " Australian Dollar");
        System.out.println();

        System.out.println("5: 1 Euro= " + 1.473 + " Canadian Dollar");
        System.out.println();
        System.out.println(amt + " Euro = " + (amt * 1.473) + " Canadian Dollar");
        System.out.println();

        System.out.println("6: 1 Euro= " + 1.475 + " Singapore Dollar");
        System.out.println();
        System.out.println(amt + " Euro = " + (amt * 1.475) + " Singapore Dollar");
        System.out.println();

        System.out.println("7: 1 Euro= " + 0.961 + " Swiss Franc");
        System.out.println();
        System.out.println(amt + " Euro = " + (amt * 0.961) + " Swiss Franc");
        System.out.println();

        System.out.println("8: 1 Euro= " + 5.015 + " Malasian");
        System.out.println();
        System.out.println(amt + " Euro = " + (amt * 5.015) + " Malasian ");
        System.out.println();

        System.out.println("9: 1 Euro= " + 156.12 + " Japanese");
        System.out.println();
        System.out.println(amt + " Euro = " + (amt * 156.12) + " japanese ");
        System.out.println();

        System.out.println("10: 1 Euro= " + 7.896 + " Chinese");
        System.out.println();
        System.out.println(amt + " Euro = " + (amt * 7.896) + " Chinese ");
        System.out.println();
    }

   public static void British_to_other(double amt) {

        System.out.println("1: 1 British  = " + 105.40 + " Ruppe");
        System.out.println();
        System.out.println(amt + " British = " + (amt * 105.40) + " Rupee");
        System.out.println();

        System.out.println("2: 1 British = " + 1.274 + " Dollar");
        System.out.println();
        System.out.println(amt + " British = " + (amt * 1.274) + " Dollar");
        System.out.println();

        System.out.println("3: 1 British= " + 1.158 + " Euro");
        System.out.println();
        System.out.println(amt + " British = " + (amt * 1.158) + " Euro");
        System.out.println();

        System.out.println("4: 1 British= " + 1.940 + " Australian Dollar");
        System.out.println();
        System.out.println(amt + " British = " + (amt * 1.940) + " Australian Dollar");
        System.out.println();

        System.out.println("5: 1 British= " + 1.705 + " Canadian Dollar");
        System.out.println();
        System.out.println(amt + " British = " + (amt * 1.705) + " Canadian Dollar");
        System.out.println();

        System.out.println("6: 1 British= " + 1.708 + " Singapore Dollar");
        System.out.println();
        System.out.println(amt + " British = " + (amt * 1.708) + " Singapore Dollar");
        System.out.println();

        System.out.println("7: 1 British= " + 0.112 + " Swiss Franc");
        System.out.println();
        System.out.println(amt + " British= " + (amt * 0.112) + " Swiss Franc");
        System.out.println();

        System.out.println("8: 1 British= " + 5.805 + " Malasian");
        System.out.println();
        System.out.println(amt + " British = " + (amt * 5.805) + " Malasian ");
        System.out.println();

        System.out.println("9: 1 British= " + 180.73 + " Japanese");
        System.out.println();
        System.out.println(amt + " British = " + (amt * 180.73) + " japanese ");
        System.out.println();

        System.out.println("10: 1 British= " + 9.137 + " Chinese");
        System.out.println();
        System.out.println(amt + " British = " + (amt * 9.137) + " Chinese ");
        System.out.println();


   }
   public static void AustralianDollar_to_other(double amt)
   {

        System.out.println("1: 1 Australian Dollar = " + 80.85 + " Ruppe");
        System.out.println();
        System.out.println(amt + " Australian Dollar = " + (amt * 80.85) + " Ruppe");
        System.out.println();

        System.out.println("2: 1 Australian Dollar = " + 1.02 + " Dollar");
        System.out.println();
        System.out.println(amt + " Australian Dollar = " + (amt * 1.02) + " Dollar");
        System.out.println();

        System.out.println("3: 1 Australian Dollar= " + 0.863 + " British pound");
        System.out.println();
        System.out.println(amt + " Australian Dollar = " + (amt * 0.863) + " British Pound");
        System.out.println();

        System.out.println("4: 1 Australian Dollar= " + 1.675 + " Australian Dollar");
        System.out.println();
        System.out.println(amt + " Australian Dollar = " + (amt * 1.675) + " Australian Dollar");
        System.out.println();

        System.out.println("5: 1 Australian Dollar= " + 1.473 + " Canadian Dollar");
        System.out.println();
        System.out.println(amt + " Australian Dollar = " + (amt * 1.473) + " Canadian Dollar");
        System.out.println();

        System.out.println("6: 1 Australian Dollar= " + 1.475 + " Singapore Dollar");
        System.out.println();
        System.out.println(amt + " Australian Dollar = " + (amt * 1.475) + " Singapore Dollar");
        System.out.println();

        System.out.println("7: 1 Australian Dollar= " + 0.961 + " Swiss Franc");
        System.out.println();
        System.out.println(amt + " Australian Dollar = " + (amt * 0.961) + " Swiss Franc");
        System.out.println();

        System.out.println("8: 1 Australian Dollar= " + 5.015 + " Malasian");
        System.out.println();
        System.out.println(amt + " Australian Dollar = " + (amt * 5.015) + " Malasian ");
        System.out.println();

        System.out.println("9: 1 Australian Dollar= " + 156.12 + " Japanese");
        System.out.println();
        System.out.println(amt + " Australian Dollar = " + (amt * 156.12) + " japanese ");
        System.out.println();

        System.out.println("10: 1 Australian Dollar= " + 7.896 + " Chinese");
        System.out.println();
        System.out.println(amt + " Australian Dollar = " + (amt * 7.896) + " Chinese ");
        System.out.println();
    }

   public static void Canadian_to_other(double amt) {

        System.out.println("1: 1 Canadian  = " + 61.79 + " Ruppe");
        System.out.println();
        System.out.println(amt + " Canadian = " + (amt * 61.79) + " Rupee");
        System.out.println();

        System.out.println("2: 1 Canadian = " + 0.747 + " Dollar");
        System.out.println();
        System.out.println(amt + " Canadian = " + (amt * 0.747) + " Dollar");
        System.out.println();

        System.out.println("3: 1 Canadian= " + 0.678 + " Euro");
        System.out.println();
        System.out.println(amt + " Canadian = " + (amt * 0.678) + " Euro");
        System.out.println();

        System.out.println("4: 1 Canadian= " + 1.137 + " Australian Dollar");
        System.out.println();
        System.out.println(amt + " Canadian = " + (amt * 1.137) + " Australian Dollar");
        System.out.println();

        System.out.println("5: 1 Canadian= " + 0.589 + " British Dollar");
        System.out.println();
        System.out.println(amt + " Canadian = " + (amt * 0.586) + " British Dollar");
        System.out.println();

        System.out.println("6: 1 Canadian= " + 1.001 + " Singapore Dollar");
        System.out.println();
        System.out.println(amt + " Canadian = " + (amt * 1.001) + " Singapore Dollar");
        System.out.println();

        System.out.println("7: 1 Canadian= " + 0.652 + " Swiss Franc");
        System.out.println();
        System.out.println(amt + " Canadian= " + (amt * 0.652) + " Swiss Franc");
        System.out.println();

        System.out.println("8: 1 Canadian= " + 3.403 + " Malasian");
        System.out.println();
        System.out.println(amt + " Canadian = " + (amt * 3.403) + " Malasian ");
        System.out.println();

        System.out.println("9: 1 Canadian= " + 105.94 + " Japanese");
        System.out.println();
        System.out.println(amt + " Canadian = " + (amt * 105.94) + " japanese ");
        System.out.println();

        System.out.println("10: 1 Canadian= " + 5.357 + " Chinese");
        System.out.println();
        System.out.println(amt + " Canadian = " + (amt * 5.357) + " Chinese ");
        System.out.println();

   }

    public static void Singapore_to_other(double amt) {

        System.out.println("1: 1 Singapore  = " + 61.79 + " Ruppe");
        System.out.println();
        System.out.println(amt + " Singapore = " + (amt * 61.79) + " Rupee");
        System.out.println();

        System.out.println("2: 1 Singapore = " + 0.747 + " Dollar");
        System.out.println();
        System.out.println(amt + " Singapore = " + (amt * 0.747) + " Dollar");
        System.out.println();

        System.out.println("3: 1 Singapore = " + 0.678 + " Euro");
        System.out.println();
        System.out.println(amt + " Singapore = " + (amt * 0.678) + " Euro");
        System.out.println();

        System.out.println("4: 1 Singapore= " + 1.137 + " Australian Dollar");
        System.out.println();
        System.out.println(amt + " Singapore = " + (amt * 1.137) + " Australian Dollar");
        System.out.println();

        System.out.println("5: 1 Singapore= " + 0.589 + " British Dollar");
        System.out.println();
        System.out.println(amt + " Singapore = " + (amt * 0.586) + " British Dollar");
        System.out.println();

        System.out.println("6: 1 Singapore= " + 1.001 + " Canadian");
        System.out.println();
        System.out.println(amt + " Singapore = " + (amt * 1.001) + " Canadian");
        System.out.println();

        System.out.println("7: 1 Singapore= " + 0.652 + " Swiss Franc");
        System.out.println();
        System.out.println(amt + " Singapore= " + (amt * 0.652) + " Swiss Franc");
        System.out.println();

        System.out.println("8: 1 Singapore= " + 3.403 + " Malasian");
        System.out.println();
        System.out.println(amt + " Singapore = " + (amt * 3.403) + " Malasian ");
        System.out.println();

        System.out.println("9: 1 Singapore= " + 105.94 + " Japanese");
        System.out.println();
        System.out.println(amt + " Singapore = " + (amt * 105.94) + " japanese ");
        System.out.println();

        System.out.println("10: 1 Singapore= " + 5.357 + " Chinese");
        System.out.println();
        System.out.println(amt + " Singapore = " + (amt * 5.357) + " Chinese ");
        System.out.println();

   }
 
   public static void SwissFranc_to_other(double amt) {

        System.out.println("1: 1 SwissFranc  = " + 94.72 + " Ruppe");
        System.out.println();
        System.out.println(amt + " SwissFranc = " + (amt * 94.72) + " Rupee");
        System.out.println();

        System.out.println("2: 1 SwissFranc = " + 1.145 + " Dollar");
        System.out.println();
        System.out.println(amt + " SwissFranc = " + (amt * 1.145) + " Dollar");
        System.out.println();

        System.out.println("3: 1 SwissFranc = " + 1.040 + " Euro");
        System.out.println();
        System.out.println(amt + " SwissFranc = " + (amt * 1.040) + " Euro");
        System.out.println();

        System.out.println("4: 1 SwissFranc= " + 1.742 + " Australian Dollar");
        System.out.println();
        System.out.println(amt + " SwissFranc = " + (amt * 1.742) + " Australian Dollar");
        System.out.println();

        System.out.println("5: 1 SwissFranc= " + 0.898 + " British Dollar");
        System.out.println();
        System.out.println(amt + " SwissFranc = " + (amt * 0.898) + " British Dollar");
        System.out.println();

        System.out.println("6: 1 SwissFranc= " + 1.533 + " Canadian");
        System.out.println();
        System.out.println(amt + " SwissFranc = " + (amt * 1.533) + " Canadian");
        System.out.println();

        System.out.println("7: 1 SwissFranc= " + 1.534 + " Singapore");
        System.out.println();
        System.out.println(amt + " SwissFranc= " + (amt * 1.534) + " Singapore");
        System.out.println();

        System.out.println("8: 1 SwissFranc= " + 5.217 + " Malasian");
        System.out.println();
        System.out.println(amt + " SwissFranc = " + (amt * 5.217) + " Malasian ");
        System.out.println();

        System.out.println("9: 1 SwissFranc= " + 162.42 + " Japanese");
        System.out.println();
        System.out.println(amt + " SwissFranc = " + (amt * 162.42) + " japanese ");
        System.out.println();

        System.out.println("10: 1 SwissFranc= " + 8.214 + " Chinese");
        System.out.println();
        System.out.println(amt + " SwissFranc = " + (amt * 8.214) + " Chinese ");
        System.out.println();

   }

   public static void Malasian_to_other(double amt) {

        System.out.println("1: 1 Malasian  = " + 18.155 + " Ruppe");
        System.out.println();
        System.out.println(amt + " Malasian = " + (amt * 18.155) + " Rupee");
        System.out.println();

        System.out.println("2: 1 Malasian = " + 0.219 + " Dollar");
        System.out.println();
        System.out.println(amt + " Malasian = " + (amt * 0.219) + " Dollar");
        System.out.println();

        System.out.println("3: 1 Malasian = " + 0.199 + " Euro");
        System.out.println();
        System.out.println(amt + " Malasian = " + (amt * 0.199) + " Euro");
        System.out.println();

        System.out.println("4: 1 Malasian= " + 0.334 + " Australian Dollar");
        System.out.println();
        System.out.println(amt + " Malasian = " + (amt * 0.334) + " Australian Dollar");
        System.out.println();

        System.out.println("5: 1 Malasian= " + 0.172 + " British Dollar");
        System.out.println();
        System.out.println(amt + " Malasian = " + (amt * 0.172) + " British Dollar");
        System.out.println();

        System.out.println("6: 1 Malasian= " + 0.293 + " Canadian");
        System.out.println();
        System.out.println(amt + " Malasian = " + (amt * 0.293) + " Canadian");
        System.out.println();

        System.out.println("7: 1 Malasian= " + 0.294 + " Singapore");
        System.out.println();
        System.out.println(amt + " Malasian= " + (amt * 0.294) + " Singapore");
        System.out.println();

        System.out.println("8: 1 Malasian= " + 0.191 + " SwissFranc");
        System.out.println();
        System.out.println(amt + " Malasian = " + (amt * 0.191) + " SwissFranc ");
        System.out.println();

        System.out.println("9: 1 Malasian= " + 31.12 + " Japanese");
        System.out.println();
        System.out.println(amt + " Malasian = " + (amt * 31.12) + " japanese ");
        System.out.println();

        System.out.println("10: 1 Malasian= " + 1.574 + " Chinese");
        System.out.println();
        System.out.println(amt + " Malasian = " + (amt * 1.574) + " Chinese ");
        System.out.println();

   }

   public static void Japanese_to_other(double amt) {

        System.out.println("1: 1 Japanese  = " + 18.155 + " Ruppe");
        System.out.println();
        System.out.println(amt + " Japanese = " + (amt * 18.155) + " Rupee");
        System.out.println();

        System.out.println("2: 1 Japanese = " + 0.219 + " Dollar");
        System.out.println();
        System.out.println(amt + " Japanese = " + (amt * 0.219) + " Dollar");
        System.out.println();

        System.out.println("3: 1 Japanese = " + 0.199 + " Euro");
        System.out.println();
        System.out.println(amt + " Japanese = " + (amt * 0.199) + " Euro");
        System.out.println();

        System.out.println("4: 1 Japanese= " + 0.334 + " Australian Dollar");
        System.out.println();
        System.out.println(amt + " Japanese = " + (amt * 0.334) + " Australian Dollar");
        System.out.println();

        System.out.println("5: 1 Japanese= " + 0.172 + " British Dollar");
        System.out.println();
        System.out.println(amt + " Japanese = " + (amt * 0.172) + " British Dollar");
        System.out.println();

        System.out.println("6: 1 Japanese= " + 0.293 + " Canadian");
        System.out.println();
        System.out.println(amt + " Japanese = " + (amt * 0.293) + " Canadian");
        System.out.println();

        System.out.println("7: 1 Japanese= " + 0.294 + " Singapore");
        System.out.println();
        System.out.println(amt + " Japanese = " + (amt * 0.294) + " Singapore");
        System.out.println();

        System.out.println("8: 1 Japanese= " + 0.191 + " SwissFranc");
        System.out.println();
        System.out.println(amt + " Japanese = " + (amt * 0.191) + " SwissFranc ");
        System.out.println();

        System.out.println("9: 1 Japanese= " + 31.12 + " Malasian");
        System.out.println();
        System.out.println(amt + " Japanese = " + (amt * 31.12) + " malasian ");
        System.out.println();

        System.out.println("10: 1 Japanese= " + 1.574 + " Chinese");
        System.out.println();
        System.out.println(amt + " Japanese = " + (amt * 1.574) + " Chinese ");
        System.out.println();

   }

   public static void Chinese_to_other(double amt) {

        System.out.println("1: 1 Chinese  = " + 11.53 + " Ruppe");
        System.out.println();
        System.out.println(amt + " Chinese = " + (amt * 11.53) + " Rupee");
        System.out.println();

        System.out.println("2: 1 Chinese = " + 0.139 + " Dollar");
        System.out.println();
        System.out.println(amt + " Chinese = " + (amt * 0.139) + " Dollar");
        System.out.println();

        System.out.println("3: 1 Chinese = " + 0.126 + " Euro");
        System.out.println();
        System.out.println(amt + " Chinese = " + (amt * 0.126) + " Euro");
        System.out.println();

        System.out.println("4: 1 Chinese= " + 0.212 + " Australian Dollar");
        System.out.println();
        System.out.println(amt + " Chinese = " + (amt * 0.212) + " Australian Dollar");
        System.out.println();

        System.out.println("5: 1 Chinese= " + 0.109 + " British Dollar");
        System.out.println();
        System.out.println(amt + " Chinese = " + (amt * 0.109) + " British Dollar");
        System.out.println();

        System.out.println("6: 1 Chinese= " + 0.186 + " Canadian");
        System.out.println();
        System.out.println(amt + " Chinese = " + (amt * 0.186) + " Canadian");
        System.out.println();

        System.out.println("7: 1 Chinese= " + 0.294 + " Singapore");
        System.out.println();
        System.out.println(amt + " Chinese = " + (amt * 0.186) + " Singapore");
        System.out.println();

        System.out.println("8: 1 Chinese= " + 0.121 + " SwissFranc");
        System.out.println();
        System.out.println(amt + " Chinese = " + (amt * 0.121) + " SwissFranc ");
        System.out.println();

        System.out.println("9: 1 Chinese= " + 0.635 + " Malasian");
        System.out.println();
        System.out.println(amt + " Chinese = " + (amt * 0.635) + " malasian ");
        System.out.println();

        System.out.println("10: 1 Chinese= " + 19.78 + " Japanese ");
        System.out.println();
        System.out.println(amt + " Chinese = " + (amt * 19.78) + " Japanese ");
        System.out.println();

   }

}
