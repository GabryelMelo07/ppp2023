package com.junit.negocio;

import java.time.LocalDate;

public class Data {
    public final int dia;
    public final int mes;
    public final int ano;

    public Data() {
        LocalDate data_atual = LocalDate.now();
        this.dia = data_atual.getDayOfMonth();
        this.mes = data_atual.getMonthValue();
        this.ano = data_atual.getYear();
    }

    public Data(Integer num1, int mes, Integer num2) {
        if (num1.toString().length() == 4) {
            this.ano = num1;
            this.dia = num2;
        } else {
            this.dia = num1;
            this.ano = num2;
        }
        this.mes = mes;

        if (this.ano < 1900) throw new IllegalArgumentException(String.format("Ano %d está abaixo do mínimo (1900)", this.ano));
        if (Integer.valueOf(this.dia).toString().length() == 4) throw new IllegalArgumentException("Data ambígua: " + this.toString());
        if (this.mes > 12 || this.mes < 0) throw new IllegalArgumentException("Mês inválido: " + this.mes);
        if (this.dia > getQtdDiasMes(this.mes, this.ano) || this.dia < 0) throw new IllegalArgumentException("Dia inválido: " + this.dia);
    }

    public Data yesterday() {
        return minusDays(1);
    }

    public Data tomorrow() {
        return plusDays(1);
    }

    public Data plusDays(int dias) {
        if (dias == 365) return new Data(this.dia, this.mes, this.ano + 1);

        int diaAux = this.dia;
        int mesAux = this.mes;
        int anoAux = this.ano;
        int diasNoMes = getQtdDiasMes(this.mes, this.ano);

        for (int i = 0; i < dias; i++) {
            diaAux += 1;

            if (diaAux > diasNoMes) {
                diaAux -= diasNoMes;
                mesAux += 1;
                diasNoMes = getQtdDiasMes(mesAux, anoAux);
                if (mesAux > 12) {
                    diaAux = 1;
                    mesAux = 1;
                    anoAux += 1;
                    diasNoMes = getQtdDiasMes(mesAux, anoAux);
                }
            }
        }

        return new Data(diaAux, mesAux, anoAux);
    }
    
    public Data minusDays(int dias) {
        if (dias == 365) return new Data(this.dia, this.mes, this.ano - 1);

        int diaAux = this.dia;
        int mesAux = this.mes;
        int anoAux = this.ano;

        for (int i = 0; i < dias; i++) {
            diaAux -= 1;

            if (diaAux == 0) {
                mesAux -= 1;
                if (mesAux == 0) {
                    mesAux = 12;
                    anoAux -= 1;
                }
                diaAux = getQtdDiasMes(mesAux, anoAux);
            }
        }

        return new Data(diaAux, mesAux, anoAux);
    }

    public boolean before(Data data) {
        if (this.ano < data.ano) {
            return true;
        } else if (this.ano == data.ano && this.mes < data.mes) {
            return true;
        } else if (this.ano == data.ano && this.mes == data.mes && this.dia < data.dia) {
            return true;
        }
        return false;
    }

    public boolean after(Data data) {
        if (this.ano > data.ano) {
            return true;
        } else if (this.ano == data.ano && this.mes > data.mes) {
            return true;
        } else if (this.ano == data.ano && this.mes == data.mes && this.dia > data.dia) {
            return true;
        }
        return false;
    }

    public boolean isBissexto(int ano) {
        return (ano % 4 == 0) && (ano % 100 != 0);
    }

    public int getQtdDiasMes(int mes, int ano) {
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            return 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else if (mes == 2 && !isBissexto(ano)) {
            return 28;
        } else {
            return 29;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (null == obj)
            return false;
        if (obj instanceof Data) {
            Data outraData = (Data) obj;
            return this.dia == outraData.dia && this.mes == outraData.mes && this.ano == outraData.ano;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }
}
