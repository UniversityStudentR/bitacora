public class Main {

    public static void main(String[] args) {
        int[] lista = {905, 210, 550, 102, 443};

        for (int i = 1; i < lista.length; i++) {
            int j = i;

            while (j > 0) {
                if (lista[j] < lista[j - 1]) {
                    int tem = lista[j];
                    lista[j] = lista[j - 1];
                    lista[j - 1] = tem;

                    j--;
                } else {
                    j = 0;
                }
            }
        }

        for (int numero : lista) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
