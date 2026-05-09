class Payment {
    public void pay() {
        System.out.println("Оплата выполнена");
    }

}

class CardPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Оплата картой");
    }
}

class CashPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Оплата наличными");
    }
}

public class practice1 {
    public static void processPayment(Payment payment) {
        payment.pay();
    }
    public static void main(String[] args) {
        Payment card = new CardPayment();
        Payment cash = new CashPayment();

        processPayment(card);
        processPayment(cash);
    }
}