
package lab4b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
        
public class Lab4b {

    public static void main(String[] args) {
        try {
            // Replace "https://example.com" with the URL you want to read from
            URL url = new URL("https://facebook.com");

            // Open a connection to the URL
            URLConnection connection = url.openConnection();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
        }
    }
}
