package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderServiceImplTest {

    /**************************************************
     * Test pour Dummy
     **************************************************/
    @Test
    void testOrderServiceWithDummy() {
        PaymentService dummyPaymentService = mock(PaymentService.class);
        OrderService orderService = new OrderServiceImpl(dummyPaymentService);

        // Effectuez votre test sans réelle interaction avec dummyPaymentService
    }

    /**************************************************
     * Test pour Fake
     **************************************************/
    @Test
    void testOrderServiceWithFake() {
        OrderService orderService = new OrderServiceImpl(new FakePaymentService());

        assertTrue(orderService.placeOrder(50.0));  // Devrait réussir avec notre fake
        assertFalse(orderService.placeOrder(150.0)); // Devrait échouer avec notre fake
    }

    /**************************************************
     * Test pour Stub
     **************************************************/
    @Test
    public void testOrderServiceWithStub() {
        PaymentService paymentServiceStub = mock(PaymentService.class);
        when(paymentServiceStub.processPayment(anyDouble())).thenThrow(new RuntimeException("Service down"));

        OrderService orderService = new OrderServiceImpl(paymentServiceStub);

        assertThrows(RuntimeException.class, () -> orderService.placeOrder(100.0));
    }

    /**************************************************
     * Test pour Spy
     **************************************************/
    @Test
    public void testOrderServiceWithSpy() {
        PaymentServiceImpl realPaymentService = new PaymentServiceImpl();
        PaymentService paymentServiceSpy = spy(realPaymentService);
        doReturn(false).when(paymentServiceSpy).processPayment(1000.0); // Substituer le comportement pour un paiement de 1000.0
        OrderService orderService = new OrderServiceImpl(paymentServiceSpy);
        assertFalse(orderService.placeOrder(1000.0)); // Cela devrait retourner false à cause de notre substitution.
        assertTrue(orderService.placeOrder(50.0));    // Cela interagit avec le vrai service, donc ça devrait retourner true.
        verify(paymentServiceSpy, times(1)).processPayment(1000.0);
        verify(paymentServiceSpy, times(1)).processPayment(50.0);
    }

    /**************************************************
     * Test pour Mock
     **************************************************/
    @Test
    public void testOrderServiceWithMock() {
        PaymentService paymentServiceMock = mock(PaymentService.class);
        when(paymentServiceMock.processPayment(anyDouble())).thenReturn(true);
        OrderService orderService = new OrderServiceImpl(paymentServiceMock);
        assertTrue(orderService.placeOrder(100.0));
        verify(paymentServiceMock, times(1)).processPayment(100.0);
    }

}
