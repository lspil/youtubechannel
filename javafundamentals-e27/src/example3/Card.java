package example3;

public class Card {

    private String number; // 12345

    public Card(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;

        if (o instanceof Card) {
            Card c = (Card) o;
            return c.getNumber().equals(this.number);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
