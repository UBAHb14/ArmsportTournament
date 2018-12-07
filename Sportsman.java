import java.util.Scanner;

class Sportsman {


//private Sportsman newSportsman = new Sportsman();
private String name;
private String team;
private float weight;

Sportsman() {
    name = "Enter name";
    team = "Enter team";
    weight = 0.0f;
}

void showSportsman() {
    System.out.println("Фамилия: " + this.getName());
    System.out.println("Команда: " + this.getTeam());
    System.out.println("Вес: " + this.getWeight());
}

Sportsman addSportsman() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Добавление участника");

    System.out.println("Введите фамилию: ");
    String tn = sc.nextLine();
    this.setName(tn);

    System.out.println("Введите команду: ");
    tn = sc.nextLine();
    this.setTeam(tn);

    System.out.println("Введите вес: ");
    float tw = sc.nextFloat();
    this.setWeight(tw);

    System.out.println("Спортсмен добавлен");
    this.showSportsman();
    System.out.println();

    return this;
}

private void setName(String name) {
    this.name = name;
}

private void setTeam(String team) {
    this.team = team;
}

private void setWeight(float weight) {
    this.weight = weight;
}

 String getName() {
    return this.name;
}

 String getTeam() {
    return this.team;
}

 float getWeight() {
    return this.weight;
}

}