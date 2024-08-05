class WhileDemo {
    public static void main(String[] args){
        long count = 1;
        while (count < 9999999999l) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}