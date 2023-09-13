package org.example;

class FakePaymentService implements PaymentService {
    @Override
    public boolean processPayment(double amount) {
        return amount <= 100;  // Accepte seulement les paiements de 100 ou moins pour ce fake.
    }
}
