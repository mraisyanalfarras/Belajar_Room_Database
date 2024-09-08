package com.example.belajarroomdb.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "produk")
public class Produk {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int id;

    @ColumnInfo(name = "nama_barang")
    public String nama;

    @ColumnInfo(name = "deskripsi")
    public String deskripsi;
}
