public class DistributoreDiBevande {
    Prodotto[] prodotti;
    private double importoAttuale;


    public DistributoreDiBevande(int numBevande) {
        prodotti = new Prodotto[numBevande];
        importoAttuale = 0.0;
    }

    public void caricaProdotto(Prodotto prodotto) {
        for (int i = 0; i < prodotti.length; i++) {
            if (prodotti[i] == null) {
                prodotti[i] = prodotto;
                break;
            }
        }
    }


    public Prodotto scegliProdotto (String codice){
        Prodotto prodotto = null;
            for (int i = 0; i < prodotti.length; i++) {
                if (prodotti[i] != null && prodotti[i].getCodice().equals(codice) && prodotti[i].getPrezzo() <= importoAttuale) {

                    importoAttuale -= prodotti[i].getPrezzo();
                    prodotto = prodotti[i];
                    prodotti[i] = null;
                    break;
                }
            }
        return prodotto;
    }


    public double saldoAttuale () {
        return importoAttuale;
        }


    public void inserisciImporto ( double importo){
        importoAttuale += importo;

        }

    public double getResto () {
        double importoTmp = importoAttuale;
        importoAttuale = 0.0; //resetto l'importo
           return importoTmp;
        }

    public void stampaTuttiProdottiCaricati () {
         for(int i=0; i<prodotti.length; i++){
             if(prodotti[i] != null){
                 System.out.println(prodotti[i]);
                }
            }
        }

        public Prodotto[] getProdotti(){
        return prodotti;

        }
    }

