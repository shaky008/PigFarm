package Farm;
import java.util.Scanner;
import java.time.LocalDate;
    public class Farmer {

        static Scanner scanner = new Scanner(System.in);
        static String pigID, pigName, sex, color, feedType, pigList;
        static int day, month, year, binNum;
        static double weight;
        static PigCollection pigCollection = new PigCollection(null);
        static FeedCollection feedCollection = new FeedCollection();

        public static void main(String[] args) {

            // Variables
            int task;

            do {

                taskMenu();

                // Input & Error Checking
                do {
                    while (!scanner.hasNextInt()) {
                        System.out.println("Whoops! Try that again...");
                        System.out.print("Action: ");
                        scanner.nextLine();
                    }
                    task = scanner.nextInt();
                    if (task < 0 || task > 5) {
                        do {
                            System.out.println("******Please select from 1-5. Try again please!!******");
                            System.out.print("Select: ");
                            task = scanner.nextInt();
                        } while (task < 0 || task > 5);
                    }
                } while (task < 0);

                // Menu screen
                switch (task) {
                    case 1:
                        // Create Pig and add it to PigCollection
                        getPigDetail();
                        Pig newPig = new Pig(pigName, color, sex.charAt(0), LocalDate.of(year, month, day), pigID);
                        pigCollection.addPig(newPig);
                        System.out.println("Pig has been added!");
                        System.out.println("Name: " + newPig.getName() + "\nSex: "
                                + newPig.getSex() + "\nColor: " + newPig.getColor() + "\nDate of Birth: " + newPig.getDateOfBirth() + "/nID: " + newPig.getPigID());
                        break;

                    case 2:
//                        enter feed data and add to feedCollection
                        getFeedDetail();
                        Feed newFeed = new Feed(feedType);
                        feedCollection.setFeedlocation(binNum, newFeed);
                        System.out.println("Feed's location:  " + binNum);
                        break;

                    case 3:
//                       feed pigs with each vun
                        if (pigCollection.isEmpty()) {
                            System.out.println("ERROR....No pig detected....please TRY AGAIN!!!");
                        } else {
                            for (int i = 0; i < pigCollection.getPigCount(); i++) {
                                Feed temp = feedCollection.getNextBin();
                                System.out.println(feedCollection.fullBinsNo() + " bin(s) available.");
                                if (temp != null) {
                                    PigCollection.getPigArray()[i].feed(temp);
                                    System.out.println("Bin used!");
                                } else {
                                    System.out.println("Sorry no biin are left. Please add more bins if you want to feed");
                                    break;
                                }
                            }
                        }
                        break;

                    case 4:
//                        show report of our farm
                        System.out.println("There are " + feedCollection.getSize() + " bins left");
                        pigList = pigCollection.getPigList();
                        System.out.println("Total Pigs: " + pigList);
                        break;

                    case 5:
                        // Exit
                        System.out.println("You have exited the program");
                        break;
                }

                System.out.println();

            } while (task != 5);

        }

//         Menu screen
        public static void taskMenu() {
            System.out.println("Please selct one of the below:");
            System.out.println("1.\tAdd Pig \n2. \tAdd Feed\n3. \tFeed Pigs\n4. \tReport\n5. \tExit");
        }

        // Gets input from user about the pig
        public static void getPigDetail() {
            System.out.println("Enter the pig's Name: ");
            pigName = scanner.next();
            System.out.println("What is the Color: ");
            color = scanner.next();
            System.out.println("Enter the pig's gender: ");
            sex = scanner.next();
            System.out.println("Enter the Date of birth (YYYY): ");
            year = scanner.nextInt();
            System.out.println("Date of birth (MM): ");
            month = scanner.nextInt();
            System.out.println("Date of birth (DD): ");
            day = scanner.nextInt();
            System.out.println("Enter the pigs ID: ");
            pigID = scanner.next();
        }

        // Gets input from user about the feed
        public static void getFeedDetail() {
            System.out.println("Number of bin: ");
            binNum = scanner.nextInt();
            System.out.println("Feed type: ");
            feedType = scanner.next();
            System.out.println("Weight (in kg): ");
            weight = scanner.nextDouble();
        }

    }
