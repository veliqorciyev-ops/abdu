package urok8Loops2;

public class GameMenu {
    public static void main(String[] args) {
        String menu="setiings";
        String option="sound";
        switch (menu) {
            case "play":
                System.out.println("Game started");
                break;
            case "settings":
                System.out.println("Settings opened");
                switch (option) {
                    case "sound":
                        System.out.println("Sound settings");
                        break;
                    case "graphics":
                        System.out.println("Graphics settings");
                        break;
                    case "controls":
                        System.out.println("Controls settings");
                        break;
                    default:
                        System.out.println("Неизвестная опция");
                        break;
                }
                break;
            case "exit":
                System.out.println("Game closed");
                break;
            default:
                System.out.println("Неизвестное меню");
                break;
        }
    }
    }

