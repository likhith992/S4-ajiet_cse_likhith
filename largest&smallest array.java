class Main {
    public static void main(String[] args) {
        int[] number={45,12,-85,32,67,78,89};
        if(number.length==0){
            System.out.println("the array is empty");
            return;
        }
        int largest=number[0];
        int smallest=number[0];
        for(int i=0;i<number.length;i++){
            if(number[i]>largest)
            largest=number[i];
            if(number[i]<smallest)
            smallest=number[i];
        }
        System.out.println(largest+"   "+smallest);
        }
}
