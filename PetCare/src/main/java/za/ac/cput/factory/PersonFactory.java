/* PersonFactory.java
Person factory class
Author: Siyambuka Mbali (230594646)
Date: 23 March 2025
*/

package za.ac.cput.factory;

import za.ac.cput.domain.Person;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Contact;
import za.ac.cput.util.Helper;

public class PersonFactory {
    public static Person createPerson(String name, Contact contact, Address address) {
        if (Helper.isNullOrEmpty(name)) return null;
        if (contact == null) return null;
        if (address == null) return null;

        return new Person.Builder().setName(name)
                .setContact(contact).
                setAddress(address).
                build();
    }

}
