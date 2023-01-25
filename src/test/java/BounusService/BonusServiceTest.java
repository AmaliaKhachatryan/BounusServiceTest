package BounusService;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndAboveLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 600;
        boolean registered = false;
        long expected = 6;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 500;
        boolean registered = false;
        long expected = 5;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 500;
        boolean registered = true;
        long expected = 15;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndBelowLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 450;
        boolean registered = true;
        long expected = 13;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredAndBelowLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 450;
        boolean registered = false;
        long expected = 4;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
   }