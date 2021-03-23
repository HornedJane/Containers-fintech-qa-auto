public class Main {
    public static void main(final String[] args) {
        Box<Object> destBox1 = new Box<>();
        Box<Apple> srcBox1 = new Box<>();
        srcBox1.put(new Apple());
        BoxUtil.copyFreshFruitFromBoxToBox(srcBox1, destBox1);
        System.out.println(destBox1.get());
    }
}
