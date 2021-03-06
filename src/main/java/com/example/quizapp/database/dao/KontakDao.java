package com.example.quizapp.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Query;

import com.example.quizapp.database.entitas.Kontak;

import java.util.List;

@Dao
public interface KontakDao {

    @Query("SELECT * FROM kontak")
    List<Kontak> getAll();

    @Query("INSERT INTO kontak (name, nohp) VALUES(:name, :nohp)")
    void inserAll(String name, String nohp);

    @Delete
    void delete(Kontak kontak);
}
