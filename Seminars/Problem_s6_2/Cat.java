package Problem_s6_2;

public class Cat {

    int id;
    int age;
    String sex;
    double weight;
    String diagnosis;
    String nickname;
    String nameHolder;

    public Cat (int id, int age, String nickname, String sex, double weight, String diagnosis) {
        this.id = id;
        this.age = age;
        this.nickname = nickname;
        this.sex = sex;
        this.weight = weight;
        this.diagnosis = diagnosis;

    }
    @Override
    public String toString() {
        return String.format("id:%d age:%d nick:%s s:%s w:%.2f d:%s", id, age, nickname, sex, weight, diagnosis);
    }

}
