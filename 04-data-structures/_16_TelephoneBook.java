import java.util.HashMap;

public class _16_TelephoneBook {
    public static void main(String[] args) {
//        # Telephone book
//
//        We are going to represent our contacts in a map where both the keys and
//        values are strings.
//
//        - Create a map with the following key-value pairs:
//
//                  | Name (key)          | Phone number (value) |
//                  | :------------------ | :------------------- |
//                  | William A. Lathan   | 405-709-1865         |
//                  | John K. Miller      | 402-247-8568         |
//                  | Hortensia E. Foster | 606-481-6467         |
//                  | Amanda D. Newland   | 319-243-5613         |
//                  | Brooke P. Askew     | 307-687-2982         |
//
//        - Create an application which prints out the answers to the following questions:
//                - What is John K. Miller's phone number?
//                - Whose phone number is 307-687-2982?
//                - Do we know Chris E. Myers' phone number? (yes/no)
//
//        The full output of your `main` method should be the following:
//                402-247-8568
//                Brooke P. Askew
//                no

        HashMap<String, String> telephoneBook = new HashMap<>();

        telephoneBook.put("William A. Lathan", "405-709-1865");
        telephoneBook.put("John K. Miller", "402-247-8568");
        telephoneBook.put("Hortensia E. Foster", "606-481-6467");
        telephoneBook.put("Amanda D. Newland", "319-243-5613");
        telephoneBook.put("Brooke P. Askew", "307-687-2982");

        System.out.println(telephoneBook.get("John K. Miller"));
        System.out.println(getKey(telephoneBook, "307-687-2982"));
        System.out.println(telephoneBook.containsKey("Chris E. Myers") ? "yes" : "no");
    }

    public static String getKey(HashMap<String, String> telephoneBook, String value) {
        for (String key : telephoneBook.keySet()) {
            if (telephoneBook.get(key).equals(value)) {
                return key;
            }
        }

        return "Not found";
    }
}
