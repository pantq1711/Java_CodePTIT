import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("INSTITUTION.in"));
        Map<String, Institution> institutionMap = new HashMap<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            Institution institution = new Institution(sc.nextLine());
            institutionMap.put(institution.getID(), institution);
        }
        sc.close();

        Scanner sc1 = new Scanner(new File("REGISTER.in"));
        List<Registration> registrations = new ArrayList<>();
        t = Integer.parseInt(sc1.nextLine());
        while (t-- > 0) {
            Registration registration = new Registration(sc1.nextLine());
            for (int i = 0; i < registration.getQuantity(); ++i) {
                String s = sc1.nextLine();
                Registration newRegistration = new Registration(registration.getID() + " " + registration.getQuantity());
                newRegistration.setNameDoi(s);
                if (institutionMap.containsKey(newRegistration.getID())) {
                    newRegistration.setNameINS(institutionMap.get(newRegistration.getID()).getName());
                }
                registrations.add(newRegistration);
            }
        }
        sc1.close();

        Collections.sort(registrations);
        for (Registration registration : registrations) {
            System.out.println(registration);
        }
    }
}