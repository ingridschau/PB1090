class Rad {

    int[] verdier = new int[8];
    int sum;

    /** lager raden
     * @param  Hvilken parameter tar den i signaturen 
     * @return      Hvilken verdi blir returnert dersom metoden har en retur type 
     */

    public Rad (int[] verdier){
		for(int i=0;i<verdier.length;i++)
			this.verdier[i] = verdier[i];
		sum = beregnSum();
    }

    /** beregner summen av raden ved å legge sammen verdiene i raden
     * @param  Hvilken parameter tar den i signaturen 
     * @return      summen
     */

    public int beregnSum() {      
        sum = 0;
        for (int j=0; j<verdier.length; j++) {
            sum = sum + verdier[j];
        }
        return sum;
    }

}