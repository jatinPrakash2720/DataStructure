public class BitManipulation {
    public static void main(String[] args) {
        int number = 42; // 0b101010

        // Print original number
        System.out.println("Original number: " + Integer.toBinaryString(number));

        // Set a bit at position 1
        int setBitResult = setBit(number, 0);
        System.out.println("Set Bit at position 1: " + Integer.toBinaryString(setBitResult));

        // Clear a bit at position 3
        int clearBitResult = clearBit(number, 3);
        System.out.println("Clear Bit at position 3: " + Integer.toBinaryString(clearBitResult));

        // Toggle a bit at position 3
        int toggleBitResult = toggleBit(number, 3);
        System.out.println("Toggle Bit at position 3: " + Integer.toBinaryString(toggleBitResult));

        // Check if bit at position 1 is set
        boolean isBitSetResult = isBitSet(number, 1);
        System.out.println("Is Bit at position 1 set: " + isBitSetResult);

        // Count the number of set bits
        int countSetBitsResult = countSetBits(number);
        System.out.println("Number of set bits: " + countSetBitsResult);

        // Get the highest one bit
        int highestOneBitResult = highestOneBit(number);
        System.out.println("Highest One Bit: " + Integer.toBinaryString(highestOneBitResult));

        // Get the lowest one bit
        int lowestOneBitResult = lowestOneBit(number);
        System.out.println("Lowest One Bit: " + Integer.toBinaryString(lowestOneBitResult));

        // Get the number of leading zeros
        int numberOfLeadingZerosResult = numberOfLeadingZeros(number);
        System.out.println("Number of Leading Zeros: " + numberOfLeadingZerosResult);

        // Get the number of trailing zeros
        int numberOfTrailingZerosResult = numberOfTrailingZeros(number);
        System.out.println("Number of Trailing Zeros: " + numberOfTrailingZerosResult);
    }

    // Set a bit at the given position
    public static int setBit(int number, int position) {
        return number | (1 << position);
    }

    // Clear a bit at the given position
    public static int clearBit(int number, int position) {
        return number & ~(1 << position);
    }

    // Toggle a bit at the given position
    public static int toggleBit(int number, int position) {
        return number ^ (1 << position);
    }

    // Check if a bit is set at the given position
    public static boolean isBitSet(int number, int position) {
        return (number & (1 << position)) != 0;
    }

    // Count the number of set bits
    public static int countSetBits(int number) {
        return Integer.bitCount(number);
    }

    // Get the highest one bit
    public static int highestOneBit(int number) {
        return Integer.highestOneBit(number);
    }

    // Get the lowest one bit
    public static int lowestOneBit(int number) {
        return Integer.lowestOneBit(number);
    }

    // Get the number of leading zeros
    public static int numberOfLeadingZeros(int number) {
        return Integer.numberOfLeadingZeros(number);
    }

    // Get the number of trailing zeros
    public static int numberOfTrailingZeros(int number) {
        return Integer.numberOfTrailingZeros(number);
    }
}


