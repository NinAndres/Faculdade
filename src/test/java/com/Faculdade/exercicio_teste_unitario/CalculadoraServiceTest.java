package com.Faculdade.exercicio_teste_unitario;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Faculdade.exercicio_teste_unitario.service.CalculadoraService;

@SpringBootTest
public class CalculadoraServiceTest {

  @Autowired
  private CalculadoraService service;

  @Test
  @DisplayName("Funcao que testa a implementacao de somar da service")
  public void testSomar() {

    List<Float> numeros = Arrays.asList(1.1f, 2.2f, 3.3f, 4.4f, 5.5f);
    assertEquals(16.5f, service.somaLista(numeros));
    assertNotEquals(10.0f, service.somaLista(numeros));
  }

  @Test
  @DisplayName("Funcao que testa a implementacao de media da service")
  public void testMedia() {
    List<Float> numeros = Arrays.asList(1.1f, 2.2f, 3.3f, 4.4f, 5.5f);
    assertEquals(3.3f, service.mediaLista(numeros));
    assertNotEquals(2.0f, service.mediaLista(numeros));
  }

  @Test
  @DisplayName("Funcao que testa a implementacao de maior e menor da service")
  public void testMaiorEMenor() {
    List<Float> numeros = Arrays.asList(1.1f, 2.2f, 3.3f, 4.4f, 5.5f);
    Float[] resultado = service.maiorMenorLista(numeros);
    assertArrayEquals(new Float[] { 5.5f, 1.1f }, resultado);
    assertNotEquals(new Float[] { 4.4f, 2.2f }, resultado);
  }

  @Test
  @DisplayName("Funcao que testa a implementacao de contar os numeros repetidos da service")
  public void testContarRepetidos() {
    List<Float> numeros = Arrays.asList(1.0f, 2.0f, 3.0f, 2.0f, 4.0f, 1.0f, 5.0f);
    List<String> esperado = Arrays.asList("1.0 aparece 2 vezes", "2.0 aparece 2 vezes");
    List<String> resultado = service.contarRepetidos(numeros);
    assertEquals(esperado, resultado);
  }

}