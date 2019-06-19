package verhaltensmuster.interceptor;

public class EntschluesselungInterceptor extends Interceptor {
    @Override
    public void handleEvent(BestellContext context) {
        if(context.isVerschluesselt()){
            System.out.println("Chiffre: " + context.getBestelldaten());
            String klartext = entschluessle(context.getBestelldaten());
            context.setBestelldaten(klartext);
            System.out.println("Klartext: " + context.getBestelldaten());
        }
    }

    private String entschluessle(String text){
        //Entschluesseln
        return text;
    }
}
