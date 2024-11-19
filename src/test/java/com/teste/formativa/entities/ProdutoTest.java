package com.teste.formativa.entities;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.formativa.entities.Produto;

	class ProdutoTest {

		private Produto Produto;
		
		@BeforeEach
		void setUp() {
			//Arrange
			Produto = new Produto(1L,"Livro","livro fantasia",30.0);
		}
		@Test
		@DisplayName("Testando o getter and setter do Id")
		void testId() {
			//Act
			Produto.setId(2L);
			//Assert
			assertEquals(2L, Produto.getId());
		}
		@Test
		@DisplayName("Testando o getter and setter do Nome")
		void testNome() {
			//Act
			Produto.setNome("Livro");
			//Assert
			assertEquals("Livro", Produto.getNome());
		}
		
		@Test
		@DisplayName("Testando o getter and setter da descricao")
		void testCpf() {
			//Act
			Produto.setDescricao("livro fantasia");
			//Assert
			assertEquals("livro fantasia", Produto.getDescricao());
		}
		@Test
		@DisplayName("Testando o getter and setter do preco")
		void testRg() {
			//Act
			Produto.setPreco(30.0);
			//Assert
			assertEquals(30.0, Produto.getPreco());
		}
		@Test
		@DisplayName("Testando o construtor")
		void testContrutorAll() {
			//Act
			Produto novoProduto = new Produto (1L,"Livro","livro fantasia",30.0);
			assertAll("novoCliente",
					()-> assertEquals(3L, novoProduto.getId()),
					()-> assertEquals("Livro", novoProduto.getNome()),
					()-> assertEquals("Livro romance", novoProduto.getDescricao()),
					()-> assertEquals(30.0, novoProduto.getPreco()));
		}
		
	}