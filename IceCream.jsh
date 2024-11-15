//Declaring vairables
    //Scanner input = new Scanner(System.in);
    double vanilla = 0.91;
    double chocolate = 0.27;
    double strawberry = 0.02;
    double cone = 1.00;
    double total = 0;
    String flavour= "";
    Integer scoops= 0;
    // while loop to allow user to enter a flovour we have and that they want
    boolean flag = true;
    while (flag) {
      //Asking user choice
      System.out.println(
        "would you like (v)anilla, (c)hocolate or (s)trawberry"
      );
       //flavour = input.nextLine();
      //Checking if Flavoiur is available
      flavour = "v";
      if (flavour.equals("v") || flavour.equals("c") || flavour.equals("s")) {
        flag = false;
      }
      if (!flavour.equals("v") && !flavour.equals("c") && !flavour.equals("s")) {
        System.out.println("We don't have that flavour.Please try agian.");
      }

    }
    flag = true;

    while (flag){
    System.out.println("How many scoops would you like?");
      //String inputLine = input.nextLine();
      //scoops = Integer.parseInt(inputLine);
      scoops= 2;
      if (scoops == 0 ){
        System.out.println("sorry we dont sell just the cone");
      }
      else{
        flag= false;
      }
    }

    
    if (flavour.equals("v")) {
      total = total + (vanilla * scoops);
      total = total + cone;
    } else if (flavour.equals("c")) {
      total = total + (chocolate * scoops);
      total = total + cone;
    } else if (flavour.equals("s")) {
      total = total + (strawberry * scoops);
      total = total + cone;
    }

    System.out.println("this is your total:");
    double roundedValue = Math.round(total * 100.0) / 100.0;
    System.out.println(roundedValue);
  
