package br.edu.unifacisa.redesocialx.repository;

import br.edu.unifacisa.redesocialx.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    }
