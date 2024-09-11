package com.Faculdade.exercicio_teste_unitario.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

  public Float somaLista(List<Float> numeros) {
    Float sum = 0.00f;
    for (Float num : numeros) {
      sum += num;
    }
    return sum;
  }

  public Float mediaLista(List<Float> numeros) {
    Float sum = 0.00f;
    for (Float num : numeros) {
      sum += num;
    }
    Float media = sum / numeros.size();
    return media;
  }

  public Float[] maiorMenorLista(List<Float> numeros) {
    Float max = numeros.get(0);
    Float min = numeros.get(0);

    for (Float num : numeros) {
      if (num > max) {
        max = num;
      } else if (num < min) {
        min = num;
      }

    }
    return new Float[] { max, min };
  }

  public List<String> contarRepetidos(List<Float> numeros) {
    List<String> repetidos = new ArrayList<>();
    List<Float> verificados = new ArrayList<>();

    for (int i = 0; i < numeros.size(); i++) {
      Float num = numeros.get(i);

      if (!verificados.contains(num)) {
        int count = 0;
        for (Float n : numeros) {
          if (n.equals(num)) {
            count++;
          }
        }
        if (count > 1) {
          repetidos.add(num + " aparece " + count + " vezes");
          verificados.add(num);
        }
      }
    }

    return repetidos;
  }
}
