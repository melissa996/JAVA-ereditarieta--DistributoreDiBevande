public class Main {
    public static void main(String[] args) {
        Prodotto [] prodotti = new Prodotto[]{
                new Prodotto("capuccino", 1),
                new Prodotto("caffe", 2),
                new Prodotto("capuccino", 3),
                new Prodotto("caffe", 5),
                new Prodotto("capuccino", 7)
        };

        Caffe caffe = new Caffe("caffe", 0.5);
        Capuccino cappuccino = new Capuccino("capuccino", 0.5);

        DistributoreDiBevande distributoreDiBevande = new DistributoreDiBevande(10);

        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);


        System.out.println(distributoreDiBevande.saldoAttuale() == 0);
        System.out.println(distributoreDiBevande.getResto() == 0);
        distributoreDiBevande.inserisciImporto(0.4);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") == null);
        distributoreDiBevande.inserisciImporto(0.2);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") != null);
        System.out.println(distributoreDiBevande.getResto()-0.10 < 1E-6);
        System.out.println(distributoreDiBevande.saldoAttuale() == 0);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") == null);
        distributoreDiBevande.inserisciImporto(2.0);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") != null);
        System.out.println(distributoreDiBevande.scegliProdotto("cappuccino") != null);
        System.out.println(distributoreDiBevande.scegliProdotto("caffe") != null);
        System.out.println(distributoreDiBevande.saldoAttuale() == 0);
        System.out.println(distributoreDiBevande.getResto()-0.10 < 1E-6);
    }
}