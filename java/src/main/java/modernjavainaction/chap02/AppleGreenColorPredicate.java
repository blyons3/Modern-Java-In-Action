package modernjavainaction.chap02;

public class AppleGreenColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor() == Color.GREEN;
    }

}