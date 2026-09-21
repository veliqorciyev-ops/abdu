package urok5LogicOperator;

public class AccesControl {
    public static void main(String[] args) {
        boolean hasKeycard=true;
          boolean knowPassword=false;
            boolean isAdmin=true;
            boolean canEnterStandard= hasKeycard && knowPassword;
        System.out.println("Обычный доступ(карта и пароль):"+canEnterStandard);
        boolean canEnterEmergency = hasKeycard || isAdmin;
        System.out.println("Аварийный доступ(карта ИЛИ админ):"+canEnterEmergency);
        boolean isAccesRestricted =!canEnterStandard;
        System.out.println("Доступ ограничен(Не обычный доступ):"+isAccesRestricted);
    }
}
