public class Card implements ICardValues {
    private int firstValue,secondValue;

    public Card(int firstValue,int secondValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public int getFirstVal() {
        return this.firstValue;
    }

    @Override
    public int getSecondVal() {
        return this.secondValue;
    }

    @Override
    public int getTotalVal() {
        return getFirstVal()+getSecondVal();
    }

    @Override
    public boolean isPair() {
        return getFirstVal()==getSecondVal();
    }
}
