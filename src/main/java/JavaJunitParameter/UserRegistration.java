package JavaJunitParameter;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {

        public boolean result;

        public static String patternfirstname="[A-Z]{1}[a-z]{2,}";
        public static String patternlastname="[A-Z]{1}[a-z]{2,}";
        public static String patternemail="^[a-zA-z0-9’*+/=?`{|}~^-]{1,}(?:\\.[a-zA-Z0-9’*+/=?`{|}~^-]+)*@[a-zA-Z0-9]{1,}(?:\\.[a-zA-Z,]{2,6})?(?:\\.[a-zA-Z,]{2,6})?$";
        public static String patterphonenumber="^[0-9]{2}[ ][0-9]{10}$";
        public static String patterpassword="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";

        public boolean validateFirstName(String firstname) {
            Pattern pattern= Pattern.compile(patternfirstname);
            return pattern.matcher(firstname).matches();
        }
        public boolean validateLastName(String lastname)
        {
            Pattern pattern= Pattern.compile(patternlastname);
            return pattern.matcher(lastname).matches();
        }
        public boolean validateEmail(String email)
        {
            Pattern pattern = Pattern.compile(patternemail);
            return pattern.matcher(email).find();
        }
        public boolean validatePhonenumber(String phonenumber) {
            Pattern pattern= Pattern.compile(patterphonenumber);
            return pattern.matcher(phonenumber).find();
        }
        public boolean validatePassword(String password)
        {
            Pattern pattern = Pattern.compile(patterpassword);
            return pattern.matcher(password).matches();
        }

    }
