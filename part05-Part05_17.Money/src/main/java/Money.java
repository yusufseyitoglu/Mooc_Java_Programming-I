
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
        int newEuros = euros + addition.euros;
        int newCents = cents + addition.cents;
        if (newCents > 99) {
            newCents = newCents - 100;
            newEuros += 1;
        }
        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        boolean isLessThan = false;
        if ((100 * euros + cents) < (100 * compared.euros() + compared.cents())) {

            isLessThan = true;
        }

        return isLessThan;

    }

    public Money minus(Money decreaser) {

        int newEuros = euros - decreaser.euros;
        int newCents = cents - decreaser.cents;
        if (newCents < 0) {
            newCents += 100;
            newEuros--;


        }
        if (newEuros < 0) {
            return new Money(0 , 0);
        }
        return new Money(newEuros , newCents);
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
