package factory;

enum skillEnum{
    JAVA,VB,MYSQL;
}

public class SkillFactory {

    public static Skill getSkill(skillEnum skill){

        switch (skill){
            case JAVA:
                return new Java();
            case VB:
                return new Vb();
            case MYSQL:
                return new Mysql();
            default:
                return null;
        }
    }
}
