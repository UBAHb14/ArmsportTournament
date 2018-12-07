import java.io.*;

public class FileWork {

void save(Sportsman spList[]) {

    int spListLen = spList.length;
    String str;
    Sportsman ss;
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    try (FileWriter fw = new FileWriter("list.txt")) {

        for (int count = 0; count < spListLen; count++) {
            ss = spList[count];
            str = ss.getName() + "\r\n" + ss.getTeam() + "\r\n" + ss.getWeight();
            fw.write(str);
        }
    } catch(IOException exc) {
        System.out.println("Ошибка ввода-вывода: " + exc);
    }
}
}
