import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface ISavable {

    List<String> write();
    void read(List<String> savedValue);
}
