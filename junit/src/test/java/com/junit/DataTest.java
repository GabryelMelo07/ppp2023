package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

import com.junit.negocio.Data;

public class DataTest {

    @Test
    public void construtorVazio() {
        Data dataCriada = new Data(); // Construtor vazio é instanciado com a data atual do sistema, portanto deve ser igual ao LocalDate.now().
        LocalDate dataSistema = LocalDate.now();
        assertEquals(dataSistema.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), dataCriada.toString(), "Teste construtor vazio: Data criada não é igual a data local do sistema.");
    }
    
    @Test
    public void dataMinima() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Data(1, 1, 1899);
        });
    }

    @Test
    public void posicaoDoAnoIndiferente() {
        Data data1 = new Data(13, 7, 2016);
        Data data2 = new Data(2016, 7, 13);

        assertTrue(data1.dia == 13);
        assertTrue(data1.mes == 7);
        assertTrue(data1.ano == 2016);

        assertTrue(data2.dia == 13);
        assertTrue(data2.mes == 7);
        assertTrue(data2.ano == 2016);
    }

    @Test
    public void construtoresInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Data(1900, 7, 2016);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Data(16, 7, 1899);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Data(1899, 7, 16);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Data(2016, 13, 16);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Data(2016, 12, 32);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Data(2016, 12, -1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Data(2016, -1, 16);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Data(2016, 2, 30);
        });
    }

    @Test
    public void dataToStringTest() {
        Data data = new Data(5, 5, 2005);
        Data data2 = new Data(1, 10, 2001);
        assertEquals("05/05/2005", data.toString());
        assertEquals("01/10/2001", data2.toString());
    }

    @Test
    public void dataEqualsTest() {
        Data data1 = new Data(1, 7, 2014);
        Data data2 = new Data(1, 7, 2014);

        assertTrue(data1.equals(data2));
        assertFalse(data1.equals(new Data()));
    }

    @Test
    public void dataBeforeAndAfterTest() {
        Data d5 = new Data(1, 7, 2014);
        Data d7 = new Data(23, 4, 2016);

        assertFalse(d5.after(d7));
        assertTrue(d7.after(d5));
        assertTrue(d5.before(d7));
        assertFalse(d7.before(d5));
        assertFalse(d7.before(d7));
        assertFalse(d7.after(d7));
    }

    @Test
    public void dataPlusMinusTomorrowYesterdayTest() {
        Data data = new Data(2016, 4, 22);
        Data data2 = data.yesterday();

        assertTrue(data2.dia == 21);
        assertTrue(data2.mes == 4);
        assertTrue(data2.ano == 2016);

        assertTrue(data.dia == 22);
        assertTrue(data.mes == 4);
        assertTrue(data.ano == 2016);

        data2 = data.tomorrow();
        assertTrue(data2.dia == 23);
        assertTrue(data2.mes == 4);
        assertTrue(data2.ano == 2016);

        Data data3 = data2.plusDays(10);
        assertTrue(data3.dia == 3);
        assertTrue(data3.mes == 5);
        assertTrue(data3.ano == 2016);

        Data data4 = data3.minusDays(10); // TA COM ERRO NO MINUSDAYS
        assertTrue(data4.dia == 23);
        assertTrue(data4.mes == 4);
        assertTrue(data4.ano == 2016);
    }

    @Test
    public void situacoesComplexas() {
        Data data = new Data(20, 2, 2016);
        data = data.plusDays(9);

        assertEquals("29/02/2016", data.toString());

        for (int i = 0; i < 400; i++) {
            data = data.tomorrow();
        }

        assertEquals("04/04/2017", data.toString());

        System.out.println(data.toString());

        data = data.plusDays(365);

        assertEquals("04/04/2018", data.toString());
    }
}
