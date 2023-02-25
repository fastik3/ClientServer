import java.io.IOException;
public class Client{


        public static void main(String[] args) {
            try (Phone phone = new Phone("127.0.0.1", 8000)){
                System.out.println("Connected to server");

                String reguest = "Visaginas";
                System.out.println("Reguest: " + reguest);
                phone.writeLine(reguest);

                String response = phone.readLine();
                System.out.println("Response: " + response);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
