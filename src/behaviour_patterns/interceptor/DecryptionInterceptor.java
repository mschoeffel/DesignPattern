package behaviour_patterns.interceptor;

public class DecryptionInterceptor extends Interceptor {
    @Override
    public void handleEvent(OrderContext context) {
        if (context.isDecrypted()) {
            System.out.println("Chiffre: " + context.getOrderData());
            String plainText = decrypt(context.getOrderData());
            context.setOrderData(plainText);
            System.out.println("Plaintext: " + context.getOrderData());
        }
    }

    private String decrypt(String text) {
        //Do decrypt
        return text;
    }
}
