public class Measurements {
    public static void main(String[] args){
        IntegerStack gStack = IntegerStack.create(IntegerStack.Type.GENERIC);
        IntegerStack pStack = IntegerStack.create(IntegerStack.Type.PRIMITIVE);

        measure(gStack);
        measure(pStack);
    }

    private static void measure(IntegerStack stack){
        System.out.println(stack);
        return;
    }
}
