package ru.netology.delivery;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {
    private static final Faker faker = new Faker(new Locale("ru"));

    private DataGenerator() {
    }

    public static String generateDate(int days) {
        return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static UserData generateUser() {
        UserData user = new UserData();
        user.setCity(faker.address().city());
        user.setName(faker.name().fullName());
        user.setPhone(faker.phoneNumber().phoneNumber());
        return user;
    }
}