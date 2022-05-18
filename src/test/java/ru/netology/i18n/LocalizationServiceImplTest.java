package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

public class LocalizationServiceImplTest {
    @Test
    void localeTest() {
        String msg = "Добро пожаловать";
        Country country = Country.RUSSIA;
        LocalizationService loc = new LocalizationServiceImpl();
        final String msg_checked = loc.locale(country);
        Assertions.assertEquals(msg, msg_checked);
    }
}
