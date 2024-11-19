package com.example.BaguiDoChoma.repository;

import com.example.BaguiDoChoma.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {

    List<Tarefa> findByStatus(String status);
}

