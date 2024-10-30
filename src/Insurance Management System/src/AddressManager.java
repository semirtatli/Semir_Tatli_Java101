import java.util.ArrayList;

public class AddressManager {



    public static void addAddress(User user, Address address){
        if (user.getAddressList() == null) {
            user.setAddressList(new ArrayList<>());
        }
        user.getAddressList().add(address);
        System.out.println("Address added to " + user.getName() + "'s address list.");
        System.out.println(user.getAddressList().toString());

    }

    public static void removeAddress(User user, Address address){
            if (user.getAddressList() != null && user.getAddressList().contains(address)) {
                user.getAddressList().remove(address);  // Adresi listeden çıkar
                System.out.println("Address removed from " + user.getName() + "'s address list.");
            } else {
                System.out.println("Address not found in " + user.getName() + "'s address list.");
            }
    }
}
