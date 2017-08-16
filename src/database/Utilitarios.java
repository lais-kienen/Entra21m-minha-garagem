package database;

/**
 * @author (name=Laís Kienen, date=08-10-17)
 */
public class Utilitarios {

    public static final int NAO_FOI_POSSIVEL_INSERIR = 0;

    public static final int NAO_FOI_POSSIVEL_ALTERAR = 0;

    public static final int NAO_FOI_POSSIVEL_EXCLUIR = 0;

    public static int retornarNumeroDoMes(String mes) {
        switch (mes) {
            case "Jan":
                return 1;
                
            case "Fev":
                return 2;
                
            case "Mar":
                return 3;
                
            case "Abr":
                return 4;
                
            case "Mai":
                return 5;
                
            case "Jun":
                return 6;
                
            case "Jul":
                return 6;
                
            case "Ago":
                return 6;
                
            case "Set":
                return 6;
                
            case "Out":
                return 6;
                
            case "Nov":
                return 6;
                
            default:
                return 12;
        }
    }
}
