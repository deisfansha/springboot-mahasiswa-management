package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.entities.Mahasiswa;
import com.example.services.MahasiswaService;
import org.springframework.web.bind.annotation.PutMapping;

// Mendefinisikan bahwa ini adalah kelas yang bertindak sebagai RESTful Controller.
@RestController
// Mengizinkan cross-origin requests dari beberapa origins.
@CrossOrigin(origins = { "http://localhost:8000", "http://127.0.0.1:5173", "http://localhost:5173/" })
// Mapping URL awal untuk endpoint yang dihandle oleh kelas ini.
@RequestMapping("api/mahasiswa")
public class MahasiswaController {
    // Menginject MahasiswaService ke dalam controller.
    @Autowired
    private MahasiswaService mahasiswaService;

    // Menghandle HTTP POST request untuk membuat entitas Mahasiswa baru.
    @PostMapping
    public Mahasiswa create(@RequestBody Mahasiswa mhs) {
        return mahasiswaService.save(mhs);
    }

    // Menghandle HTTP GET request untuk mendapatkan semua entitas Mahasiswa.
    @GetMapping
    public Iterable<Mahasiswa> findAll() {
        return mahasiswaService.findAll();
    }

    // Menghandle HTTP GET request untuk mendapatkan entitas Mahasiswa berdasarkan
    // ID.
    @GetMapping("/{id}")
    public Mahasiswa findOne(@PathVariable("id") Long id) {
        return mahasiswaService.findOne(id);
    }

    // Menghandle HTTP PUT request untuk mengupdate entitas Mahasiswa berdasarkan
    // ID.
    @PutMapping("/{id}")
    public Mahasiswa Update(@RequestBody Mahasiswa mhs, @PathVariable("id") Long id) {
        // TODO: Proses request PUT
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setId(id);
        mahasiswa.setNimMahasiswa(mhs.getNimMahasiswa());
        mahasiswa.setNamaMahasiswa(mhs.getNamaMahasiswa());
        mahasiswa.setJurusanMahasiswa(mhs.getJurusanMahasiswa());

        return mahasiswaService.save(mahasiswa);
    }

    // Menghandle HTTP DELETE request untuk menghapus entitas Mahasiswa berdasarkan
    // ID.
    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id) {
        mahasiswaService.removeOne(id);
    }
}
