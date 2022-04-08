import java.io.IOException;
import java.util.*;
// import java.nio.file.Files;
// import java.io.DataOutputStream;
// import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.File;

class Library {
    public String book_name;
    public String author_name;
    public int pages;
    public int price;

}

class elibrary {
    static HashMap<Integer, String> customers = new HashMap<Integer, String>();

    public static void main(String[] args) throws IOException {
        Scanner susan = new Scanner(System.in);
        Library[] array = new Library[100];
        String str1;
        int j = 0, input = 0, count = 0, customercount = 0, delete = 0, update = 0, user = 0;
        String[] a = new String[100];
    //    Creating a file in the specified location.
        try {
            File myObj = new File("E:\\name.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        while (user != 3) {
            System.out.println("1.Librarian 2.Normal User 3.exit");
            user = susan.nextInt();
            if (user == 1) {
                while (input != 7) {
                    FileWriter myWriter = new FileWriter("E:\\name.txt");
                    System.out.printf("\n\nWELCOME TO E-LIBRARY\n");
                    System.out.printf("\n\n1. Add book information\n2. Display book information\n");
                    System.out.printf("3. List all books of given author\n");
                    System.out.printf("4. List the count of books in the library\n");
                    System.out.printf("5. Update information\n");
                    System.out.printf("6. Delete a book\n");
                    System.out.printf("7. Exit");
                    System.out.printf("\n\nEnter one of the above: ");
                    input = susan.nextInt();
                    boolean s = true, h = true;
                    switch (input) {
                        case 1:
                            array[count] = new Library();
                            while (s) {
                                System.out.print("Enter book name : ");
                                String str = susan.next();
                                if ((!str.equals("")) && (str != null) && (str.matches("^[a-zA-Z]*$"))) {
                                    // System.out.print("Enter book name : ");
                                    array[count].book_name = str;
                                    s = false;
                                    break;
                                } else {
                                    System.out.println("Enter a valid book name");
                                    continue;
                                }
                            }
                            while (h) {
                                System.out.print("Enter author name : ");
                                String author = susan.next();
                                if ((!author.equals("")) && (author != null) && (author.matches("^[a-zA-Z]*$"))) {
                                    // System.out.print("Enter author name : ");
                                    array[count].author_name = author;
                                    h = false;
                                    break;
                                } else {
                                    System.out.println("Enter a valid Author name");
                                    continue;
                                }
                            }
                            // System.out.println();
                           
                            boolean g = true, k = true;
                            while (g) {
                                System.out.print("Enter number of pages : ");
                                int pages = susan.nextInt();
                                if (pages > 0) {
                                    array[count].pages = pages;
                                    g = false;
                                } else {
                                    System.out.println("Enter a valid Pages number");
                                }
                            }
                            while (k) {
                                System.out.print("Enter price : ");
                                int price = susan.nextInt();
                                if (price > 0) {
                                    array[count].price = price;
                                    k = false;
                                } else {
                                    System.out.println("Enter a valid Price");
                                }
                            }
                            count++;
                            break;

                        case 2:
                            System.out.print("You have entered the following information \n");
                            for (j = 0; j < count; j++) {
                                if (array[j].book_name.equals(" ") == false) {
                                    System.out.println("book name = " + array[j].book_name);
                                    System.out.println("author name = " + array[j].author_name);
                                    System.out.println("pages = " + array[j].pages);
                                    System.out.println("price = " + array[j].price);
                                }
                            }
                            break;

                        case 3:
                            System.out.print("Enter the author name : ");
                            str1 = susan.next();
                            for (j = 0; j < count; j++) {
                                if (str1.equalsIgnoreCase(array[j].author_name)) {
                                    System.out.println("book name = " + array[j].book_name);
                                    System.out.println("author name = " + array[j].author_name);
                                    System.out.println("pages = " + array[j].pages);
                                    System.out.println("price = " + array[j].price);
                                }
                            }
                            break;

                        case 4:
                            System.out.println("The number of books in the library is " + count);
                            break;

                        case 5:
                            System.out.print("Enter title to update : ");
                            str1 = susan.next();
                            update++;
                            for (j = 0; j < count; j++) {
                                if (str1.equalsIgnoreCase(array[j].book_name)) {
                                    break;
                                }
                            }
                            System.out.println("Enter no to not update a field : ");
                            System.out.print("Enter the book name : ");
                            str1 = susan.next();
                            array[j].book_name = str1.equalsIgnoreCase("no") == true ? array[j].book_name : str1;
                            System.out.print("Enter the author name : ");
                            str1 = susan.next();
                            array[j].author_name = str1.equalsIgnoreCase("no") == true ? array[j].author_name : str1;
                            System.out.println("Enter -1 to not change anything : ");
                            System.out.print("Enter the number of pages : ");
                            // boolean g = true,k =true;
                            int temp1 = susan.nextInt();
                            // while(g){
                            if (temp1 > 0) {
                                array[j].pages = temp1;
                                // g = false;
                            }
                            // }
                            else {
                                array[j].pages = array[j].pages;
                            }
                            System.out.print("Enter the price : ");
                            int temp2 = susan.nextInt();
                            if (temp2 > 0) {
                                array[j].pages = temp1;
                                // g = false;
                            } else {
                                array[j].price = array[j].price;
                            }
                            break;

                        case 6:
                            System.out.print("Enter the title to delete : ");
                            str1 = susan.next();
                            for (j = 0; j < count; j++) {
                                if (str1.equals(array[j].book_name)) {
                                    break;
                                }
                            }
                            delete++;
                            array[j].book_name = " ";
                            break;
                        case 7:
                            for (j = 0; j < count; j++) {
                                if (array[j].book_name.equals(" ")) {
                                    myWriter.write("book Set " + "\n");
                                    myWriter.write("  book Name   :" + array[j].book_name + "\n");
                                    myWriter.write("  author_name :" + array[j].author_name + "\n");
                                    myWriter.write("  pages       :" + array[j].pages + "\n");
                                    myWriter.write("  price       :" + array[j].price + "\n");
                                    a[j] = array[j].book_name;
                                }
                            }
                            System.out.println("Staticstics : Total books  = " + count + " Updated " + update
                                    + " deleted " + delete);
                            sortarray(a, j);
                            printarray(a, j);
                            myWriter.close();
                            break;
                    }
                }
            } else if (user == 2) {
                System.out.println("For New user Enter 1" + "\nAlready an user Enter 2");
                int cust = susan.nextInt();
                int c = 0;
                if (cust == 1) {
                    System.out.println("Enter a Customer ID");
                    System.out.println("Enter a customer name");
                    customers.put(susan.nextInt(), susan.next());
                    System.out.println("Ur registered as customer successfully");
                } else if (cust == 2) {
                    while (c != 1) {
                        System.out.println("Enter your customer id to verify");
                        int id = susan.nextInt();
                        for (Map.Entry<Integer, String> loop : customers.entrySet()) {
                            if (id == loop.getKey()) {
                                System.out.print("welcome back reader");
                                c = 1;
                                break;
                            }
                        }
                    }
                }
                System.out.println(
                        "1.Ask for book \n 2.Search for book \n 3. Rent any book  \n 4. Read any book \n 5 .Delete membership \n 6. Exit");
                int normaluser = susan.nextInt();
                switch (normaluser) {
                    case 1:
                        System.out.println("Enter a Customer Id");
                        System.out.println("Enter a Book Name");

                        String b = susan.next();
                        checkbook(a, j, b);
                        break;
                    case 2:
                        System.out.println("Search for any book");
                        String bb = susan.next();
                        checkbook(a, j, bb);
                        break;
                    case 3:
                        System.out.println("RENT for any book");
                        String bbbb = susan.next();
                        checkbook(a, j, bbbb);
                        break;
                    case 4:
                        System.out.println("READ any book");
                        String bbb = susan.next();
                        checkbook(a, j, bbb);
                        break;
                    case 6:
                        try {
                            File myObj = new File("E:\\customerid.txt");
                            if (myObj.createNewFile()) {
                                System.out.println("File created: " + myObj.getName());
                            } else {
                                System.out.println("File already exists.");
                            }
                        } catch (IOException e) {
                            System.out.println("An error occurred.");
                            e.printStackTrace();
                        }
                        for (int i = 0; i < customercount; i++) {
                            for (Map.Entry<Integer, String> get : customers.entrySet()) {
                                System.out.printf("%-20s%10s", get.getKey(), get.getValue() + "\n");
                            }
                        }
                        FileWriter my = new FileWriter("E:\\customerid.txt");
                        for (int i = 0; i < customercount; i++) {
                            System.out.print("Customer ID  and Customer name");
                            for (Map.Entry<Integer, String> get : customers.entrySet()) {
                                System.out.printf("%-20s%10s", get.getKey(), get.getValue() + "\n");
                                int n = get.getKey();
                                String name = get.getValue();
                                my.write("Customer id " + n + "Customer name " + name);
                            }
                        }
                        my.close();
                        break;
                }
            }
        }
        susan.close();
    }

    public static void checkbook(String[] arr, int len, String h) {
        for (int i = 0; i < len; i++) {
            if (h.equals(arr[i])) {
                System.out.println("You can read ");
            }
        }
    }

    public static void sortarray(String[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isGreat(a[i], a[j])) {
                    swap(a, i, j);
                }
            }
        }
    }

    public static boolean isGreat(String a, String b) {
        for (int i = 0, j = 0; i < a.length() && j < b.length(); j++, i++) {
            if (a.charAt(i) > b.charAt(j)) {
                return true;
            } else if (a.charAt(i) < b.charAt(j)) {
                return false;
            }
        }
        return false;
    }

    public static void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void printarray(String[] arr, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
