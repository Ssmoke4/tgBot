package ru.skillfactorydemo.tgbot.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import ru.skillfactorydemo.tgbot.entity.Income;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class IncomeRepositoryTest {

    @Autowired
    private IncomeRepository incomeRepository;

    @Test
    public void testDataScript(){
        Optional<Income> income = incomeRepository.findById(345345L);
        assertTrue(income.isPresent());
        assertEquals(new BigDecimal("700"), income.get().getIncome());
    }
}