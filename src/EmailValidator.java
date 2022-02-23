public class EmailValidator {
  public boolean validateEmail(String email) {
    return email.contains("@") && email.contains(".");

}}
