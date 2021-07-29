package br.com.letscode;

public class Test {

        //Implemente o algoritmo de ordenação Bubble sort para um array de 10 inteiros.

        public static void main(String[] args) {

            //array de exemplo
            int[] arrayOriginal = {3, 1, 9, 12, 2, 32, 5, 6, 104, 53};

            BubbleSort test = new BubbleSort(arrayOriginal);

            test.bSort();

        }

}
