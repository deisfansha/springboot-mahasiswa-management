package com.example.models.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Mendefinisikan bahwa ini adalah sebuah entitas yang akan di-mapped ke tabel dalam database.
@Entity
@Table(name = "tbl_mahasiswa")
public class Mahasiswa implements Serializable {

    // Menandakan bahwa field ini adalah primary key dari entitas.
    @Id
    // Strategi yang digunakan untuk generate nilai id secara otomatis.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Kolom dalam tabel dengan nama "nim", dengan panjang maksimal 20 karakter.
    @Column(name = "nim", length = 20)
    private String nimMahasiswa;

    // Kolom dalam tabel dengan nama "nama_mahasiswa", dengan panjang maksimal 20
    // karakter.
    @Column(name = "nama_mahasiswa", length = 20)
    private String namaMahasiswa;

    // Kolom dalam tabel dengan nama "jurusan", dengan panjang maksimal 20 karakter.
    @Column(name = "jurusan", length = 20)
    private String jurusanMahasiswa;

    // Konstruktor kosong untuk entitas Mahasiswa.
    public Mahasiswa() {

    }

    // Getter dan Setter untuk field id.
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    // Getter dan Setter untuk field nimMahasiswa.
    public String getNimMahasiswa() {
        return nimMahasiswa;
    }

    public void setNimMahasiswa(String nimMahasiswa) {
        this.nimMahasiswa = nimMahasiswa;
    }

    // Getter dan Setter untuk field namaMahasiswa.
    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    // Getter dan Setter untuk field jurusanMahasiswa.
    public String getJurusanMahasiswa() {
        return jurusanMahasiswa;
    }

    public void setJurusanMahasiswa(String jurusanMahasiswa) {
        this.jurusanMahasiswa = jurusanMahasiswa;
    }

}
