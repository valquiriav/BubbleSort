package br.com.letscode;

import java.util.Arrays;

    public class BubbleSort {

        int[] arrayOriginal;

        public BubbleSort(int[] arrayOriginal) {
            this.arrayOriginal = arrayOriginal;
        }

        public void bSort(){
            //variável de referência
            int ref;

            //for externo: faz diversas rodadadas de comparação
            for (int i = 0; i < arrayOriginal.length; i++) {
                //for interno: compara todos os pares
                for (int j = 1; j < arrayOriginal.length; j++) {
                    //estabelece a referência
                    ref = arrayOriginal[j];
                    if (ref < arrayOriginal[j - 1]) {
                        //troca a posição dos números
                        arrayOriginal[j] = arrayOriginal[j - 1];
                        arrayOriginal[j - 1] = ref;
                    }
                }
            }

            //imprime a array, agora ordenada
            System.out.println(Arrays.toString(arrayOriginal));
        }

    }