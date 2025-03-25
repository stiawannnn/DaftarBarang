package com.example.daftarbarang.data;

import androidx.room.Embedded;

public class BarangWithKategori {
    @Embedded
    public Barang barang;

    public String namaKategori;
}
