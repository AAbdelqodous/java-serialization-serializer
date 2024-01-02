import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) {
        User user = new User(10001L, "Ahmed Abdelqodous", 36);

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("user.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                assert oos != null;
                    oos.close();
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
