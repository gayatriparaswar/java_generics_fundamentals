package enumwithgenmerics;

public enum EnumWithGenericInterfaceImpl implements EnumWithGenericInterface<Integer> {
    ADDITION {
        @Override
        public Integer calculate(Integer t, Integer a) {
            return t + a;
        }
    },
    SUBTRACTION {
        @Override
        public Integer calculate(Integer t, Integer a) {
            return t - a;
        }
    };
}
