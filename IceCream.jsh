Scanner sc = new Scanner(System.in);
System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
char flavor = sc.next().charAt(0);
System.out.println("How many scoops would you like?");
int scoops = sc.nextInt();

int pricePerScoop;
switch (flavor) {
    case 'v':
        pricePerScoop = 56;
        break;
    case 'c':
        pricePerScoop = 34;
        break;
    case 's':
        pricePerScoop = 12;
        break;
    default:
        System.out.println("We don't have that flavour.");
        return;
}

if (scoops < 1 || scoops > 3) {
    System.out.println(scoops < 1 ? "We don't sell just a cone." : "That's too many scoops to fit in a cone.");
    return;
}

int totalPrice = 100 + pricePerScoop * scoops;
System.out.printf("That will be %.2f please.", totalPrice / 100.0);
