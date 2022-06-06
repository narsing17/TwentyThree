package com.userentrytest;
import static org.junit.Assert.assertEquals;

import com.parametrizedtest.ValidateUserEntry;
import org.junit.Test;

public class UserEntryTest {

    @Test
    public void userTest() {
        ValidateUserEntry userEntry = new ValidateUserEntry();
        assertEquals("Priyanka", userEntry.firstName("Priyanka"));
        assertEquals("Singh", userEntry.lastName("Singh"));
        assertEquals("5646564648", userEntry.contactNumber("82433015215"));
        assertEquals("abc.abcd@bl.co.go", userEntry.contactNumber("abc.abcd@bl.co.go"));
    }
}
