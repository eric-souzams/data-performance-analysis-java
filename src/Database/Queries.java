package Database;

public class Queries {
    
    public static String queryAleatoria500 = "select data_de_captura from aps limit 500";
    public static String queryAleatoria5000 = "select data_de_captura from aps limit 5000";
    public static String queryAleatoria10000 = "select data_de_captura from aps limit 10000";
    public static String queryAleatoria30000 = "select data_de_captura from aps limit 30000";
    
    public static String queryCrescente500 = "select data_de_captura from aps order by data_de_captura asc limit 500";
    public static String queryCrescente5000 = "select data_de_captura from aps order by data_de_captura asc limit 5000";
    public static String queryCrescente10000 = "select data_de_captura from aps order by data_de_captura asc limit 10000";
    public static String queryCrescente30000 = "select data_de_captura from aps order by data_de_captura asc limit 30000";
    
    public static String queryDecrescente500 = "select data_de_captura from aps order by data_de_captura desc limit 500";
    public static String queryDecrescente5000 = "select data_de_captura from aps order by data_de_captura desc limit 5000";
    public static String queryDecrescente10000 = "select data_de_captura from aps order by data_de_captura desc limit 10000";
    public static String queryDecrescente30000 = "select data_de_captura from aps order by data_de_captura desc limit 30000";
    
}
