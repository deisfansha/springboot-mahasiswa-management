package com.example.models.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.models.entities.Mahasiswa;

public interface MahasiswaRepo extends CrudRepository<Mahasiswa, Long> {

}
