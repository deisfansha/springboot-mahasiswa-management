package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.entities.Mahasiswa;
import com.example.models.repo.MahasiswaRepo;

import jakarta.transaction.Transactional;

// Mendefinisikan bahwa ini adalah kelas service yang akan meng-handle bisnis logic.
@Service
// Menandakan bahwa operasi-operasi dalam kelas ini akan berjalan dalam satu
// transaksi.
@Transactional
public class MahasiswaService {
    // Menginject MahasiswaRepo ke dalam service.
    @Autowired
    private MahasiswaRepo mahasiswaRepo;

    // Method untuk menyimpan entitas Mahasiswa ke dalam database.
    public Mahasiswa save(Mahasiswa mhs) {
        return mahasiswaRepo.save(mhs);
    }

    // Method untuk mendapatkan entitas Mahasiswa berdasarkan ID.
    public Mahasiswa findOne(Long id) {
        // Menggunakan Optional untuk menghindari null pointer jika tidak ditemukan.
        Optional<Mahasiswa> mhs = mahasiswaRepo.findById(id);
        return mhs.get();
    }

    // Method untuk mendapatkan semua entitas Mahasiswa dari database.
    public Iterable<Mahasiswa> findAll() {
        return mahasiswaRepo.findAll();
    }

    // Method untuk menghapus entitas Mahasiswa dari database berdasarkan ID.
    public void removeOne(Long id) {
        mahasiswaRepo.deleteById(id);
    }
}
