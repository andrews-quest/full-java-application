package com.full_app.repositories;

import com.full_app.models.Country;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase()
public class CountryRepositoryTests {

    //Arrange
    @Autowired
    private CountryRepository countryRepository;

    //Act
    @Test
    public void S(){
        Country country = Country.builder()
                .country_name("Germany")
                .country_capital("Berlin")
                .continent("Europe")
                .code("+49")
                .nationality("German")
                .build();

    Country saved_country = countryRepository.save(country);

    //Assert
    Assertions.assertThat(saved_country).isNotNull();
    Assertions.assertThat(saved_country.get_id()).isGreaterThan(0);
    }
}
