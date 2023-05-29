import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class Main {

  public static void main(String[] args) throws NoSuchAlgorithmException {

    // CODE VERIFIER
    SecureRandom secureRandom = new SecureRandom();
    byte [] code = new byte[32];
    secureRandom.nextBytes(code);
    String codeVerifier = Base64.getUrlEncoder()
        .withoutPadding()
        .encodeToString(code);


    // CODE CHALLENGE

    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
    byte [] digested = messageDigest.digest(codeVerifier.getBytes());
    String codeChallenge = Base64.getUrlEncoder()
        .withoutPadding()
        .encodeToString(digested);

    System.out.println("VERIFIER: " + codeVerifier);
    System.out.println("CHALLENGE: " + codeChallenge);
  }
}
