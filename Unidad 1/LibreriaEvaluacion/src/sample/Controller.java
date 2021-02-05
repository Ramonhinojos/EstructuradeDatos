
    public static void main(String[] args) {
//
        a(1);
    }

    public static void a(int n){
        b();
        System.out.println("1" +n);
        b();
        System.out.println("2"+ n);
        if(n!=0){
            a(n-1);
        }
        System.out.println("ANDO EN LA A"+ n);
    }
    public static  void b(){
        System.out.println("ANDO EN LA B");
    }
