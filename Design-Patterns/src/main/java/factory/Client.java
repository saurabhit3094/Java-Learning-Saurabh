package factory;

public class Client {

    public static void main(String[] args) {
        SkillFactory.getSkill(skillEnum.JAVA).display();
    }
}
