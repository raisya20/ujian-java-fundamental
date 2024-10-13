package com.juaracoding.ranujian2jf.ujian2;

public class ATM {
    private int saldo;

    public ATM(int saldoAwal) {
        this.saldo = saldoAwal;
    }

    public int lihatSaldo() {
        return saldo;
    }

    public void setorUang(int jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        } else {
            throw new IllegalArgumentException("Jumlah harus lebih besar dari 0");
        }
    }

    public void tarikUang(int jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
        } else if (jumlah > saldo) {
            throw new IllegalArgumentException("Saldo tidak mencukupi");
        } else {
            throw new IllegalArgumentException("Jumlah harus lebih besar dari 0");
        }
    }
}
